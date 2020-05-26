package com.qintess.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.ticket.model.Evento;
import com.qintess.ticket.model.Usuario;

public interface EventoRepository extends JpaRepository <Evento, Long> {
	
	//método personalizado para procurar uma único usuário através do id
	Evento findById(long id);


}

