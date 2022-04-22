package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entidades.Categoria;

public interface ICategoriaDao {
	
	public void insert (Categoria cat);
	
	public  List<Categoria> list();

	public void delete(int idCategoria);
}
