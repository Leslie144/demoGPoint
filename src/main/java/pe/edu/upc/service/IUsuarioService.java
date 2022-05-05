package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioService {
	public void insert(Usuario us);

	public List<Usuario> list();

	public void delete(int id);

	public void update(Usuario id);
	
	public List<Usuario> findByNameUser(Usuario u);
	
	public Usuario login(Usuario usuario);
}
