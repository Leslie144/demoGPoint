package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Notificacion;

public interface INotificacionDao {

	public void insert(Notificacion n);

	public List<Notificacion> list();

	public void delete(int idNotificacion);
}
