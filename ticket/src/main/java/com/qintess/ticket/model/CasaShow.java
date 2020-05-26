package com.qintess.ticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_CASASHOW")
public class CasaShow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="casashow_id")
	private Long id;
	
	@Column(name="nome_casashow")
	private String nome_casashow;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "numero")
	private int numero;
	

	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "capacidade_total")
	private int capacidade_total;
	
	public CasaShow() {};

	public CasaShow(String nome_casashow, String endereco, int numero, String telefone, String cep, String cidade, String estado, int capacidade_total) {
		this.nome_casashow = nome_casashow;
		this.endereco = endereco;
		this.numero = numero;
		this.telefone = telefone;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.capacidade_total = capacidade_total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome_casashow() {
		return nome_casashow;
	}
	public void setNome(String nome_casashow) {
		this.nome_casashow = nome_casashow;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getCapacidade_total() {
		return capacidade_total;
	}

	public void setCapacidade_total(int capacidade_total) {
		this.capacidade_total = capacidade_total;
	}
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNome_casashow(String nome_casashow) {
		this.nome_casashow = nome_casashow;
	}

	@Override
	public String toString() {
		return "CasaShow [id=" + id + ", nome_casashow=" + nome_casashow + ", endereco=" + endereco + ", telefone=" + telefone + ", cep="
				+ cep + ", cidade=" + cidade + ", estado=" + estado + ", capacidade_total=" + capacidade_total + "]";
	}
}

