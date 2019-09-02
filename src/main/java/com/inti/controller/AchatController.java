package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entites.Achat;
import com.inti.service.interfaces.IAchatService;


@RestController
public class AchatController {
	@Autowired
	IAchatService achatservice;
	
	@RequestMapping(value="/achat", method = RequestMethod.GET)
	public List<Achat> findAll(){
		return achatservice.findAll();
	}
	
	@RequestMapping(value="/achat/{id_achat}", method = RequestMethod.GET)
	public Achat findOne(@PathVariable("id_achat")Long id_achat) {
		return achatservice.findOne(id_achat);
	}
	@RequestMapping(value="/achat", method = RequestMethod.POST)
	public Achat saveAchat(@RequestBody Achat achat) {
		return achatservice.save(achat);
	}
	@RequestMapping(value ="/achat/{id_achat}", method= RequestMethod.DELETE)
	public void deleteAchat(@PathVariable("id_achat") Long id_achat) {
		achatservice.delete(id_achat);
	}
	@RequestMapping(value = "achatF/{idFournisseur}", method = RequestMethod.GET)
	public List<Achat> findByIdFournisseur(@PathVariable("idFournisseur") Long idFournisseur) {
		return achatservice.findByIdFournisseur(idFournisseur);
	}

}
