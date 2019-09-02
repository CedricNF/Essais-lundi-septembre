package com.inti.service.interfaces;

import java.util.List;

import com.inti.entites.Achat;

public interface IAchatService {

	public List<Achat> findAll();

	public Achat findOne(Long id_achat);

	public Achat save(Achat achat);

	public void delete(Long id_achat);
}
