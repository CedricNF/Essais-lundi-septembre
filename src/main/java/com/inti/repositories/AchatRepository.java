package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entites.Achat;


@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {

	@Query("FROM Achat a WHERE a.fournisseur.idFournisseur = :idFournisseur")
	public List<Achat> findByFournisseur(@Param("idFournisseur")Long idFournisseur);
}
