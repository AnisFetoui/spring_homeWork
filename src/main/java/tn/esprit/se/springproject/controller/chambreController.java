package tn.esprit.se.springproject.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.springproject.entities.Bloc;
import tn.esprit.se.springproject.entities.Chambre;
import tn.esprit.se.springproject.repositories.ChambreRepository;
import tn.esprit.se.springproject.services.IChambreService;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class chambreController {
    IChambreService iChambreService;
    @PostMapping("/add-chambre")
    public Chambre postfoyer(@RequestBody Chambre c) {
        Chambre chambre = iChambreService.addChambre( c);
        return chambre;
    }
}
