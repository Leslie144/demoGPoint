package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.DetalleResenas;

public interface IDetalleResenaService {
	public void insert(DetalleResenas dr);

	public List<DetalleResenas> list();

	public void delete(int id);

	public void update(DetalleResenas id);
}
