package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import database.MongoDB; 
import model.Voto;
import org.bson.Document;

//DAO para operações com votos no MongoDB

public class VotoDAO {
    private final MongoCollection<Document> collection;

    
     //Inicializa o DAO obtendo a coleção de votos do banco de dados
     
    public VotoDAO() {
        MongoDatabase database = MongoDB.getDatabase();
        this.collection = database.getCollection("votos");
    }

     //Registra um novo voto no banco de dados
     //@param voto Objeto Voto contendo os dados a serem persistidos
     
    public void registrarVoto(Voto voto) {
        Document doc = new Document()
                .append("numeroVotado", voto.getNumeroVotado())
                .append("branco", voto.isBranco())
                .append("nulo", voto.isNulo())
                .append("horario", voto.getHorario().toString())
                .append("cargo", "Vereador"); // Adicione o cargo conforme necessário
        
        collection.insertOne(doc);
    }
     
}