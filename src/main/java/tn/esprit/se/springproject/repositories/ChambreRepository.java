package tn.esprit.se.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springproject.entities.Chambre;
import tn.esprit.se.springproject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends CrudRepository<Chambre,Long> {
    //liste des chambres double d'un bloc donnée
  //  List<Chambre> findByTypeCAndBlocNomBloc(TypeChambre Typec, String nomBloc);
   // List<Chambre> findByReservationEstValide(boolean estValide);
   // List<Chambre> findByBlocNomAndcapaciteBlocGreaterThan(String nomBloc, int capaciteBloc);
}
