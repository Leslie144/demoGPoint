package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DetalleResenas;
import pe.edu.upc.entities.Detallenotificacion;
import pe.edu.upc.entities.Notificacion;

import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IDetallenotificacionService;
import pe.edu.upc.service.INotificacionService;
import pe.edu.upc.service.IUsuarioService;
@Named
@RequestScoped
public class DetallenotificacionController {
	@Inject
	private IDetallenotificacionService dnService;
	private Detallenotificacion dn;
	private List<Detallenotificacion> listaDetallenotificaciones;
	
	@Inject
	private INotificacionService noService;
	private List<Notificacion> listaNotificaciones;
	
	@Inject
	private IUsuarioService uService;
	private List<Usuario> listaUsuarios;
	

	
	
	
	//constructor
	@PostConstruct
	public void init() {
		this.dn = new Detallenotificacion();
		this.listaDetallenotificaciones = new ArrayList<Detallenotificacion>();
		this.listaNotificaciones = new ArrayList<Notificacion>();
		
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listNotificaciones();
		
		this.listUsuarios();
		this.list();
	}
	
	//metodos
	
	public String newDetallenotificacion() {

		this.setDn(new Detallenotificacion());
		return "detallenotificacion.xhtml";
	}
	
	public void insert() {
		try {
			dnService.insert(dn);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller detallenotificacion");
		}
	}
	
	public void list() {
		try {
			listaDetallenotificaciones = dnService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller detallenotificacion");
		}
	}
	
	public void listNotificaciones() {
		try {
			listaNotificaciones = noService.list();
		} catch (Exception e) {
			System.out.println("Error al listar notificaciones en el controlador de detallenotificacion");
		}
	}
	

	public void listUsuarios() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de detallenotificacion");
		}
	}
	
	public void delete(Detallenotificacion dno) {
		try {
			dnService.delete(dno.getId());
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador al eliminar!!");
		}
	}

	
	
	//getters y setters
	public Detallenotificacion getDn() {
		return dn;
	}
	public void setDn(Detallenotificacion dn) {
		this.dn = dn;
	}
	public List<Detallenotificacion> getListaDetallenotificaciones() {
		return listaDetallenotificaciones;
	}
	public void setListaDetallenotificaciones(List<Detallenotificacion> listaDetallenotificaciones) {
		this.listaDetallenotificaciones = listaDetallenotificaciones;
	}

	public List<Notificacion> getListaNotificaciones() {
		return listaNotificaciones;
	}

	public void setListaNotificaciones(List<Notificacion> listaNotificaciones) {
		this.listaNotificaciones = listaNotificaciones;
	}

	

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}


	
	
}
