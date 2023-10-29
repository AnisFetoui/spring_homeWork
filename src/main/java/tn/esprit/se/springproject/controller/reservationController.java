package tn.esprit.se.springproject.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.springproject.services.IReservationService;
import tn.esprit.se.springproject.services.ReservationService;

@RestController
@AllArgsConstructor
public class reservationController {
    IReservationService iReservationService;
}
