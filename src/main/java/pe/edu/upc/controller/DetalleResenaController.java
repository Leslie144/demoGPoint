package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DetalleResenas;
import pe.edu.upc.entities.Juego;
import pe.edu.upc.entities.Review;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IDetalleResenaService;
import pe.edu.upc.service.IJuegoService;
import pe.edu.upc.service.IReviewService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class DetalleResenaController {
	@Inject
	private IDetalleResenaService drService;
	private DetalleResenas dr;
	List<DetalleResenas> listaDetallesResenas;

	@Inject
	private IReviewService rService;
	private List<Review> listaResenas;

	@Inject
	private IUsuarioService uService;
	private List<Usuario> listaUsuarios;

	@Inject
	private IJuegoService jService;
	private List<Juego> listaJuegos;

	@PostConstruct
	public void init() {
		this.dr = new DetalleResenas();
		this.listaDetallesResenas = new ArrayList<DetalleResenas>();
		this.listaResenas = new ArrayList<Review>();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaJuegos = new ArrayList<Juego>();
		this.list();
		this.listReview();
		this.listUsers();
		this.listPlay();

	}

	public String newDetailReview() {
		this.setDr(new DetalleResenas());
		return "detalleResena.xhtml";
	}

	public void insert() {
		try {
			drService.insert(dr);
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void list() {
		try {
			listaDetallesResenas = drService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listReview() {
		try {
			listaResenas = rService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listUsers() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void listPlay() {
		try {
			listaJuegos = jService.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void delete(DetalleResenas dere) {
		try {
			drService.delete(dere.getId());
		} catch (Exception e) {
			System.out.println("Error ocurrió en el controlador de usuario al eliminar!!");
		}
	}

	
	
	
	public DetalleResenas getDr() {
		return dr;
	}

	public List<DetalleResenas> getListaDetallesResenas() {
		return listaDetallesResenas;
	}

	public List<Review> getListaResenas() {
		return listaResenas;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setDr(DetalleResenas dr) {
		this.dr = dr;
	}

	public void setListaDetallesResenas(List<DetalleResenas> listaDetallesResenas) {
		this.listaDetallesResenas = listaDetallesResenas;
	}

	public void setListaResenas(List<Review> listaResenas) {
		this.listaResenas = listaResenas;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Juego> getListaJuegos() {
		return listaJuegos;
	}

	public void setListaJuegos(List<Juego> listaJuegos) {
		this.listaJuegos = listaJuegos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dr, drService, jService, listaDetallesResenas, listaJuegos, listaResenas, listaUsuarios,
				rService, uService);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleResenaController other = (DetalleResenaController) obj;
		return Objects.equals(dr, other.dr) && Objects.equals(drService, other.drService)
				&& Objects.equals(jService, other.jService)
				&& Objects.equals(listaDetallesResenas, other.listaDetallesResenas)
				&& Objects.equals(listaJuegos, other.listaJuegos) && Objects.equals(listaResenas, other.listaResenas)
				&& Objects.equals(listaUsuarios, other.listaUsuarios) && Objects.equals(rService, other.rService)
				&& Objects.equals(uService, other.uService);
	}



}
