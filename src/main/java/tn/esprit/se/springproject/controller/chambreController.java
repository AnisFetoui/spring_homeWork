package tn.esprit.se.springproject.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entities.Bloc;
import tn.esprit.se.springproject.entities.Chambre;
import tn.esprit.se.springproject.entities.TypeChambre;
import tn.esprit.se.springproject.repositories.ChambreRepository;
import tn.esprit.se.springproject.services.IChambreService;

import java.util.List;
import java.util.Set;

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

    @GetMapping("/nbChambreParTypeEtBloc/{type}/{idBloc}")
    public long nbChambreParTypeEtBloc(@PathVariable TypeChambre type,@PathVariable long idBloc ){
        long anis = iChambreService.nbChambreParTypeEtBloc(type,idBloc);
        return anis;
    }

    @GetMapping("/getChambresParNomBloc/{nomBloc}")
    public Set<Chambre> getChambresParNomBloc(@PathVariable String nomBloc){
        Set<Chambre> chambres = iChambreService.getChambresParNomBloc(nomBloc);
        return chambres;
    }

    @PutMapping("/add-BlocAChambres/{numeroChambre}/{nomBloc}")
    @ResponseBody
    public Chambre affecteBlocAChambre(@PathVariable("nomBloc") String nomBloc, @PathVariable("numeroChambre") Long numeroChambre){
        Chambre chambre = iChambreService.affecterBlocAChambre(numeroChambre,nomBloc);
        return chambre;
    }


}
