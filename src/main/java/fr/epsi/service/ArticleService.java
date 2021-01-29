package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

public interface ArticleService {
	
	void create(ArticleDTO a);
	
	//Récupère la liste de tous les articles de la base de données
	List<Article> get();
	
	// TODO Fonction à développer certainement plus tard pour ce genre d'application de facturation
	void delete(ArticleDTO a);

}
