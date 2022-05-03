package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Rol;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IRolService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService usService;
	private Usuario us;
	List<Usuario> listaUsuarios;

	@Inject
	private IRolService rService;
	private List<Rol> listaRoles;

	@PostConstruct
	public void init() {
		this.us = new Usuario();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaRoles = new ArrayList<Rol>();
		this.list();
		this.listRol();

	}

	public String newUsuario() {
		this.setUs(new Usuario());
		return "usuario.xhtml";
	}

	public void insert() {
		try {
			usService.insert(us);
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void list() {
		try {
			listaUsuarios = usService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listRol() {
		try {
			listaRoles = rService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void delete(Usuario usua) {
		try {
			usService.delete(usua.getIdUsuario());
		} catch (Exception e) {
			System.out.println("Error ocurrió en el controlador de usuario al eliminar!!");
		}
	}

	public Usuario getUs() {
		return us;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public List<Rol> getListaRoles() {
		return listaRoles;
	}

	public void setUs(Usuario us) {
		this.us = us;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaRoles, listaUsuarios, rService, us, usService);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioController other = (UsuarioController) obj;
		return Objects.equals(listaRoles, other.listaRoles) && Objects.equals(listaUsuarios, other.listaUsuarios)
				&& Objects.equals(rService, other.rService) && Objects.equals(us, other.us)
				&& Objects.equals(usService, other.usService);
	}

}
