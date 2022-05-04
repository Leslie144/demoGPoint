package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Juego;
import pe.edu.upc.entities.Transaccion;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IJuegoService;
import pe.edu.upc.service.ITransaccionService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class TransaccionController {

	@Inject
	private ITransaccionService traService;
	private Transaccion tra;
	List<Transaccion> listaTransacciones;
	
	@Inject
	private IJuegoService jService;
	private List<Juego> listaJuegos;

	@Inject
	private IUsuarioService uService;
	private List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		this.tra = new Transaccion();
		this.listaTransacciones = new ArrayList<Transaccion>();
		this.listaJuegos = new ArrayList<Juego>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.list();
		this.listJuegos();
		this.listUsuarios();
	}
	
	public void insert() {
		try {
			
			traService.insert(tra);
		
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void list() {
		try {
			listaTransacciones = traService.list();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void listJuegos() {
		try {
			listaJuegos = jService.list();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void listUsuarios() {
		try {
			listaUsuarios = uService.list();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//lleva la data al formulario
	
	/*public String updatePre(Vaccination vac) {
		this.setVa(vac);
		
		return "preUpdate.xhtml";
	}
	
	//Modificación en BD
	public void update() {
		try {
			vaService.update(this.va);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controlador de vacunación");
		}
	}*/
	
    //getters & setters	
	public Transaccion getTra() {
		return tra;
	}

	public void setTra(Transaccion tra) {
		this.tra = tra;
	}

	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(List<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
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
