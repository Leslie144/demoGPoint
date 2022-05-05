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
@Table(name = "DetalleResenas")
public class DetalleResenas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idReview", nullable = false)
	private Review review;

	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;

	@Column(name = "juego", length = 100, nullable = false)
	private String juego;
	
	@Column(name = "fechaPublicacion", nullable = false)
	private Date fechaPublicacion;

	public DetalleResenas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleResenas(int id, Review review, Usuario usuario, String juego, Date fechaPublicacion) {
		super();
		this.id = id;
		this.review = review;
		this.usuario = usuario;
		this.juego = juego;
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getId() {
		return id;
	}

	public Review getReview() {
		return review;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public String getJuego() {
		return juego;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
}
