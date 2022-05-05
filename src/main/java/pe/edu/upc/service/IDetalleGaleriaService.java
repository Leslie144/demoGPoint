package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.DetalleGaleria;

public interface IDetalleGaleriaService {
public void insert(DetalleGaleria dg);
	
	public List<DetalleGaleria> list();
	
	public void delete(int id);
	
	public void update(DetalleGaleria id);
}
