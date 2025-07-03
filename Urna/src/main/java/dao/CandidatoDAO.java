package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import database.MongoDB;
import model.Candidato;
import org.bson.Document;

public class CandidatoDAO {
    private final MongoCollection<Document> collection;

    public CandidatoDAO() {
        MongoDatabase database = MongoDB.getDatabase();
        this.collection = database.getCollection("candidato"); // atenção ao nome da coleção
    }

    public Candidato buscarPorNumero(String numero) {
        Document doc = collection.find(Filters.eq("Numero", numero)).first();

        if (doc != null) {
            String nome = doc.getString("Nome");
            String partido = doc.getString("Partido");
            int votos = doc.getInteger("Votos");
            String foto = doc.getString("foto"); // se tiver o campo foto
            return new Candidato(numero, nome, partido, foto);
        }
        return null;
    }

    public void confirmarVoto(String numero) {
        collection.updateOne(
            Filters.eq("Numero", numero),
            new Document("$inc", new Document("Votos", 1))
        );
    }
}
