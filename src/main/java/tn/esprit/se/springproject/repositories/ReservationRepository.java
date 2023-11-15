package tn.esprit.se.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springproject.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation,String> {
    List<Reservation> findByAnneeUniversitaireBetween(Date dateDebut , Date dateFin);
}
