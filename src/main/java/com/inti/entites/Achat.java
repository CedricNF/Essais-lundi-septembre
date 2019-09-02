package com.inti.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Achat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_achat;
	public int prix_achat;
	public int delai;
	
	
	@ManyToOne
	public Fournisseur fournisseur;
	
	@ManyToOne
	public Article article;

	public Achat() {
		super();
	}

	public Long getId_achat() {
		return id_achat;
	}

	public void setId_achat(Long id_achat) {
		this.id_achat = id_achat;
	}

	public int getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(int prix_achat) {
		this.prix_achat = prix_achat;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
