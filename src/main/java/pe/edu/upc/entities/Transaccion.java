package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaccion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTransaccion;
	
	@ManyToOne
	@JoinColumn(name = "idJuego", nullable = false)
	private Juego juego;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="precioJuego", nullable = false)
	private int precioJuego;
	
	@Column(name="fechaTransaccion", nullable = false)
	private Date fechaTransaccion;
	
	public Transaccion() {
		super();
	}
	
	public Transaccion(int idTransaccion, Juego juego, Usuario usuario, int precioJuego, Date fechaTransaccion) {
		super();
		this.idTransaccion = idTransaccion;
		this.juego = juego;
		this.usuario = usuario;
		this.precioJuego = precioJuego;
		this.fechaTransaccion = fechaTransaccion;
	}

	
	
	//Getters & Setters 
	
	public int getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getPrecioJuego() {
		return precioJuego;
	}

	public void setPrecioJuego(int precioJuego) {
		this.precioJuego = precioJuego;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}
	
}
