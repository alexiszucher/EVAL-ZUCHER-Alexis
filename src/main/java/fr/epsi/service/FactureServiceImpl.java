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
import fr.epsi.dao.FactureDAO;
import fr.epsi.dao.FactureDAOImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImpl implements FactureService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;

	public List<Facture> get() {
		FactureDAO dao=new FactureDAOImpl(em, utx);
		return dao.get();	
	}

	public Facture get(Long id) {
		FactureDAO dao=new FactureDAOImpl(em, utx);
		return dao.get(id);	
	}

}
