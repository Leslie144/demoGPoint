package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Galeria")
public class Galeria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGaleria;
	
	@Column(name="nombreGaleria", nullable = false)
	private String nombreGaleria;
	
	
	@Column(name="cantidadDeJuegos", nullable = false)
	private int cantidadDeJuegos;


	public Galeria() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Galeria(int idGaleria, String nombreGaleria, int cantidadDeJuegos) {
		super();
		this.idGaleria = idGaleria;
		this.nombreGaleria = nombreGaleria;
		this.cantidadDeJuegos = cantidadDeJuegos;
	}


	public int getIdGaleria() {
		return idGaleria;
	}


	public void setIdGaleria(int idGaleria) {
		this.idGaleria = idGaleria;
	}


	public String getNombreGaleria() {
		return nombreGaleria;
	}


	public void setNombreGaleria(String nombreGaleria) {
		this.nombreGaleria = nombreGaleria;
	}


	public int getCantidadDeJuegos() {
		return cantidadDeJuegos;
	}


	public void setCantidadDeJuegos(int cantidadDeJuegos) {
		this.cantidadDeJuegos = cantidadDeJuegos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idGaleria);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Galeria other = (Galeria) obj;
		return idGaleria == other.idGaleria;
	}
	

	
	
	
	
	
	
}
