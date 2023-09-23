package tn.esprit.se.springproject.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
// Constructeur et accesseurs (getters) et mutateurs (setters)
}
