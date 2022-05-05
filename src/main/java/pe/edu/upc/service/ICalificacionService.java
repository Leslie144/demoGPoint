package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.entities.Juego;


public interface ICalificacionService {

	public void insert(Calificacion p);

	public List<Calificacion> list();

	public void delete(int idCalificacion);
	
	public void update(Calificacion id);
}
