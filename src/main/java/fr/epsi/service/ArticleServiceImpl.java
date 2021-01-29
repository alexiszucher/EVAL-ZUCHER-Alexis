package fr.epsi.service;

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
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService {

	
	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;

	public void create(ArticleDTO a) {
		Article article = new Article();
		article.setNom(a.getNom());
		article.setPrix(a.getPrix());
		ArticleDAO dao=new ArticleDAOImpl(em, utx);
		dao.create(article);
	}

	public void delete(ArticleDTO a) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Article> get() {
		ArticleDAO dao=new ArticleDAOImpl(em, utx);
		return dao.get();	
	}
	

}
