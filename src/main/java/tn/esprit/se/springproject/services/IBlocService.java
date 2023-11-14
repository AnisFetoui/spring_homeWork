package tn.esprit.se.springproject.services;

import tn.esprit.se.springproject.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) ;
    public Bloc addBloc(Bloc b);
}
