package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
public class UsuarioServiceImpl implements IUsuarioService {

	@Inject
	private IUsuarioDao uDao;

	@Override
	public void insert(Usuario us) {
		// TODO Auto-generated method stub
		uDao.insert(us);
	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return uDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		uDao.delete(id);
	}

	@Override
	public void update(Usuario id) {
		// TODO Auto-generated method stub
		uDao.update(id);
	}

	@Override
	public Usuario login(Usuario usuario) {
		List<Usuario> listUsuarios = uDao.login(usuario.getUsuario(), usuario.getContrasena());
		if (listUsuarios.isEmpty())
			return null;
		else
			return listUsuarios.get(0);
	}

}
