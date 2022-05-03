package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Detallenotificacion;
import pe.edu.upc.entities.Rol;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IDetallenotificacionService;
import pe.edu.upc.service.IUsuarioService;
@Named
@RequestScoped
public class DetallenotificacionController {
	@Inject
	private IDetallenotificacionService dnService;
	
	private INotificacionService noService;
	private IJuegoService jService;
	private IUsuarioService uService;

	
	private Detallenotificacion dn;
	private List<Detallenotificacion> listaDetallenotificaciones;
	
	private List<Notificacion> listaNotificaciones;
	private List<Juego> listaJuegos;
	private List<Usuario> listaUsuarios;
	
	
	//constructor
	@PostConstruct
	public void init() {
		this.dn = new Detallenotificacion();
		this.listaDetallenotificaciones = new ArrayList<Detallenotificacion>();
		this.listaNotificaciones = new ArrayList<Notificacion>();
		this.listaJuegos = new ArrayList<Juego>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listNotificaciones();
		this.listJuegos();
		this.listUsuarios();
		this.list();
	}
	
	//metodos
	
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
	
	public void listJuegos() {
		try {
			listaJuegos = jService.list();
		} catch (Exception e) {
			System.out.println("Error al listar juegos en el controlador de detallenotificacion");
		}
	}
	
	public void listUsuarios() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de detallenotificacion");
		}
	}
	
	private void delete(Detallenotificacion dno) {
		try {
			
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en elcontroller rol");
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

	public List<Juego> getListaJuegos() {
		return listaJuegos;
	}

	public void setListaJuegos(List<Juego> listaJuegos) {
		this.listaJuegos = listaJuegos;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	
	
	
}
