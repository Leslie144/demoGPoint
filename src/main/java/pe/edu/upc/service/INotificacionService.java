package pe.edu.upc.service;

import java.util.List;
import pe.edu.upc.entities.Notificacion;

public interface INotificacionService {
	
	public void insert(Notificacion n);
	
	public List<Notificacion> list();
	
	public void delete(int idNotificacion);
	

}
