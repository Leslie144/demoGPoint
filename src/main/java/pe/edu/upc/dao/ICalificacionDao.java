package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.entities.Juego;

public interface ICalificacionDao {

	public void insert(Calificacion c);

	public List<Calificacion> list();

	public void delete(int idCalificacion);
	
	public void update(Calificacion id);
}
