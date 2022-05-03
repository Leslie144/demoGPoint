package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {
	public void insert(Usuario us);

	public List<Usuario> list();

	public void delete(int id);

	public void update(Usuario id);
}
