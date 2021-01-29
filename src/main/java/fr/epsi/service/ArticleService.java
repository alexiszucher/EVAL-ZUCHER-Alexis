package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

public interface ArticleService {
	
	void create(ArticleDTO a);
	
	//R�cup�re la liste de tous les articles de la base de donn�es
	List<Article> get();
	
	// TODO Fonction � d�velopper certainement plus tard pour ce genre d'application de facturation
	void delete(ArticleDTO a);

}
