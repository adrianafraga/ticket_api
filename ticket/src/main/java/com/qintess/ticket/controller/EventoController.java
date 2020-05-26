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


import com.qintess.ticket.model.Evento;
import com.qintess.ticket.repository.EventoRepository;

@RestController
@RequestMapping("/api")
public class EventoController {
	
	@Autowired
	EventoRepository eventoRepository;
	
	@GetMapping("/eventos")// lista todos os eventos
	public List<Evento> listaEvento(){
		return eventoRepository.findAll();
			
	}
	
	@GetMapping("/eventos/{id}") //lista evento por id
	public Evento listaEventoId(@PathVariable(value="id")long id){
		return eventoRepository.findById(id);
			
	}
	
	@PostMapping("/eventos") //método post para salvar evento
	public Evento salvaEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
		
	}
	
	@DeleteMapping("/eventos") //método delete para deletar evento
	public void deletaEvento(@RequestBody Evento evento) {
		eventoRepository.delete(evento);		
	}
	
	@PutMapping("/eventos") //método put para atualizar evento
	public Evento atualizaEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);		
	}
	

}
