package model;

import java.time.LocalDateTime;

/**
 * Classe que representa um voto realizado na urna eletrônica.
 */
public class Voto {

    // Número do candidato votado (ou nulo, se for branco/nulo)
    private final String numeroVotado;

    // Data e hora exata do voto
    private final LocalDateTime horario;

    // Indica se o voto foi em branco
    private final boolean branco;

    // Indica se o voto foi nulo
    private final boolean nulo;

    /**
     * Construtor do voto.
     *
     * @param numeroVotado Número digitado pelo eleitor (pode estar em branco ou inválido)
     * @param branco       true se o voto foi em branco
     * @param nulo         true se o voto foi nulo
     */
    public Voto(String numeroVotado, boolean branco, boolean nulo) {
        this.numeroVotado = numeroVotado;
        this.horario = LocalDateTime.now();
        this.branco = branco;
        this.nulo = nulo;
    }

    /** Retorna o número votado (ou vazio se branco ou nulo). */
    public String getNumeroVotado() {
        return numeroVotado;
    }

    /** Retorna o horário em que o voto foi realizado. */
    public LocalDateTime getHorario() {
        return horario;
    }

    /** Indica se o voto foi nulo. */
    public boolean isNulo() {
        return nulo;
    }

    /** Indica se o voto foi em branco. */
    public boolean isBranco() {
        return branco;
    }

    /**
     * Exibe uma mensagem de confirmação do voto (pode ser chamada após confirmação na interface).
     */
    public static void confirmarVoto(String nome, String partido) {
        System.out.println("Voto confirmado com sucesso!");
        System.out.println("Candidato: " + nome);
        System.out.println("Partido: " + partido);
        System.out.println("Obrigado por votar.");
    }
}
