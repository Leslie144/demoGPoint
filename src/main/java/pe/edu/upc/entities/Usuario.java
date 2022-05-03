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
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;

	@ManyToOne
	@JoinColumn(name = "idRol", nullable = false)
	private Rol idRol;

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Column(name = "apellido", length = 100, nullable = false)
	private String apellido;

	@Column(name = "usuario", length = 50, nullable = false)
	private String usuario;

	@Column(name = "contrasena", length = 10, nullable = false)
	private String contrasena;

	@Column(name = "fechaRegistro", nullable = false)
	private Date fechaRegistro;

	@Column(name = "fechaNacimiento", nullable = false)
	private Date fechaNacimiento;

	@Column(name = "correoUsuario", length = 50, nullable = false)
	private String correoUsuario;

}
