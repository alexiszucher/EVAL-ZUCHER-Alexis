package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

public interface FactureService {
	
	//Récupère la liste de toutes les factures de la base de données
	List<Facture> get();

}
