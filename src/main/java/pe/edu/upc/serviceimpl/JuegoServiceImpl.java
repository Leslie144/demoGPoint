package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IJuegoDao;
import pe.edu.upc.entities.Juego;
import pe.edu.upc.service.IJuegoService;

@Named
public class JuegoServiceImpl implements IJuegoService {

	@Inject
	private IJuegoDao jDao;

	@Override
	public void insert(Juego j) {
		// TODO Auto-generated method stub
		jDao.insert(j);
	}

	@Override
	public List<Juego> list() {
		// TODO Auto-generated method stub
		return jDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		jDao.delete(id);
	}

	@Override
	public void update(Juego id) {
		// TODO Auto-generated method stub
		jDao.update(id);
	}


}
