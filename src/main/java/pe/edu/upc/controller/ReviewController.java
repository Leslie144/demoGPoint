package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Review;
import pe.edu.upc.service.IReviewService;

@Named
@RequestScoped
public class ReviewController {
	@Inject
	private IReviewService rService;

	// ATRIBUTOS
	private Review r;
	List<Review> listaResenas;

	// MÉTODOS
	@PostConstruct
	public void init() {
		this.listaResenas = new ArrayList<Review>();
		this.r = new Review();
		this.list();
	}

	public String newReview() {
		this.setR(new Review());
		return "resena.xhtlm";
	}

	public void insert() {
		try {
			rService.insert(r);
		} catch (Exception e) {
			System.out.println("Error ocurrió en el controlador de reseña al insertar!!");
		}
	}

	public void list() {
		try {
			listaResenas = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar reseña en el controller!! ");
		}
	}

	public void delete(Review revi) {
		try {
			rService.delete(revi.getIdReview());
		} catch (Exception e) {
			System.out.println("Error ocurrió en el controlador de reseña al eliminar!!");
		}
	}
	
	// getters & setters
	public Review getR() {
		return r;
	}

	public void setR(Review r) {
		this.r = r;
	}

	public List<Review> getListaResenas() {
		return listaResenas;
	}

	public void setListaResenas(List<Review> listaResenas) {
		this.listaResenas = listaResenas;
	}
}
