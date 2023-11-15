package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.Reservation;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.ReservationRepository;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin) {
       List<Reservation> reservations = reservationRepository.findByAnneeUniversitaireBetween(dateDebut,dateFin);
        return reservations;
    }
}
