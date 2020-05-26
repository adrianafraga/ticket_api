package com.qintess.ticket.model;



import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="TB_USUARIO")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String senha;
	
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dt_nascimento;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private String complemento;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String estado;
	

	
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL, orphanRemoval = true)
	private List <CompraIngresso> compraIngresso = new ArrayList<CompraIngresso>();
	
	private Usuario () {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<CompraIngresso> getCompraIngresso() {
		return compraIngresso;
	}

	public void setCompra(List<CompraIngresso> compraIngresso) {
		this.compraIngresso = compraIngresso;
	}

	public LocalDate getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", compraIngresso=" + compraIngresso + ", dt_nascimento="
				+ dt_nascimento + ", endereco=" + endereco + ", numero=" + numero + ", cep=" + cep + ", complemento="
				+ complemento + ", cidade=" + cidade + ", estado=" + estado + ", email=" + email + ", senha=" + senha
				+ "]";
	}
	

	
	
}

