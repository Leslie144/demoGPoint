package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Transaccion;

public interface ITransaccionService  {

	public void insert(Transaccion tra);

	public List<Transaccion> list();
	
	public void update(Transaccion tra);
	
}
