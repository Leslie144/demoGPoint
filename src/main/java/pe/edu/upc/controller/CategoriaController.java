package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Categoria;
import pe.edu.upc.service.ICategoriaService;

@Named
@RequestScoped
public class CategoriaController 
	
	@Inject
	private ICategoriaService caService;
	
	
	private Categoria ca;
	private List<Categoria> listaCategorias;
	
	
	//consturctor
	
	@PostConstruct
	public void init() {
		this.ca=new Categoria();
		this.listaCategorias= new ArrayList<Categoria>();
		this.list();
	}
	
	
	public String newCategoria() {
		this.setCa(new Categoria());
		return "Categorias.xhtml";
	}
	
	
	//metodos
	public void insert() {
		try {	
			caService.insert(ca);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador de categoria");
		}
	}
	
	public void list() {
		try {
			listaCategorias = caService.list();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar en el controlador de categoria");
		}
		
	}
	
	
	public void delete(Categoria ca) {
		try {
			caService.delete(ca.getIdCategoria());
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador de categoria");
		}
	}
	
	
	
	
	
	
	//get and set
	public Categoria getCa() {
		return ca;
	}
	public void setCa(Categoria ca) {
		this.ca = ca;
	}
	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}
	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
	
	
	
	
	
	
	
	

}
