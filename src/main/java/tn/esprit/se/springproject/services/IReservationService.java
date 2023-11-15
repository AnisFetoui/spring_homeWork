package tn.esprit.se.springproject.services;

import tn.esprit.se.springproject.entities.Reservation;
import tn.esprit.se.springproject.entities.Universite;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation R);
    public List<Reservation> getReservationParAnneeUniversitaire(Date dateDebut , Date dateFin );

}
