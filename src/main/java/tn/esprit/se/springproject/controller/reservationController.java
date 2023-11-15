package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.se.springproject.entities.Reservation;
import tn.esprit.se.springproject.entities.Universite;
import tn.esprit.se.springproject.services.IReservationService;
import tn.esprit.se.springproject.services.ReservationService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class reservationController {
    IReservationService iReservationService;
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation R) {
        Reservation reservation = iReservationService.addReservation(R);
        return reservation;
    }

    @GetMapping("/getReservationParAnneeUniversitaire/{dateDebut}/{dateFin}")
    public List<Reservation> getReservationParAnneeUniversitaire(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
        List<Reservation> reservation = iReservationService.getReservationParAnneeUniversitaire(dateDebut,dateFin);
        return reservation;
    }
}
