package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Detallenotificacion;

public interface IDetallenotificacionService {
	
	public void insert(Detallenotificacion dn);
	
	public List<Detallenotificacion> list();
	
	public void delete(int idNotificacion);
}
