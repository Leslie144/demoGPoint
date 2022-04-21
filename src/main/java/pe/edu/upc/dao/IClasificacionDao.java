package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Clasificacion;


public interface IClasificacionDao {

	public void insert(Clasificacion c);

	public List<Clasificacion> list();

	public void delete(int idClasificacion);
}
