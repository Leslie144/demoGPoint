package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

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
	private Rol rol;

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

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, Rol rol, String nombre, String apellido, String usuario, String contrasena,
			Date fechaRegistro, Date fechaNacimiento, String correoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.rol = rol;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.fechaRegistro = fechaRegistro;
		this.fechaNacimiento = fechaNacimiento;
		this.correoUsuario = correoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return idUsuario == other.idUsuario;
	}

	
}
