package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idNotificacion;

	@Column(name = "mensaje", nullable = false, length = 100)
	private String mensaje;

	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idNotificacion);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notificacion other = (Notificacion) obj;
		return idNotificacion == other.idNotificacion;
	}

	//Getters & Setters
	public Notificacion(int idNotificacion, String mensaje) {
		super();
		this.idNotificacion = idNotificacion;
		this.mensaje = mensaje;
	}

	public int getIdNotificacion() {
		return idNotificacion;
	}

	public void setIdNotificacion(int idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
