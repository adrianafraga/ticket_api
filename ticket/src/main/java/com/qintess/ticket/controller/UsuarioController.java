package com.qintess.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.ticket.model.Usuario;
import com.qintess.ticket.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")// lista todos os usuarios
	public List<Usuario> listaUsuarios(){
		return usuarioRepository.findAll();
			
	}
	
	@GetMapping("/usuarios/{id}") //lista usuário por id
	public Usuario listaUsuarioId(@PathVariable(value="id")long id){
		return usuarioRepository.findById(id);
			
	}
	
	@PostMapping("/usuarios") //método post para salvar o usuário
	public Usuario salvaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
		
	}
	
	@DeleteMapping("/usuarios") //método delete para deletar o usuário
	public void deletaUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.delete(usuario);		
	}
	
	@PutMapping("/usuarios") //método put para atualizar o usuário
	public Usuario atualizaUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);		
	}
	
}