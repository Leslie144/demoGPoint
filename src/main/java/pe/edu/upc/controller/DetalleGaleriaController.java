package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.DetalleGaleria;
import pe.edu.upc.entities.Juego;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IDetalleGaleriaService;
import pe.edu.upc.service.IJuegoService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class DetalleGaleriaController {

	@Inject
	private IDetalleGaleriaService dgService;
	private DetalleGaleria dg;
	private List<DetalleGaleria> listaDetalleGalerias;

	@Inject
	private IJuegoService jService;
	private List<Juego> listaJuegos;

	@Inject
	private IUsuarioService uService;
	private List<Usuario> listaUsuarios;

	// constructor
	public void init() {
		this.dg = new DetalleGaleria();
		this.listaDetalleGalerias = new ArrayList<DetalleGaleria>();

		this.listaUsuarios = new ArrayList<Usuario>();

	}

	// metodos

	public String newDetalleGaleria() {

		this.setDg(new DetalleGaleria());
		return "detalleGaleria.xhtml";
	}

	public void insert() {
		try {
			dgService.insert(dg);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller detallegaleria");
		}
	}

	public void list() {
		try {
			listaDetalleGalerias = dgService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller detallegaleria");
		}
	}

	public void listJuegos() {
		try {
			listaJuegos = jService.list();
		} catch (Exception e) {
			System.out.println("Error al listar juegos en el controlador de detallegaleria");
		}
	}

	public void listUsuarios() {
		try {
			listaUsuarios = uService.list();
		} catch (Exception e) {
			System.out.println("Error al listar usuarios en el controlador de detallenotificacion");
		}
	}

	public void delete(DetalleGaleria dgo) {
		try {
			dgService.delete(dgo.getId());
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador al eliminar!!");
		}
	}

	// setters y getters
	public DetalleGaleria getDg() {
		return dg;
	}

	public void setDg(DetalleGaleria dg) {
		this.dg = dg;
	}

	public List<DetalleGaleria> getListaDetalleGalerias() {
		return listaDetalleGalerias;
	}

	public void setListaDetalleGalerias(List<DetalleGaleria> listaDetalleGalerias) {
		this.listaDetalleGalerias = listaDetalleGalerias;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
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

}
