package tn.esprit.se.springproject.services;

import tn.esprit.se.springproject.entities.Foyer;
import tn.esprit.se.springproject.entities.Universite;

public interface  IFoyerService {

    Foyer addFoyer(Foyer f);
    Foyer addFoyerWithBloc (Foyer foyer);

}
