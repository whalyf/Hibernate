package br.bob.pro.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
	@Id 
	@Column(nullable = false, unique = true)
	private String cep;
	@Column(nullable = false)
	private String nome;
	@ManyToOne
	@JoinColumn (name= "type")
	private TipoDeLogradouro tipolog;
	@ManyToOne
	@JoinColumn(name="neighborhood")
	private Bairro bairro;
	
	public TipoDeLogradouro getTipolog() {
		return tipolog;
	}
	public void setTipolog(TipoDeLogradouro tipolog) {
		this.tipolog = tipolog;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
