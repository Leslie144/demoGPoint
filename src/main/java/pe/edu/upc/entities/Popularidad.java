package pe.edu.upc.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Popularidad")
public class Popularidad {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPopularidad;
	
	@Column(name="tipoPopularidad", nullable = false, length = 45 )
	private String tipoPopularidad;
	
	//Constructor
	
	public Popularidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Popularidad(int idPopularidad, String tipoPopularidad) {
		super();
		this.idPopularidad = idPopularidad;
		this.tipoPopularidad = tipoPopularidad;
	}
	
	
	//Getters & Setters
	
	public int getIdPopularidad() {
		return idPopularidad;
	}

	public void setIdPopularidad(int idPopularidad) {
		this.idPopularidad = idPopularidad;
	}

	public String getTipoPopularidad() {
		return tipoPopularidad;
	}

	public void setTipoPopularidad(String tipoPopularidad) {
		this.tipoPopularidad = tipoPopularidad;
	}


	
}
