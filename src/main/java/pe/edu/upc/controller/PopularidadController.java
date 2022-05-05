package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Popularidad;
import pe.edu.upc.service.IPopularidadService;

@Named
@RequestScoped
public class PopularidadController {
	@Inject
	private IPopularidadService poService;
	private Popularidad po;
	List<Popularidad> listaPopularidades;

	// constructor
	@PostConstruct
	public void init() {
		this.listaPopularidades = new ArrayList<Popularidad>();
		this.po = new Popularidad();
		this.list();
	}

	// métodos

	public String newPopularidad() {

		this.setP(new Popularidad());
		return "popularidad.xhtml";
	}

	public void insert() {
		try {
			poService.insert(po);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller Popularidada");
		}
	}

	public void list() {
		try {
			listaPopularidades = poService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller Popularidada");
		}
	}

	public void delete(Popularidad pop) {
		try {
			poService.delete(pop.getIdPopularidad());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller Popularidada");
		}
	}

	// getters and setters
	public Popularidad getP() {
		return po;
	}

	public void setP(Popularidad p) {
		this.po = p;
	}

	public List<Popularidad> getListaPopularidadas() {
		return listaPopularidades;
	}

	public void setListaPopularidadas(List<Popularidad> listaPopularidades) {
		this.listaPopularidades = listaPopularidades;
	}

}
