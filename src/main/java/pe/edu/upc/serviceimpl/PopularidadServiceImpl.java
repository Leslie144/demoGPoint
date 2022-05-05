package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.dao.IPopularidadDao;
import pe.edu.upc.entities.Popularidad;
import pe.edu.upc.service.IPopularidadService;

@Named
public class PopularidadServiceImpl implements IPopularidadService {

	@Inject
	private IPopularidadDao poDao;

	@Override
	public void insert(Popularidad po) {
		poDao.insert(po);
	}

	@Override
	public List<Popularidad> list() {
		// TODO Auto-generated method stub
		return poDao.list();
	}

	@Override
	public void delete(int idPopularidad) {
		poDao.delete(idPopularidad);
	}

}
