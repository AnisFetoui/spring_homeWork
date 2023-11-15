package tn.esprit.se.springproject.services;

import tn.esprit.se.springproject.entities.Bloc;
import tn.esprit.se.springproject.entities.Chambre;
import tn.esprit.se.springproject.entities.TypeChambre;

import java.util.List;
import java.util.Set;

public interface IChambreService {
    Chambre addChambre(Chambre c);
    public Set<Chambre> getChambresParNomBloc(String nomBloc );
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc );

}
