package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entities.Etudiant;
import tn.esprit.se.springproject.repositories.EtudiantRepository;
import tn.esprit.se.springproject.services.EtudiantService;
import tn.esprit.se.springproject.services.IEtudiantService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class etudiantController {
    IEtudiantService iEtudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant>listEtudiants = iEtudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    @PostMapping("/add-etudiant")
    public Etudiant postEtudiants(@RequestBody Etudiant e) {
        Etudiant etudiant =  iEtudiantService.addEtudiant(e);
        return etudiant;
    }
    @PutMapping("/update-etudiant")
    public Etudiant putEtudiants(@RequestBody Etudiant e) {
        Etudiant listEtudiants = iEtudiantService.updateEtudiant(e);
        return listEtudiants;
    }
    @DeleteMapping("/remove-etudiant/{idEtudiant}")
    public void deleteEtudiants(@PathVariable Long idEtudiant) {
        iEtudiantService.removeEtudiant(idEtudiant);
    }
    @GetMapping("/retrieve-etudiant/{idEtudiant}")
    public Etudiant getEtudiant(@PathVariable Long idEtudiant) {
        Etudiant listEtudiants = iEtudiantService.retrieveEtudiant(idEtudiant);
        return listEtudiants;
    }
    @PostMapping("/add-etudiants")
    public List<Etudiant> postEtudiants(@RequestBody List<Etudiant> etudiants) {
        List<Etudiant> listEtudiants = iEtudiantService.addEtudiants(etudiants);
        return listEtudiants;
    }

    @PutMapping("/affecterEtudiantAReservation/{nomEt}/{prenomEt}/{idReservation}")
    public void affecterEtudiantAReservation(@PathVariable("nomEt") String nomEt,@PathVariable("prenomEt") String prenomEt,@PathVariable("idReservation") String idReservation) {
        iEtudiantService.affecterEtudiantAReservation(nomEt,prenomEt,idReservation);

    }
}