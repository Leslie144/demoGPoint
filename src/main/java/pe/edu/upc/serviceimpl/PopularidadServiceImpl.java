package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entidades.Popularidad;
import pe.edu.upc.service.IPopularidadService;

@Named
public class PopularidadServiceImpl implements IPopularidadService{
	
	@Inject
	private IPopularidadService popDao;
	
	@Override
	public void insert(Popularidad pop) {
		popDao.insert(pop);
	}
	
	@Override
	public List<Popularidad> list(){
		return popDao.list();
	}
	
	@Override
	public void delete(int idPopularidad) {
		popDao.delete(idPopularidad);
	}
	
	
}
