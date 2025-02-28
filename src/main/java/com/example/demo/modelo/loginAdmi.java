package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "loginadmi")

public class loginAdmi {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long idloginadmi;
	
	@ManyToOne()
	@JoinColumn(name = "codigoadmi",referencedColumnName="codigoadmi")
	private administrador administrador;

	public loginAdmi() {
		
	}

	public loginAdmi(Long idloginadmi, Long clavead,administrador administrador) {
		super();
		this.idloginadmi = idloginadmi;
		this.administrador = administrador;
	}

	public Long getIdloginadmi() {
		return idloginadmi;
	}

	public void setIdloginadmi(Long idloginadmi) {
		this.idloginadmi = idloginadmi;
	}

	public administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(administrador administrador) {
		this.administrador = administrador;
	}
	
	
	
	

}
