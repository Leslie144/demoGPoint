package pe.edu.upc.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Popularidad;
import pe.edu.upc.service.IPopularidadService;

@Named
@RequestScoped
public class PopularidadController {
	@Inject
	private IPopularidadService popService;
	
	private Popularidad pop;
	List<Popularidad> listapopularidad;
	
	//Constructor
	
	@PostConstruct
	public void init() {
		this.listapopularidad = new ArrayList<Popularidad>();
		this.pop = new Popularidad();
		this.list();
	}
	
	// Métodos

	public String newPopularidad() {

		this.setPop(new Popularidad());
		return "popularidad.xhtml";
	}
	
	
		public void insert() {
			try {
				popService.insert(pop);

			} catch (Exception e) {
				System.out.println("Error al insertar en el controller popularidad");
			}
		}

		public void list() {
			try {
				listapopularidad = popService.list();
			} catch (Exception e) {
				System.out.println("Error al listar en controller popularidad");
			}
		}

		public void delete(Popularidad pop) {
			try {
				popService.delete(pop.getIdPopularidad());
				this.list();
			} catch (Exception e) {
				System.out.println("Error al eliminar en el controller popularidad");
			}
		}
		
		//Getters & Setters
		
		public Popularidad getPop() {
			return pop;
		}

		public void setPop(Popularidad pop) {
			this.pop = pop;
		}

		public List<Popularidad> getListapopularidad() {
			return listapopularidad;
		}

		public void setListapopularidad(List<Popularidad> listapopularidad) {
			this.listapopularidad = listapopularidad;
		}

		
}
