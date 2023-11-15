package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entities.Bloc;

import tn.esprit.se.springproject.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class blocController {
    IBlocService iBlocService;
    @PostMapping("/add-bloc")
    public Bloc postfoyer(@RequestBody Bloc b) {
        Bloc bloc = iBlocService.addBloc( b);
        return bloc;
    }
    @PutMapping("/add-ChambresABloc/{nomBloc}")
    @ResponseBody
    public Bloc affecteChambresABloc(@RequestBody List<Long> numChambre,@PathVariable("nomBloc") String nomBloc){
        Bloc bloc = iBlocService.affecterChambresABloc(numChambre,nomBloc);
        return bloc;
    }
}