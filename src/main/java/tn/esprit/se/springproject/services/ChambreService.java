package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.repositories.ChambreRepository;

@Service
@Slf4j
@AllArgsConstructor
public class ChambreService implements IChambreService{
    ChambreRepository chambreRepository;
}
