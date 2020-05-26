package com.qintess.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.ticket.model.CompraIngresso;
import com.qintess.ticket.model.Usuario;

public interface CompraIngressoRepository  extends JpaRepository <CompraIngresso, Long> {
	
		//método personalizado para procurar uma único usuário através do id
		CompraIngresso findById(long id);


}


