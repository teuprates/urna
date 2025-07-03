package controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import database.MongoConnection;
import model.Candidato;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.view.Urna;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UrnaController {
    private List<Candidato> candidatos;
    private Urna urna;
    private String numeroDigitado = "";

    public UrnaController() {
        this.candidatos = carregarCandidatosDoMongo();
        iniciarUrna();
    }

    private List<Candidato> carregarCandidatosDoMongo() {
        List<Candidato> lista = new ArrayList<>();
        MongoDatabase db = MongoConnection.getDatabase();
        MongoCollection<Document> collection = db.getCollection("candidato");

        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String nome = doc.getString("Nome");
                String numero = doc.getString("Numero");
                String partido = doc.getString("Partido");
                int votos = doc.getInteger("Votos", 0);

                Candidato candidato = new Candidato(nome, numero, partido);
                candidato.setVotos(votos);
                lista.add(candidato);
            }
        }

        return lista;
    }

    private void iniciarUrna() {
        urna = new Urna();
        configurarBotoes();
        urna.setVisible(true);
    }

    private void configurarBotoes() {
        urna.getBtn0().addActionListener(e -> adicionarNumero("0"));
        urna.getBtn1().addActionListener(e -> adicionarNumero("1"));
        urna.getBtn2().addActionListener(e -> adicionarNumero("2"));
        urna.getBtn3().addActionListener(e -> adicionarNumero("3"));
        urna.getBtn4().addActionListener(e -> adicionarNumero("4"));
        urna.getBtn5().addActionListener(e -> adicionarNumero("5"));
        urna.getBtn6().addActionListener(e -> adicionarNumero("6"));
        urna.getBtn7().addActionListener(e -> adicionarNumero("7"));
        urna.getBtn8().addActionListener(e -> adicionarNumero("8"));
        urna.getBtn9().addActionListener(e -> adicionarNumero("9"));
    }

    private void adicionarNumero(String numero) {
        if (numeroDigitado.length() < 5) {
            numeroDigitado += numero;
            atualizarCaixas(numeroDigitado);
        }
    }

    private void atualizarCaixas(String numero) {
        if (numero.length() > 0) urna.getCaixaNumero1().setText(numero.substring(0, 1));
        if (numero.length() > 1) urna.getCaixaNumero2().setText(numero.substring(1, 2));
        if (numero.length() > 2) urna.getCaixaNumero3().setText(numero.substring(2, 3));
        if (numero.length() > 3) urna.getCaixaNumero4().setText(numero.substring(3, 4));
        if (numero.length() > 4) urna.getCaixaNumero5().setText(numero.substring(4, 5));
    }

    public static void main(String[] args) {
        new UrnaController();
    }
}
