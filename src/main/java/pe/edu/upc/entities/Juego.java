package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Juego")
public class Juego {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idJuego;

	@OneToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria idcategoria;

	@OneToOne
	@JoinColumn(name = "idClasificacion", nullable = false)
	private Clasificacion idclasificacion;

	@OneToOne
	@JoinColumn(name = "idCalificacion", nullable = false)
	private Calificacion idcalificacion;

	@OneToOne
	@JoinColumn(name = "idPopularidad", nullable = false)
	private Popularidad idpopularidad;

	@Column(name = "nombreJuego", length = 30, nullable = false)
	private String nombreJuego;

	@Column(name = "descripcion",length = 200, nullable = false)
	private String descripcion;

	@Column(name = "fechaLanzamiento", nullable = false)
	private Date fechaLanzamiento;

	@Column(name = "tamanoJuego", nullable = false)
	private int tamanoJuego;
	
	@Column(name = "precioJuego", nullable = false)
	private float precioJuego;

	public Juego() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juego(int idJuego, Categoria idcategoria, Clasificacion idclasificacion, Calificacion idcalificacion,
			Popularidad idpopularidad, String nombreJuego, String descripcion, Date fechaLanzamiento, int tamanoJuego,
			float precioJuego) {
		super();
		this.idJuego = idJuego;
		this.idcategoria = idcategoria;
		this.idclasificacion = idclasificacion;
		this.idcalificacion = idcalificacion;
		this.idpopularidad = idpopularidad;
		this.nombreJuego = nombreJuego;
		this.descripcion = descripcion;
		this.fechaLanzamiento = fechaLanzamiento;
		this.tamanoJuego = tamanoJuego;
		this.precioJuego = precioJuego;
	}

	public int getIdJuego() {
		return idJuego;
	}

	public Categoria getIdcategoria() {
		return idcategoria;
	}

	public Clasificacion getIdclasificacion() {
		return idclasificacion;
	}

	public Calificacion getIdcalificacion() {
		return idcalificacion;
	}

	public Popularidad getIdpopularidad() {
		return idpopularidad;
	}

	public String getNombreJuego() {
		return nombreJuego;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public int getTamanoJuego() {
		return tamanoJuego;
	}

	public float getPrecioJuego() {
		return precioJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public void setIdcategoria(Categoria idcategoria) {
		this.idcategoria = idcategoria;
	}

	public void setIdclasificacion(Clasificacion idclasificacion) {
		this.idclasificacion = idclasificacion;
	}

	public void setIdcalificacion(Calificacion idcalificacion) {
		this.idcalificacion = idcalificacion;
	}

	public void setIdpopularidad(Popularidad idpopularidad) {
		this.idpopularidad = idpopularidad;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public void setTamanoJuego(int tamanoJuego) {
		this.tamanoJuego = tamanoJuego;
	}

	public void setPrecioJuego(float precioJuego) {
		this.precioJuego = precioJuego;
	}
	
}


