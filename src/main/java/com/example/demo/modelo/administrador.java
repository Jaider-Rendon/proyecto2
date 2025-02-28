package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")

public class administrador {
	@Id
	@Column(name="codigoadmi")
	private Long codigoadmi;
	
	@Column(name="usuario")
	private String usuario;
	
	

	public administrador() {
		
	}

	public administrador(Long codigoadmi, String usuario) {
		super();
		this.codigoadmi = codigoadmi;
		this.usuario = usuario;
	}


	public Long getCodigoadmi() {
		return codigoadmi;
	}


	public void setCodigoadmi(Long codigoadmi) {
		this.codigoadmi = codigoadmi;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	

}
