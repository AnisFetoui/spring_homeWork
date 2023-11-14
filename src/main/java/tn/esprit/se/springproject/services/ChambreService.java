package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.Bloc;
import tn.esprit.se.springproject.entities.Chambre;
import tn.esprit.se.springproject.entities.Foyer;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.ChambreRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;

    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

}
