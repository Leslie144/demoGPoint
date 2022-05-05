package pe.edu.upc.entities;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clasificacion")
public class Clasificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idClasificacion;

	@Column(name = "tipoClasificacion", nullable = false, length = 3)
	private String tipoClasificacion;
	
	@Column(name = "aptoPara", nullable = false, length = 20)
	private String aptoPara;
	
	public Clasificacion() {
		super();
	}

	public Clasificacion(int idClasificacion, String tipoClasificacion, String aptoPara) {
		super();
		this.idClasificacion = idClasificacion;
		this.tipoClasificacion = tipoClasificacion;
		this.aptoPara = aptoPara;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idClasificacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clasificacion other = (Clasificacion) obj;
		return idClasificacion == other.idClasificacion;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getTipoClasificacion() {
		return tipoClasificacion;
	}

	public void setTipoClasificacion(String tipoClasificacion) {
		this.tipoClasificacion = tipoClasificacion;
	}

	public String getAptoPara() {
		return aptoPara;
	}

	public void setAptoPara(String aptoPara) {
		this.aptoPara = aptoPara;
	}
	

}
