package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Juego;

public interface IJuegoDao {
	public void insert(Juego j);

	public List<Juego> list();

	public void delete(int id);

	public void update(Juego id);

}
