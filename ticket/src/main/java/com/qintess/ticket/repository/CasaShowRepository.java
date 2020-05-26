package com.qintess.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.ticket.model.CasaShow;
import com.qintess.ticket.model.CompraIngresso;

public interface CasaShowRepository extends JpaRepository <CasaShow, Long> { //JpaRepository possui vários metodos prontos pra fazer Persistência com um banco de dados (save, delete, findAll e findById)
 
	//método personalizado para procurar uma único usuário através do id
	CasaShow findById(long id);
}

	