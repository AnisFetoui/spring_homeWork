package tn.esprit.se.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springproject.entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {

}
