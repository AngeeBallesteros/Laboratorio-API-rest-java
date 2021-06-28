package com.disneyangeep.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "generos")
public class Genero implements Serializable{
	
	private static final long serialVersionUID = -4657839404587028721L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idgenero")
	private Long id;
	
	@Column
	private String nombre;
	
	@Column(name="rutaimagen")
	private String imagen;



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	

	

}
