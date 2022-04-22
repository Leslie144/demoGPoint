package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCategoria;
	
	@Column (name= "tipoCategoria", nullable = false, length = 35)
	private String tipoCategoria;
	
	@Column(name = "desCategoria", nullable = false, length = 100)
	private String desCategoria;
	
	//constructores
	
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Categoria(int idCategoria, String tipoCategoria, String desCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.tipoCategoria = tipoCategoria;
		this.desCategoria = desCategoria;
	}



	//Gets and sets
	public int getIdCategoria() {
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	public String getDesCategoria() {
		return desCategoria;
	}
	public void setDesCategoria(String desCategoria) {
		this.desCategoria = desCategoria;
	}
	

	
	
	
}
