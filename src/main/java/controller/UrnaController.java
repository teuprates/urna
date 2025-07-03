package controller;

import model.Candidato;
import model.Voto;
import java.util.ArrayList;
import java.util.List;

public class UrnaController {

    private final List<Candidato> listaCandidatos;

    public UrnaController() {
        listaCandidatos = new ArrayList<>();

        // partido dos esportes
        listaCandidatos.add(new Candidato("91001", "Golfe", "PEsp", "fotos/golfe.jpg"));
        listaCandidatos.add(new Candidato("91002", "Beisebol", "PEsp", "fotos/beisebol.jpg"));
        listaCandidatos.add(new Candidato("91003", "Ginástica Artística", "PEsp", "fotos/ginastica.jpg"));

        // partido dos ritmos musicais
        listaCandidatos.add(new Candidato("92001", "Rock", "PMus", "fotos/rock.jpg"));
        listaCandidatos.add(new Candidato("92002", "Sertanejo", "PMus", "fotos/sertanejo.jpg"));
        listaCandidatos.add(new Candidato("92003", "Música Popular Brasileira", "PMus", "fotos/mpb.jpg"));

        // partido das profissões
        listaCandidatos.add(new Candidato("93001", "Astronauta", "PProf", "fotos/astronauta.jpg"));
        listaCandidatos.add(new Candidato("93002", "Pintor", "PProf", "fotos/pintor.jpg"));
        listaCandidatos.add(new Candidato("93003", "Enfermeira", "PProf", "fotos/enfermeira.jpg"));

        // partido das festas populares
        listaCandidatos.add(new Candidato("94001", "Páscoa", "PFest", "fotos/pascoa.jpg"));
        listaCandidatos.add(new Candidato("94002", "Oktoberfest", "PFest", "fotos/oktober.jpg"));
        listaCandidatos.add(new Candidato("94003", "Reveillon", "PFest", "fotos/reveillon.jpg"));

        // partido do folclore
        listaCandidatos.add(new Candidato("95001", "Curupira", "PFolc", "fotos/curupira.jpg"));
        listaCandidatos.add(new Candidato("95002", "Cabra Cabriola", "PFolc", "fotos/cabra.jpg"));
        listaCandidatos.add(new Candidato("95003", "Cuca", "PFolc", "fotos/cuca.jpg"));
    }

    // Buscar candidato pelo número
    public Candidato buscarPorNumero(String numero) {
        for (Candidato candidato : listaCandidatos) {
            if (candidato.getNumero().equals(numero)) {
                return candidato;
            }
        }
        return null;
    }

    // Confirmar voto de um número
    public void confirmarVoto(String numero) {
        Candidato candidato = buscarPorNumero(numero);
        if (candidato != null) {
            Voto.confirmarVoto(candidato.getNome(), candidato.getPartido());
        } else {
            System.out.println("Candidato não encontrado.");
        }
    }


    public List<Candidato> getTodosCandidatos() {
        return listaCandidatos;
    }
}
