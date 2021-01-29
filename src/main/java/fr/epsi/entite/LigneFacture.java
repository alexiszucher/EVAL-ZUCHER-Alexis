package fr.epsi.entite;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFacture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	int qte;
	double prix;
	
	@ManyToOne
	@JoinColumn(name = "facture_id")
	private Facture facture;
	
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getQte() {
		return qte;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getPrix() {
		return prix;
	}
	
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public Facture getFacture() {
		return facture;
	}
	
	public void setArticle(Article article) {
		this.article = article;
	}
	public Article getArticle() {
		return article;
	}

}
