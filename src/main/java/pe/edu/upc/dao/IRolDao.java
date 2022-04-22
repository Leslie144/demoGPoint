package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Rol;

public interface IRolDao {

	public void insert(Rol p);

	public List<Rol> list();

	public void delete(int idRol);
}
