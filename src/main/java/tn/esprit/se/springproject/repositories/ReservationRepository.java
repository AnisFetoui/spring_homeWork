package tn.esprit.se.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.se.springproject.entities.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,String> {
}
