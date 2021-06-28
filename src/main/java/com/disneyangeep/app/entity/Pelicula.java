package com.disneyangeep.app.entity;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "peliculas")
public class Pelicula implements Serializable{
	private static final long serialVersionUID = -4657839404587028721L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpelicula")
	private Long id;
	
	@Column
	private String titulo;
	
	@Column(name="rutaimagen")
	private String imagen;
	
	@Column
	private LocalDate fechaCreacion;
	
	@Column
	private int calificacion;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="personajespeliculas",
	joinColumns = @JoinColumn(name="idpelicula"),
	inverseJoinColumns =@JoinColumn(name="idpersonaje"))
	private List<Personaje> personajes;


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
