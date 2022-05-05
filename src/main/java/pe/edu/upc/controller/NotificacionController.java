package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entities.Notificacion;
import pe.edu.upc.service.INotificacionService;



@Named
@RequestScoped
public class NotificacionController {
	@Inject
	private INotificacionService nService;

	private Notificacion n;
	List<Notificacion> listaNotificaciones;

	// constructor
	@PostConstruct
	public void init() {
		this.listaNotificaciones = new ArrayList<Notificacion>();
		this.n = new Notificacion();
		this.list();
	}

	// m�todos

	public String newNotificacion() {

		this.setN(new Notificacion());
		return "notificacion.xhtml";
	}

	public void insert() {
		try {
			nService.insert(n);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller Notificacion");
		}
	}

	public void list() {
		try {
			listaNotificaciones = nService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller Notificacion");
		}
	}

	public void delete(Notificacion n) {
		try {
			nService.delete(n.getIdNotificacion());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller notificacion");
		}
	}


	// getters and setters
	public Notificacion getN() {
		return n;
	}

	public void setN(Notificacion n) {
		this.n = n;
	}

	public List<Notificacion> getListaNotificaciones() {
		return listaNotificaciones;
	}

	public void setListaNotificaciones(List<Notificacion> listaNotificaciones) {
		this.listaNotificaciones = listaNotificaciones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaNotificaciones, n, nService);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotificacionController other = (NotificacionController) obj;
		return Objects.equals(listaNotificaciones, other.listaNotificaciones) && Objects.equals(n, other.n)
				&& Objects.equals(nService, other.nService);
	}


	
	

}
