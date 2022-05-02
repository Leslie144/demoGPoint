package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Clasificacion;
import pe.edu.upc.service.IClasificacionService;


@Named
@RequestScoped
public class ClasificacionController {
	@Inject
	private IClasificacionService cService;

	private Clasificacion c;
	List<Clasificacion> listaClasificaciones;

	// constructor
	@PostConstruct
	public void init() {
		this.listaClasificaciones = new ArrayList<Clasificacion>();
		this.c = new Clasificacion();
		this.list();
	}

	// métodos

	public String newClasificacion() {

		this.setC(new Clasificacion());
		return "clasificacion.xhtml";
	}

	public void insert() {
		try {
			cService.insert(c);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller Clasificacion");
		}
	}

	public void list() {
		try {
			listaClasificaciones = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller Clasificacion");
		}
	}

	public void delete(Clasificacion c) {
		try {
			cService.delete(c.getIdClasificacion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller persona");
		}
	}

	// getters and setters
	

	public Clasificacion getC() {
		return c;
	}

	public void setC(Clasificacion c) {
		this.c = c;
	}

	public List<Clasificacion> getListaClasificaciones() {
		return listaClasificaciones;
	}

	public void setListaClasificaciones(List<Clasificacion> listaPersonas) {
		this.listaClasificaciones = listaPersonas;
	}


	
	

}
