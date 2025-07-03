package model;

import java.time.LocalDateTime;

public class Voto {
    // Número do candidato selecionado (ou "BRANCO"/"NULO" para esses casos)
    private final String numeroVotado;
    
    // Data e hora exata em que o voto foi computado
    private final LocalDateTime horario;
    
    // Flag que indica se o voto foi em branco
    private final boolean branco;
    
    // Flag que indica se o voto foi nulo
    private final boolean nulo;
     
    public Voto(String numeroVotado, boolean branco, boolean nulo) {
        if (branco && nulo) {
            throw new IllegalArgumentException("Um voto não pode ser branco e nulo ao mesmo tempo");
        }
        
        this.numeroVotado = numeroVotado;
        this.horario = LocalDateTime.now();
        this.branco = branco;
        this.nulo = nulo;
    }
    
    /**
     * @return O número votado (pode ser do candidato ou "BRANCO"/"NULO")
     */
    public String getNumeroVotado() {
        return numeroVotado;
    }
    
    /**
     * @return O momento exato em que o voto foi registrado
     */
    public LocalDateTime getHorario() {
        return horario;
    }
    
    /**
     * @return Verdadeiro se for um voto nulo
     */
    public boolean isNulo() {
        return nulo;
    }
    
    /**
     * @return Verdadeiro se for um voto em branco
     */
    public boolean isBranco() {
        return branco;
    }
    
    /**
     * @return Verdadeiro se for um voto válido (nem branco nem nulo)
     */
    public boolean isValido() {
        return !branco && !nulo;
    }
}