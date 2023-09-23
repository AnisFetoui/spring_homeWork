package tn.esprit.se.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idReservation")
    private Long idReservation; // Clé primaire
    private Date anneeUniversitaire;
    private boolean estValide;
}
