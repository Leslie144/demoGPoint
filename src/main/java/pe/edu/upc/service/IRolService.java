package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Rol;

public interface IRolService {

	public void insert(Rol p);

	public List<Rol> list();

	public void delete(int idRol);
}
