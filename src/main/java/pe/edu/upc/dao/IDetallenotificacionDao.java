package pe.edu.upc.dao;


import java.util.List;


import pe.edu.upc.entities.Detallenotificacion;

public interface IDetallenotificacionDao {
	
	public void insert(Detallenotificacion dn);
	
	public List<Detallenotificacion> list();
	
	public void delete(int id);
	
	public void update(Detallenotificacion id);
}
