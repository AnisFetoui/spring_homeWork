package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.*;
import tn.esprit.se.springproject.repositories.BlocRepository;
import tn.esprit.se.springproject.repositories.ChambreRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;

    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Set<Chambre> getChambresParNomBloc(String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);

        return bloc.getChambre();

    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        List<Chambre> chambre = chambreRepository.findByTypeCAndBlocIdBloc(type,idBloc);
        return chambre.stream().count();
    }

}
