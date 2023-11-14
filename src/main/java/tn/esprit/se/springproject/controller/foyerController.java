package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entities.Foyer;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.repositories.FoyerRepository;
import tn.esprit.se.springproject.services.IFoyerService;
import tn.esprit.se.springproject.services.IUniversiteService;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class foyerController {
  IFoyerService iFoyerService;
  @PostMapping("/add-foyer")
  public Foyer postfoyer(@RequestBody Foyer f) {
    Foyer foyer = iFoyerService.addFoyer( f);
    return foyer;
  }

}
