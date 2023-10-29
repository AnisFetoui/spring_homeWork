package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.entities.Etudiant;
import tn.esprit.se.springproject.repositories.EtudiantRepository;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class EtudiantService implements IEtudiantService{
   EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
    etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) etudiantRepository.saveAll(etudiants);
    }
}
