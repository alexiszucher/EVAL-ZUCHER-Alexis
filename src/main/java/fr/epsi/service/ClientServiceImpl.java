package fr.epsi.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDAO;
import fr.epsi.dao.ArticleDAOImpl;
import fr.epsi.dao.ClientDAO;
import fr.epsi.dao.ClientDAOImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientServiceImpl implements ClientService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;

	public void create(ClientDTO c) {
		Client client = new Client();
		client.setNom(c.getNom());
		client.setAdresse(c.getAdresse());
		ClientDAO dao=new ClientDAOImpl(em, utx);
		dao.create(client);
	}

	public void delete(ClientDTO c) {
		// TODO Auto-generated method stub
		
	}

	public List<Client> get() {
		ClientDAO dao=new ClientDAOImpl(em, utx);
		return dao.get();	
	}

}
