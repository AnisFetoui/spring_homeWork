package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.Etudiant;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.UniversiteRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteService implements IUniversiteService{
    UniversiteRepository universiteRepository;

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
}
