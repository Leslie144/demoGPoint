package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Juego;

public interface IJuegoService {
	public void insert(Juego j);

	public List<Juego> list();

	public void delete(int id);

	public void update(Juego id);
	

}
