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

import com.qintess.ticket.model.CasaShow;
import com.qintess.ticket.repository.CasaShowRepository;



@RestController
@RequestMapping("/api")
public class CasaShowController {
	
	@Autowired
	CasaShowRepository casaShowRepository;
	
	@GetMapping("/casashows")// lista todos as casas de show
	public List<CasaShow> listaCasaShow(){
		return casaShowRepository.findAll();
			
	}
	
	@GetMapping("/casashows/{id}") //lista casa de show por id
	public CasaShow listaCasaShowId(@PathVariable(value="id")long id){
		return casaShowRepository.findById(id);
			
	}
	
	@PostMapping("/casashows") //método post para salvar casa de show
	public CasaShow salvaCasaShow(@RequestBody CasaShow casaShow) {
		return casaShowRepository.save(casaShow);
		
	}
	
	@DeleteMapping("/casashows") //método delete para deletar casa de show
	public void deletaCasaShow(@RequestBody CasaShow casaShow) {
		casaShowRepository.delete(casaShow);		
	}
	
	@PutMapping("/casashows") //método put para atualizar casa de show
	public CasaShow atualizaCasaShow(@RequestBody CasaShow casaShow) {
		return casaShowRepository.save(casaShow);		
	}
	
}