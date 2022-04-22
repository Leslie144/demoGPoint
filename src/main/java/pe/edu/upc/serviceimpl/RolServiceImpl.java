package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.entities.Rol;
import pe.edu.upc.service.IRolService;

@Named
public class RolServiceImpl implements IRolService {

	@Inject
	private IRolDao rDao;

	@Override
	public void insert(Rol r) {
		rDao.insert(r);
	}

	@Override
	public List<Rol> list() {
		// TODO Auto-generated method stub
		return rDao.list();
	}

	@Override
	public void delete(int idRol) {
		// TODO Auto-generated method stub
		rDao.delete(idRol);
	}

}
