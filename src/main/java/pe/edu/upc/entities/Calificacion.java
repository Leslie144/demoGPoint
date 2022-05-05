package pe.edu.upc.entities;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(idCalificacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calificacion other = (Calificacion) obj;
		return idCalificacion == other.idCalificacion;
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

	