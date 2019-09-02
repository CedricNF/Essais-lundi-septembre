package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entites.Achat;


@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {

}
