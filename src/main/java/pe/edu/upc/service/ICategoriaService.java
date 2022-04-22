package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Categoria;

public interface ICategoriaService {
	
	public void insert(Categoria ca);
	public List<Categoria> list();
	public void delete(int idCategoria);
	

}
