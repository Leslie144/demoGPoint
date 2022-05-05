package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Galeria;

public interface IGaleriaService {
	
	public void insert(Galeria ga);
	public List<Galeria> list();
	public void delete(int idGaleria);
	
	
	public void update(Galeria ga);
	
	public List<Galeria> findByNamedGaleria(Galeria ga);
	 
}
