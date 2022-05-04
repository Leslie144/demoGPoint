package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Transaccion;

public interface ITransaccionDao {
	
	public void insert(Transaccion tra);

	public List<Transaccion> list();
	
	public void update(Transaccion tra);
}
