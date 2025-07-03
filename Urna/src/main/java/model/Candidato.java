package model;

public class Candidato {
    private String numero;
    private String nome;
    private String partido;
    private String foto;

    // Construtor
    public Candidato(String numero, String nome, String partido, String foto) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
        this.foto = foto;
    }

    // Getters
    public String getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPartido() {
        return this.partido;
    }

    public String getFoto() {
        return this.foto;
    }

    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    // Representação textual do candidato (útil para debug)
    @Override
    public String toString() {
        return "Candidato{" +
                "numero='" + numero + '\'' +
                ", nome='" + nome + '\'' +
                ", partido='" + partido + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
