package com.gamestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codUsuario;
	@NotBlank
	@Size(min = 5, max = 100)
	private String nomeCompleto;
	@NotBlank
	@Size(min = 5, max = 100)
	private String login;
	@NotBlank
	@Size(min = 5, max = 100)
	private String senhaUsuario;
	
	public Usuario(long codUsuario, String nomeCompleto, String login, String senhaUsuario) {		
		this.codUsuario = codUsuario;
		this.nomeCompleto = nomeCompleto;
		this.login = login;
		this.senhaUsuario = senhaUsuario;
	}
	
	public Usuario() {}

	public long getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(long codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
}
