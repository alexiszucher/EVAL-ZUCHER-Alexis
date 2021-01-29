package fr.epsi.dto;

public class ArticleDTO {
	
	String nom;
	double prix;
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getPrix() {
		return prix;
	}

}
