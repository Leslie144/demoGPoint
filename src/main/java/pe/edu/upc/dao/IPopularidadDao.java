package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Popularidad;


public interface IPopularidadDao {
	
	public void insert(Popularidad pop);

	public List<Popularidad> list();

	public void delete(int idPopularidad);
}
