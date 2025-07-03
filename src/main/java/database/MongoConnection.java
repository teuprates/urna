package database;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
    private static final String URI = "mongodb://localhost:27017"; // ajuste se necessário

    public static MongoDatabase getDatabase() {
        MongoClient client = MongoClients.create(URI);
        return client.getDatabase("urnaDB"); // nome do seu banco
    }
}
