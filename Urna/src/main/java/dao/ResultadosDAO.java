package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import database.MongoDB;
import org.bson.Document;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ResultadosDAO {
    private final MongoCollection<Document> votosCollection;
    private final DecimalFormat df = new DecimalFormat("0.00");

    public ResultadosDAO() {
        MongoDatabase database = MongoDB.getDatabase();
        this.votosCollection = database.getCollection("votos");
    }

    public String gerarRelatorio() {
        try {
            // Contagem total de documentos na coleção
            long totalVotos = votosCollection.countDocuments();
            
            if (totalVotos == 0) {
                return "Nenhum voto registrado até o momento";
            }

            StringBuilder relatorio = new StringBuilder();
            relatorio.append("=== RESULTADO FINAL DA ELEIÇÃO ===\n\n");
            relatorio.append("Total de votos computados: ").append(totalVotos).append("\n\n");

            // Votos brancos
            long brancos = votosCollection.countDocuments(
                new Document("branco", true));
            relatorio.append("Votos em Branco: ")
                    .append(brancos).append(" (")
                    .append(formatarPercentual(brancos, totalVotos)).append(")\n");

            // Votos nulos
            long nulos = votosCollection.countDocuments(
                new Document("nulo", true).append("branco", false));
            relatorio.append("Votos Nulos: ")
                    .append(nulos).append(" (")
                    .append(formatarPercentual(nulos, totalVotos)).append(")\n\n");

            // Votos válidos por candidato
            relatorio.append("Votos Válidos por Candidato:\n");
            
            // Agregação para contar votos por candidato
            votosCollection.aggregate(Arrays.asList(
                Aggregates.match(Filters.and(
                    Filters.eq("branco", false),
                    Filters.eq("nulo", false)
                )),
                Aggregates.group("$numeroVotado", 
                    Accumulators.sum("total", 1))
            )).forEach(doc -> {
                String numero = doc.getString("_id");
                long count = doc.getInteger("total");
                relatorio.append("- Candidato ").append(numero).append(": ")
                        .append(count).append(" votos (")
                        .append(formatarPercentual(count, totalVotos)).append(")\n");
            });

            return relatorio.toString();
            
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao gerar relatório: " + e.getMessage();
        }
    }

    private String formatarPercentual(long parcial, long total) {
        return df.format((parcial * 100.0) / total) + "%";
    }
}