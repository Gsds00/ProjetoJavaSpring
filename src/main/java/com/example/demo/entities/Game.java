package com.example.demo.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_game")
public class Game {
     
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   private String titulo;
	   
	   @Column(name = "ano_jogo")
	   private Integer ano;
	   private String genero;
	   private String prataforma;
	   private String imUrl;
	   private String descricaoCurta;    
	   private String descricaoLonga;
	   
	   public Game() {
		   
	   }

	public Game(Long id, String titulo, Integer ano, String genero, String prataforma, String imUrl,
			String descricaoCurta, String descricaoLonga) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.prataforma = prataforma;
		this.imUrl = imUrl;
		this.descricaoCurta = descricaoCurta;
		this.descricaoLonga = descricaoLonga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPrataforma() {
		return prataforma;
	}

	public void setPrataforma(String prataforma) {
		this.prataforma = prataforma;
	}

	public String getImUrl() {
		return imUrl;
	}

	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}

	public String getDescricaoLonga() {
		return descricaoLonga;
	}

	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	   
}
