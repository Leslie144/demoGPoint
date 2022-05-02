package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Calificacion;


public interface ICalificacionService {

	public void insert(Calificacion p);

	public List<Calificacion> list();

	public void delete(int idCalificacion);
}
