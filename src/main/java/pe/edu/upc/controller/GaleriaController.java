package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Galeria;
import pe.edu.upc.service.IGaleriaService;

@Named
@RequestScoped
public class GaleriaController {

	@Inject
	private IGaleriaService gaService;

	private Galeria ga;
	private List<Galeria> listaGaleria;

	
	// contructor
	@PostConstruct
	public void init() {
		this.listaGaleria = new ArrayList<Galeria>();
		this.ga = new Galeria();
		this.list();
	}

	
	
	
	// metodos
	
	public String newGaleria() {		
		this.setGa(new Galeria());
		return "galeria.xhtml"; 
	}
	
	
	
	
	public void insert() {
		try {
			gaService.insert(ga);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar en el controlador de Galeria");
		}
	}

	public void list() {
		try {
			
			listaGaleria =  gaService.list();

		} catch (Exception e) {
			
			System.out.println("Error al listar en el controlador de Galeria");
		}
	}

	 
	public void delete(Galeria ga) {
		try {
			gaService.delete(ga.getIdGaleria());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al delete en el controlador de Galeria");
		}
	}
	
	
	///leva la data al formulario
	
	public String updatePre(Galeria ga) {
		this.setGa(ga);
		
		return "preUpdateGaleria.xhtml";
	}
	
	
	///Modificar en la BD
	
	
	public void update() {
		try {		
			gaService.update(this.ga);
				
		} catch (Exception e) {
			System.out.println("Error al update en el controlador de Galeria");
		}
	}
	
	
	
	///buscar 
	
	public void findByNameGaleria () {
		
		try {		
			listaGaleria = gaService.findByNamedGaleria(this.getGa()) ;
				
		} catch (Exception e) {
			System.out.println("Error al buscar en el controlador de Galeria");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Getter and setter
	public Galeria getGa() {
		return ga;
	}
	public void setGa(Galeria ga) {
		this.ga = ga;
	}
	public List<Galeria> getListaGaleria() {
		return listaGaleria;
	}
	public void setListaGaleria(List<Galeria> listaGaleria) {
		this.listaGaleria = listaGaleria;
	}

}
