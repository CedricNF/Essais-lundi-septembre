package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entites.Fournisseur;
import com.inti.service.interfaces.IFournisseurService;

@RestController
public class FournisseurController {
	@Autowired
	IFournisseurService fournisseurservice;
	
	@RequestMapping(value="/fournisseur", method = RequestMethod.GET)
	public List<Fournisseur> findAll(){
		return fournisseurservice.findAll();
	}
	
	@RequestMapping(value="/fournisseur/{id_fournisseur}", method = RequestMethod.GET)
	public Fournisseur findOne(@PathVariable("id_fournisseur")Long id_fournisseur) {
		return fournisseurservice.findOne(id_fournisseur);
	}
	@RequestMapping(value="/fournisseur", method = RequestMethod.POST)
	public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur) {
		return fournisseurservice.save(fournisseur);
	}
	@RequestMapping(value ="/fournisseur/{id_fournisseur}", method= RequestMethod.DELETE)
	public void deleteAchat(@PathVariable("id_fournisseur") Long id_fournisseur) {
		fournisseurservice.delete(id_fournisseur);
	}
	@RequestMapping(value="fournisseur/{id_fournisseur}", method= RequestMethod.PUT)
	public Fournisseur updateFournisseur(@PathVariable("id_Fournisseur") Long id_fournisseur,@RequestBody Fournisseur fournisseur) {
		Fournisseur currentFournisseur = fournisseurservice.findOne(id_fournisseur);
		currentFournisseur.setNom_fournisseur(fournisseur.getNom_fournisseur());
		currentFournisseur.setAdresse(fournisseur.getAdresse());
		currentFournisseur.setVille(fournisseur.getVille());
		return fournisseurservice.save(currentFournisseur);
		
	}
}
