package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entites.Achat;
import com.inti.repositories.AchatRepository;
import com.inti.service.interfaces.IAchatService;

@Service
public class AchatService implements IAchatService {

	@Autowired
	AchatRepository achatservice;

	@Override
	public List<Achat> findAll() {
		return achatservice.findAll();
	}

	@Override
	public Achat findOne(Long id_achat) {
		return achatservice.findById(id_achat).orElse(null);
	}

	@Override
	public Achat save(Achat achat) {
		return achatservice.save(achat);
	}

	@Override
	public void delete(Long id_achat) {
		achatservice.deleteById(id_achat);
		
	}

	@Override
	public List<Achat> findByIdFournisseur(Long idFournisseur) {
		return achatservice.findByFournisseur(idFournisseur);
	}

}
