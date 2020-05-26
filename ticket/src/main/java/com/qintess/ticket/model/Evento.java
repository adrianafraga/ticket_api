package com.qintess.ticket.model;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="TB_EVENTO")
public class Evento implements Serializable {

	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="evento_id")
		private Long id;
		
		@ManyToOne
		@JoinColumn(name = "casa_show_id", nullable = false)
		private CasaShow casaShow;
		
		@Column(name="nome_evento")
		private String nome_evento;
		
		@Column(name="descricao")
		private String descricao;
		
		@Column(name="ingressoTotal")
		private Integer ingressoTotal;

		@Column (nullable = false)
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private LocalDate data_evento;
		
		
		public Evento () {}
		
		
		public Evento(Long id, CasaShow casaShow, String nome_evento, String descricao, Integer ingressoTotal,
				LocalDate data_evento) {
			super();
			this.id = id;
			this.casaShow = casaShow;
			this.nome_evento = nome_evento;
			this.descricao = descricao;
			this.ingressoTotal = ingressoTotal;
			this.data_evento = data_evento;
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public CasaShow getCasaShow() {
			return casaShow;
		}

		public void setCasaShow(CasaShow casaShow) {
			this.casaShow = casaShow;
		}

		public String getNome_evento() {
			return nome_evento;
		}

		public void setNome(String nome_evento) {
			this.nome_evento = nome_evento;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Integer getIngressoTotal() {
			return ingressoTotal;
		}

		public void setIngressoTotal(Integer ingressoTotal) {
			this.ingressoTotal = ingressoTotal;
		}

		public LocalDate getData_evento() {
			return data_evento;
		}

		public void setData(LocalDate data_evento) {
			this.data_evento = data_evento;
		}

		@Override
		public String toString() {
			return "Evento [id=" + id + ", casaShow=" + casaShow + ", nome_evento=" + nome_evento + ", descricao=" + descricao
					+ ", ingressoTotal=" + ingressoTotal + ", data_evento=" + data_evento + "]";
		}
		
		
}
		

