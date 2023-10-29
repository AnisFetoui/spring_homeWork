package tn.esprit.se.springproject.services;

import tn.esprit.se.springproject.entities.Etudiant;
import tn.esprit.se.springproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversities();

    Universite addUniversity(Universite u);

    Universite updateUniversity(Universite u);

    Universite retrieveuniversity(Long id_universite);

    void removeuniversity(Long id_universite);
}
