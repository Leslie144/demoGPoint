package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.entities.Categoria;
import pe.edu.upc.entities.Clasificacion;
import pe.edu.upc.entities.Juego;
import pe.edu.upc.entities.Popularidad;
import pe.edu.upc.service.ICalificacionService;
import pe.edu.upc.service.ICategoriaService;
import pe.edu.upc.service.IClasificacionService;
import pe.edu.upc.service.IJuegoService;
import pe.edu.upc.service.IPopularidadService;

@Named
@RequestScoped
public class JuegoController {
	@Inject
	private IJuegoService jService;
	private Juego j;
	List<Juego> listaJuegos;

	@Inject
	private ICategoriaService cService;
	private List<Categoria> listaCategorias;

	@Inject
	private IClasificacionService clService;
	private List<Clasificacion> listaClasificaciones;

	@Inject
	private ICalificacionService caService;
	private List<Calificacion> listaCalificaciones;

	@Inject
	private IPopularidadService pService;
	private List<Popularidad> listaPopularidad;

	@PostConstruct
	public void init() {
		this.j = new Juego();
		this.listaJuegos = new ArrayList<Juego>();
		this.listaCategorias = new ArrayList<Categoria>();
		this.listaClasificaciones = new ArrayList<Clasificacion>();
		this.listaCalificaciones = new ArrayList<Calificacion>();
		this.listaPopularidad = new ArrayList<Popularidad>();
		this.list();
		this.listCategorias();
		this.listClasificaciones();
		this.listCalificaciones();
		this.listPopularidad();

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

	public void listCategorias() {
		try {
			listaCategorias = cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Categoria en el controller");
		}
	}

	public void listClasificaciones() {
		try {
			listaClasificaciones = clService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Clasificaciones en el controller");
		}
	}

	public void listCalificaciones() {
		try {
			listaCalificaciones = caService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Calificaciones en el controller");
		}
	}

	public void listPopularidad() {
		try {
			listaPopularidad = pService.list();
		} catch (Exception e) {
			System.out.println("Error al listar Popularidad en el controller");
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

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public List<Clasificacion> getListaClasificaciones() {
		return listaClasificaciones;
	}

	public void setListaClasificaciones(List<Clasificacion> listaClasificaciones) {
		this.listaClasificaciones = listaClasificaciones;
	}

	public List<Calificacion> getListaCalificaciones() {
		return listaCalificaciones;
	}

	public void setListaCalificaciones(List<Calificacion> listaCalificaciones) {
		this.listaCalificaciones = listaCalificaciones;
	}

	public List<Popularidad> getListaPopularidad() {
		return listaPopularidad;
	}

	public void setListaPopularidad(List<Popularidad> listaPopularidad) {
		this.listaPopularidad = listaPopularidad;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(jService,j,listaJuegos,cService,listaCategorias,clService,listaClasificaciones,caService,listaCalificaciones,pService,listaPopularidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JuegoController other = (JuegoController) obj;
		return Objects.equals(jService, other.jService) && Objects.equals(j, other.j)
				&& Objects.equals(listaJuegos, other.listaJuegos) && Objects.equals(cService, other.cService)
				&& Objects.equals(listaCategorias, other.listaCategorias)&& Objects.equals(clService, other.clService)
				&& Objects.equals(listaClasificaciones, other.listaClasificaciones)&& Objects.equals(caService, other.caService)
				&& Objects.equals(listaCalificaciones, other.listaCalificaciones)&& Objects.equals(pService, other.pService)
				&& Objects.equals(listaPopularidad, other.listaPopularidad);
	}

}
