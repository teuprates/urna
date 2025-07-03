package model;

public class Candidato {
    private String nome;
    private String numero;
    private String partido;
    private int votos;

    public Candidato(String nome, String numero, String partido) {
        this.nome = nome;
        this.numero = numero;
        this.partido = partido;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }


    public void adicionarVoto() {
        this.votos++;
    }
}
