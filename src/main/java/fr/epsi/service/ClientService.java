package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;


public interface ClientService {
	
	void create(ClientDTO c);
	
	//Récupère la liste de tous les clients de la base de données
	List<Client> get();
	
	// TODO Fonction à développer certainement plus tard pour ce genre d'application de facturation
	void delete(ClientDTO c);

}
