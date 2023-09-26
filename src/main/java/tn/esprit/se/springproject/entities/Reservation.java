package tn.esprit.se.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity

public class Reservation implements Serializable {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idReservation")
    private String idReservation; // Clé primaire
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToMany(mappedBy="reservation", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant;
}
