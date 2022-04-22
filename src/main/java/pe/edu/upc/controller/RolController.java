package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Rol;
import pe.edu.upc.service.IRolService;

@Named
@RequestScoped
public class RolController {
	@Inject
	private IRolService rService;

	private Rol r;
	List<Rol> listaRoles;

	// constructor
	@PostConstruct
	public void init() {
		this.listaRoles = new ArrayList<Rol>();
		this.r = new Rol();
		this.list();
	}

	// metodos

	public String newPerson() {

		this.setP(new Rol());
		return "rol.xhtml";
	}

	public void insert() {
		try {
			rService.insert(r);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller rol");
		}
	}

	public void list() {
		try {
			listaRoles = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller rol");
		}
	}

	public void delete(Rol per) {
		try {
			rService.delete(per.getIdRol());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller rol");
		}
	}

	// getters and setters
	public Rol getP() {
		return r;
	}

	public void setP(Rol r) {
		this.r = r;
	}

	public List<Rol> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Rol> listaRoles) {
		this.listaRoles = listaRoles;
	}

}
