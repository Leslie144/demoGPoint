package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Detallenotificacion")
public class Detallenotificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idNotificacion", nullable = false)
	private Notificacion notificacion;
	
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "idJuego", nullable = false)
	private Juego juego;

	
	
	@Column(name = "fechapublicacion", nullable = false)
	private Date fechapublicacion;

	public Detallenotificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detallenotificacion(int id, Notificacion notificacion, Juego juego, Usuario usuario, Date fechapublicacion) {
		super();
		this.id = id;
		this .juego = juego;
		this.notificacion = notificacion;
		this.usuario = usuario;
		
		this.fechapublicacion = fechapublicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public Notificacion getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	

	public Date getFechapublicacion() {
		return fechapublicacion;
	}

	public void setFechapublicacion(Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}
	
	public Juego getJuego() {
		return juego;
	}
	public void setJuego(Juego juego) {
		this.juego = juego;
	}


	

}
