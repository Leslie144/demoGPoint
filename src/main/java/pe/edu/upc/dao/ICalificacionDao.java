package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Calificacion;

public interface ICalificacionDao {

	public void insert(Calificacion c);

	public List<Calificacion> list();

	public void delete(int idCalificacion);
}
