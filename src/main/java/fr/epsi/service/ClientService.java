package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;


public interface ClientService {
	
	void create(ClientDTO c);
	
	//R�cup�re la liste de tous les clients de la base de donn�es
	List<Client> get();
	
	// TODO Fonction � d�velopper certainement plus tard pour ce genre d'application de facturation
	void delete(ClientDTO c);

}
