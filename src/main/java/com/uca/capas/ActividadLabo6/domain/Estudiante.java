package com.uca.capas.ActividadLabo6.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoUsuario;
	
	@Size(max=50, message="El nombre no puede tener mas de 50 caracteres.")
	@NotEmpty(message="Este campo no puede ir vacio.")
	@Column(name="nombre")
	private String nombre;
	
	@Size(max=50, message="El apellido no puede tener mas de 50 caracteres.")
	@NotEmpty(message="Este campo no puede ir vacio.")
	@Column(name="apellido")
	private String apellido;
	
	@Size(min=8, max=8, message="El carne debe ser de 8 digitos")
	@NotEmpty(message="Este campo no puede ir vacio.")
	@Column(name="carne")
	private String carne;
	
	@Size(max=100, message="La carrera no puede contener mas de 100 caracteres.")
	@NotEmpty(message="Este campo no puede ir vacio.")
	@Column(name="carrera")
	private String carrera;
	
	public Estudiante() {
		
	}

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
}
