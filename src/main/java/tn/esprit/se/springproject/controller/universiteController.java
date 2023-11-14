package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;


import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entities.Foyer;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.UniversiteRepository;
import tn.esprit.se.springproject.services.IUniversiteService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/universite")

public class universiteController {
    IUniversiteService iUniversiteService;
    UniversiteRepository universiteRepository;


    @GetMapping("/retrieve-all-universities")
    public List<Universite> getuniversities() {
        List<Universite >listUniversities = iUniversiteService.retrieveAllUniversities();
        return listUniversities;
    }
    @PostMapping("/add-universitie")
    public Universite postuniversities(@RequestBody Universite u) {
        Universite Universities = iUniversiteService.addUniversity( u);
        return Universities;
    }
    @PutMapping("/update-universitie")
    public Universite putuniversities(@RequestBody Universite u) {
        Universite Universities = iUniversiteService.updateUniversity(u);
        return Universities;
    }
    @DeleteMapping("/remove-universitie/{id_universite}")
    public void deleteuniversities(@PathVariable Long id_universite) {
        iUniversiteService.removeuniversity(id_universite);
    }
    @GetMapping("/retrieve-universitie/{id_universite}")
    public Universite getuniversitie(@PathVariable Long id_universite) {
        Universite Universities = iUniversiteService.retrieveuniversity(id_universite);
        return Universities;
    }

    @PutMapping("/add-universitieandFoyer/{idFoyer}/{nomU}")
    @ResponseBody
    public Universite affecterFoyaUniver(@PathVariable("idFoyer") long idFoyer,@PathVariable("nomU") String nomU) {
        Universite universite = iUniversiteService.affecterFoyerAUniversite(idFoyer,nomU);
        return universite;
    }
    @PutMapping("/des-universitieandFoyer/{idU}")
    @ResponseBody
    public Universite desaffecterFoyaUniver(@PathVariable("idU") long idU) {
        Universite universite = iUniversiteService.desaffecterFoyerAUniversite(idU);
        return universite;
    }


}
