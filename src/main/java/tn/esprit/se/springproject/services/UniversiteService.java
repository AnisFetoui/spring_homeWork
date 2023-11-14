package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.Etudiant;
import tn.esprit.se.springproject.entities.Foyer;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.FoyerRepository;
import tn.esprit.se.springproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveuniversity(Long id_universite) {
        return universiteRepository.findById(id_universite).get();
    }

    @Override
    public void removeuniversity(Long id_universite) {
        universiteRepository.deleteById(id_universite);

    }
    public Universite affecterFoyerAUniversite(long idFoyer, String nomU) {
        Universite universite = universiteRepository.findByNomUniversite(nomU);
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        return universite;
    }
    public Universite desaffecterFoyerAUniversite(long idU) {
        Universite universite = universiteRepository.findById(idU).get();
        universite.setFoyer(null);
        universiteRepository.save(universite);
        return universite;
    }

}
