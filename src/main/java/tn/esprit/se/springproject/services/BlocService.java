package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.Bloc;
import tn.esprit.se.springproject.entities.Chambre;
import tn.esprit.se.springproject.entities.Foyer;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.BlocRepository;
import tn.esprit.se.springproject.repositories.ChambreRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class BlocService implements IBlocService{
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        for (Long nC : numChambre ){
            Chambre chambre = chambreRepository.findByNumeroChambre(nC);
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }
        return bloc;

    }
}
