package br.com.curso.programacao.java.projetofinal_model.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;

import br.com.curso.programacao.java.projetofinal_model.enuns.TipoDocEnum;

@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(length = 50, nullable = false, unique = true)
	private String titulo;

	@Column(length = 50, nullable = false, unique = true)
	private String descricao;

	@Lob
	private byte[] conteudo;

	@Column(nullable = false, precision = 200,scale = 2)
	private BigDecimal tamanho;

	@Temporal(TemporalType.DATE)
	private Date dataRegistro;

	@Enumerated
	private TipoDocEnum tipo;

	public Documento() {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getConteudo() {
		return conteudo;
	}

	public void setConteudo(byte[] conteudo) {
		this.conteudo = conteudo;
	}

	public BigDecimal getTamanho() {
		return tamanho;
	}

	public void setTamanho(BigDecimal tamanho) {
		this.tamanho = tamanho;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public TipoDocEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocEnum tipo) {
		this.tipo = tipo;
	}

}
