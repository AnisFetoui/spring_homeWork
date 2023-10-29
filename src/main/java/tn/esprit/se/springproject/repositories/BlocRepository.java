package tn.esprit.se.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.se.springproject.entities.Bloc;

import java.util.List;
@Repository //mech mouhema najem nzidha kima najem le
public interface BlocRepository extends CrudRepository<Bloc,Long> {
   // List<Bloc> findbyFoyerUniversiteIdUniversite(Long idE);
}
