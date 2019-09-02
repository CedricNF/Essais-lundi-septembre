package com.inti.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public Long id_fournisseur;
	public String nom_fournisseur;
	public String adresse;
	public String ville;
	
	@OneToMany(mappedBy = "fournisseur")
	private List<Achat> achat;

	public Fournisseur() {
		super();
	}

	public Long getId_fournisseur() {
		return id_fournisseur;
	}

	public void setId_fournisseur(Long id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}

	public String getNom_fournisseur() {
		return nom_fournisseur;
	}

	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
