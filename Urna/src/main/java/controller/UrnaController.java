package controller;

import dao.CandidatoDAO;
import dao.VotoDAO;
import model.Candidato;

public class UrnaController {
    private final CandidatoDAO candidatoDAO;
    private final VotoDAO votoDAO;

    public UrnaController() {
        this.candidatoDAO = new CandidatoDAO();
        this.votoDAO = new VotoDAO();
    }

    // Busca candidato pelo número (para facilitar no seu código da interface)
    public Candidato buscarPorNumero(String numero) {
        return candidatoDAO.buscarPorNumero(numero);
    }

}