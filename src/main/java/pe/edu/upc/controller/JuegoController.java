package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Vaccination;
import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.entities.Juego;
import pe.edu.upc.service.IJuegoService;

@Named
@RequestScoped
public class JuegoController {
	@Inject
	private IJuegoService jService;
	private Juego j;
	List<Juego> listaJuegos;

	@PostConstruct
	public void init() {
		this.j = new Juego();
		this.listaJuegos = new ArrayList<Juego>();
		this.list();
	}

	public String newJuego() {

		this.setJ(new Juego());
		return "juego.xhtml";
	}

	
	public void insert() {
		try {
			jService.insert(j);
			this.list();
		} catch (Exception e) {
			System.out.println("Error al insertar Juego en el controller");
		}
	}

	public void list() {
		try {
			listaJuegos = jService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Juego en el controller");
		}
	}

	public void delete(Juego j) {
		try {
			jService.delete(j.getIdJuego());
		} catch (Exception e) {
			System.out.println("Error al Eliminar Juego en el controller");
		}
	}

	public String updatePre(Juego j) {
		this.setJ(j);
		
		return "preUpdateJuego.xhtml";
	}
	
	
	public void update() {
		try {
			jService.update(this.j);
		} catch (Exception e) {
			System.out.println("Error al modificar juego en el controller");
		}
	}

	public Juego getJ() {
		return j;
	}

	public void setJ(Juego j) {
		this.j = j;
	}

	public List<Juego> getListaJuegos() {
		return listaJuegos;
	}

	public void setListaJuegos(List<Juego> listaJuegos) {
		this.listaJuegos = listaJuegos;
	}



}
