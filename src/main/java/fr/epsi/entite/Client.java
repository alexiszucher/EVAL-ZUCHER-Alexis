package fr.epsi.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String nom;
	String adresse;
	
	@OneToMany(mappedBy="client")
	private List<Facture> factures = new ArrayList<Facture>();
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getAdresse() {
		return adresse;
	}
	
}
