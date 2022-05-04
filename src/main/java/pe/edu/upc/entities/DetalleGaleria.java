package pe.edu.upc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleGaleria")
public class DetalleGaleria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// @ManyToOne
	// @Column(name = "idGaleria", nullable = false)
	// private Galeria galeria;

	// @ManyTo
	// @JoinColumn(name = "idJuego", nullable = false)
	// private Juego juego;

	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;

	public DetalleGaleria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleGaleria(int id, Usuario usuario, Galeria galeria, Juego juego) {
		super();
		this.id = id;
		this.usuario = usuario;
		//this.juego = juego;
		//this.galeria = galeria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	//public Juego getJuego() {
			//return juego;
		//}

		//public void setJuego(Juego juego) {
			//this.juego = juego;
		//}
	
	//public Galeria getGaleria() {
			//return galeria;
		//}

		//public void setGaleria(Galeria galeria) {
			//this.galeria = galeria;
		//}
	
	
}
