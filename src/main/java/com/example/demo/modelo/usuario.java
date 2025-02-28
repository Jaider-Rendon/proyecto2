package com.example.demo.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "usuario")

public class usuario {
	@Id
	@Column(name="nIdentificacion")
	private Long nIdentificacion;
	
	@Column(name="nombre1")
	private String nombre1;
	
	@Column(name="nombre2")
	private String nombre2;
	
	@Column(name="apellido1")
	private String apellido1;
	
	@Column(name="apellido2")
	private String apellido2;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="MM/dd/yyy")
	@Column(name="fechaExlicen",nullable=false)
	private Date fechaEclicen;
	
	@Column(name="telefono")
	private Long telefono;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="MM/dd/yyy")
	@Column(name="vigencialicencia",nullable=false)
	private Date vigencialicencia;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="correo")
	private String correo;

	public usuario() {
	}

	public usuario(Long cnIdentificacion, String nombre1, String nombre2, String apellido1, String apellido2,
			Date fechaEclicen, Long telefono, Date vigencialicencia, String categoria, String correo) {
		super();
		this.nIdentificacion = cnIdentificacion;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaEclicen = fechaEclicen;
		this.telefono = telefono;
		this.vigencialicencia = vigencialicencia;
		this.categoria = categoria;
		this.correo = correo;
	}

	public Long getCnIdentificacion() {
		return nIdentificacion;
	}

	public void setCnIdentificacion(Long cnIdentificacion) {
		this.nIdentificacion = cnIdentificacion;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Date getFechaEclicen() {
		return fechaEclicen;
	}

	public void setFechaEclicen(Date fechaEclicen) {
		this.fechaEclicen = fechaEclicen;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Date getVigencialicencia() {
		return vigencialicencia;
	}

	public void setVigencialicencia(Date vigencialicencia) {
		this.vigencialicencia = vigencialicencia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
		

}
