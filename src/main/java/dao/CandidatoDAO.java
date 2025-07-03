package dao;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import model.Candidato;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class CandidatoDAO {

    private final MongoCollection<Document> collection;

    public CandidatoDAO() {
        MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = client.getDatabase("urna");
        collection = database.getCollection("candidatos");
    }

    public void inserirCandidato(Candidato candidato) {
        Document doc = new Document("numero", candidato.getNumero())
                .append("nome", candidato.getNome())
                .append("partido", candidato.getPartido())
                .append("foto", candidato.getFoto());

        collection.insertOne(doc);
    }

    public List<Candidato> buscarTodos() {
        List<Candidato> candidatos = new ArrayList<>();
        for (Document doc : collection.find()) {
            candidatos.add(new Candidato(
                    doc.getString("numero"),
                    doc.getString("nome"),
                    doc.getString("partido"),
                    doc.getString("foto")
            ));
        }
        return candidatos;
    }

    public Candidato buscarPorNumero(String numero) {
        Document doc = collection.find(Filters.eq("numero", numero)).first();
        if (doc != null) {
            return new Candidato(
                    doc.getString("numero"),
                    doc.getString("nome"),
                    doc.getString("partido"),
                    doc.getString("foto")
            );
        }
        return null;
    }

    public boolean estaVazio() {
        return collection.countDocuments() == 0;
    }
}
    