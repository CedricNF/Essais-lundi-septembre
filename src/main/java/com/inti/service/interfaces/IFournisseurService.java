package com.inti.service.interfaces;

import java.util.List;

import com.inti.entites.Fournisseur;

public interface IFournisseurService{

	public List<Fournisseur> findAll();

	public Fournisseur findOne(Long id_fournisseur);

	public Fournisseur save(Fournisseur fournisseur);

	public void delete(Long id_fournisseur);
}
