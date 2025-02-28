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
@Table(name = "loginusuario")

public class loginusuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long idloginusuario;
	
	@Column(name="claveUs")
	private Long claveUs;
	
	@ManyToOne()
	@JoinColumn(name = "nIdentificacion",referencedColumnName="nIdentificacion")
	private usuario usuario;

	public loginusuario() {
	}

	public loginusuario(Long idloginusuario, Long claveUs,usuario usuario) {
		super();
		this.idloginusuario = idloginusuario;
		this.claveUs = claveUs;
		this.usuario = usuario;
	}

	public Long getIdloginusuario() {
		return idloginusuario;
	}

	public void setIdloginusuario(Long idloginusuario) {
		this.idloginusuario = idloginusuario;
	}

	public Long getClaveUs() {
		return claveUs;
	}

	public void setClaveUs(Long claveUs) {
		this.claveUs = claveUs;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}

