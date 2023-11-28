package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.*;
import tn.esprit.se.springproject.repositories.BlocRepository;
import tn.esprit.se.springproject.repositories.ChambreRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static tn.esprit.se.springproject.entities.TypeChambre.*;


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


    public long ChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        List<Chambre> chambre = chambreRepository.findByTypeCAndBlocIdBloc(type,idBloc);
        return chambre.stream().count();
    }

    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        long nbchambre = chambreRepository.countByTypeCAndBlocIdBloc(type,idBloc);
        return nbchambre;
    }

    @Override
    public Chambre affecterBlocAChambre(long numChambre, String nomBloc) {
        Chambre chambre = chambreRepository.findByNumeroChambre(numChambre);
        Bloc bloc= blocRepository.findByNomBloc(nomBloc);
        chambre.setBloc(bloc);
        chambreRepository.save(chambre);
        return chambre;
    }

    @Scheduled(fixedDelay = 10000)
    void pourcentageChambreParTypeChambre(){
        List<Chambre> chambres= (List<Chambre>) chambreRepository.findAll();
        long nbChambres = chambres.size();
        if(nbChambres!=0) {
            double nbSimple = (double) (chambreRepository.countByTypeC(SIMPLE) / nbChambres) * 100;
            double nbDouble = (double) (chambreRepository.countByTypeC(DOUBLE) / nbChambres) * 100;
            double nbTriple = (double) (chambreRepository.countByTypeC(TRIPLE) / nbChambres) * 100;

            log.info("nbTotaleChambres " + nbChambres);
            log.info("le pourcentage des chambres pour le type Simple est egale " + nbSimple + "%");
            log.info("le pourcentage des chambres pour le type DOUBLE est egale " + nbDouble + "%");
            log.info("le pourcentage des chambres pour le type TRIPLE est egale " + nbTriple + "%");

        }else{
            log.info("table vide ");
        }
    }

}
