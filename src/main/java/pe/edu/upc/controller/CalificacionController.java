package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.service.ICalificacionService;



@Named
@RequestScoped
public class CalificacionController {
	@Inject
	private ICalificacionService cService;

	private Calificacion c;
	List<Calificacion> listaCalificaciones;

	// constructor
	@PostConstruct
	public void init() {
		this.listaCalificaciones = new ArrayList<Calificacion>();
		this.c = new Calificacion();
		this.list();
	}

	// métodos

	public String newCalificacion() {

		this.setC(new Calificacion());
		return "calificacion.xhtml";
	}

	public void insert() {
		try {
			cService.insert(c);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller Calificacion");
		}
	}

	public void list() {
		try {
			listaCalificaciones = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller Calificacion");
		}
	}

	public void delete(Calificacion c) {
		try {
			cService.delete(c.getIdCalificacion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller Calificacion");
		}
	}
	
	public String updatePre(Calificacion c) {
		this.setC(c);

		return "preUpdateCalificacion.xhtml";
	}

	public void update() {
		try {
			cService.update(this.c);
		} catch (Exception e) {
			System.out.println("Error al modificar Calificacion en el controller");
		}
	}


	// getters and setters
	

	public Calificacion getC() {
		return c;
	}
	public void setC(Calificacion c) {
		this.c = c;
	}
	public ICalificacionService getcService() {
		return cService;
	}

	public void setcService(ICalificacionService cService) {
		this.cService = cService;
	}

	public List<Calificacion> getListaCalificaciones() {
		return listaCalificaciones;
	}

	public void setListaCalificaciones(List<Calificacion> listaCalificaciones) {
		this.listaCalificaciones = listaCalificaciones;
	}

	
	

}
