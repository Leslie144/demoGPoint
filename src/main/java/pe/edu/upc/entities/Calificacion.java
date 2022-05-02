package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Calificacion")
public class Calificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCalificacion;
	
	@Column (name= "tipoCategoria", nullable = false)
	private int numEstrellas;
	
	//constructores
	
	public Calificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calificacion(int idCalificacion, int numEstrellas) {
		super();
		this.idCalificacion = idCalificacion;
		this.numEstrellas = numEstrellas;
	}

	//Gets and sets
	

	public int getNumEstrellas() {
		return numEstrellas;
	}

	public int getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(int idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public void setNumEstrellas(int numEstrellas) {
		this.numEstrellas = numEstrellas;
	}
	
	
}	

	