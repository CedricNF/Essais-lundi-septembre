package com.inti.entites;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_article;
	public String libelle;
	public int stock;
	public int prix;
	
	
		@OneToMany(mappedBy = "article")
	private List<Achat> achat;
	
	public Article() {
		super();
	}


	public Article(String libelle, int stock, int prix) {
		super();
		this.libelle = libelle;
		this.stock = stock;
		this.prix = prix;
	}
	
	
	
	public Long getId_article() {
		return id_article;
	}


	public void setId_article(Long id_article) {
		this.id_article = id_article;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
}
