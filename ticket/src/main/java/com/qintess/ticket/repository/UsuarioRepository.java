package com.qintess.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.ticket.model.Usuario;

public interface UsuarioRepository  extends JpaRepository <Usuario, Long> {
	
	//método personalizado para procurar uma único usuário através do id
	Usuario findById(long id);

}


