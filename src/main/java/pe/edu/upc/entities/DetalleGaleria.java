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

	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;

	public DetalleGaleria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleGaleria(int id, Usuario usuario) {
		super();
		this.id = id;
		this.usuario = usuario;
		
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
	
	
	
	
}
