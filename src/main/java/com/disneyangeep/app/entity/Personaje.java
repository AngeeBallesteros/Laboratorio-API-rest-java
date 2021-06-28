package com.disneyangeep.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "personajes")
public class Personaje implements Serializable{

	private static final long serialVersionUID = -4657839404587028721L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpersonaje")
	private Long id;
	
	@Column
	private String nombre;
	
	@Column(name="rutaimagen")
	private String imagen;

	@Column
	private int edad;
	
	@Column
	private double peso;
	
	@Column
	private String historia;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="personajespeliculas",
	joinColumns = @JoinColumn(name="idpersonaje"),
	inverseJoinColumns =@JoinColumn(name="idpelicula"))
	private List<Pelicula> peliculas;
	

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}
	

}
