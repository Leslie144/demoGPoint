package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entidades.Popularidad;

public interface IPopularidadService {

	void insert(Popularidad pop);
	
	public List<Popularidad> list();

	public void delete(int idPopularidad);

}
