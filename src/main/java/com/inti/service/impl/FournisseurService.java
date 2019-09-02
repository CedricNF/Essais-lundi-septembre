package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.inti.entites.Fournisseur;
import com.inti.repositories.FournisseurRepository;
import com.inti.service.interfaces.IFournisseurService;

@Service
public class FournisseurService implements IFournisseurService{
	@Autowired
	FournisseurRepository fournisseurrepository;

	@Override
	public List<Fournisseur> findAll() {
		return fournisseurrepository.findAll();
	}

	@Override
	public Fournisseur findOne(Long id_fournisseur) {
		return fournisseurrepository.findById(id_fournisseur).orElse(null);
	}

	@Override
	public Fournisseur save(Fournisseur fournisseur) {
		return fournisseurrepository.save(fournisseur);
	}

	@Override
	public void delete(Long id_fournisseur) {
		fournisseurrepository.deleteById(id_fournisseur);
		
	}

	
}
