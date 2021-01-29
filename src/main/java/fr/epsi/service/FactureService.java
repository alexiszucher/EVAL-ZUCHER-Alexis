package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

public interface FactureService {
	
	//R�cup�re la liste de toutes les factures de la base de donn�es
	List<Facture> get();

}
