package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Clasificacion;


public interface IClasificacionService {

	public void insert(Clasificacion p);

	public List<Clasificacion> list();

	public void delete(int idClasificacion);
}
