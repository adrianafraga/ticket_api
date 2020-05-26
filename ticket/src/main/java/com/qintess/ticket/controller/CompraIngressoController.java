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


import com.qintess.ticket.model.CompraIngresso;
import com.qintess.ticket.repository.CompraIngressoRepository;

@RestController
@RequestMapping("/api")
public class CompraIngressoController {
	
	@Autowired
	CompraIngressoRepository compraIngressoRepository;
	private double valorTotal;
	
	@GetMapping("/compraingressos")// lista todas as compraingressos
	public List<CompraIngresso> listaCompraIngressos(){
		return compraIngressoRepository.findAll();
			
	}
	
	@GetMapping("/compraingressos/{id}") //lista compraingressos por id
	public CompraIngresso listaCompraIngressoId(@PathVariable(value="id")long id){
		return compraIngressoRepository.findById(id);
			
	}
	
	@PostMapping("/compraingressos") //método post para salvar compraingressos
	public CompraIngresso salvaCompraIngresso(@RequestBody CompraIngresso compraIngresso) {
		return compraIngressoRepository.save(compraIngresso);
		
	}
	
	@DeleteMapping("/compraingressos") //método delete para deletar compraingressos
	public void deletaCompraIngresso(@RequestBody CompraIngresso compraIngresso) {
		compraIngressoRepository.delete(compraIngresso);		
	}
	
	@PutMapping("/compraingressos") //método put para atualizar compraingressos
	public CompraIngresso atualizaCompraIngresso(@RequestBody CompraIngresso compraIngresso) {
		return compraIngressoRepository.save(compraIngresso);		
	}
	
	public Double setValorTotal(double valorUnitario, Integer qtd) {
		return valorTotal = valorUnitario * qtd;
		}
		public String analisarCompraIngresso(CompraIngresso compraIngresso) {
			if (compraIngresso.getQtd()<=4) {
				salvar(compraIngresso);
				return "Compra efetuada com sucesso!";
			}else {
					return "Não é possivel comprar mais de 4 ingressos";
				
			}
		}

		private void salvar(CompraIngresso compraIngresso) {
			// TODO Auto-generated method stub
			
		}
	

}
