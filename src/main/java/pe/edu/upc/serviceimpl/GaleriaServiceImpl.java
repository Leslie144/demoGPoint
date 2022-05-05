package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IGaleriaDao;
import pe.edu.upc.entities.Galeria;
import pe.edu.upc.service.IGaleriaService;

@Named
public class GaleriaServiceImpl implements IGaleriaService {
	
	@Inject
	private IGaleriaDao gaDao;

	@Override
	public void insert(Galeria ga) {
		// TODO Auto-generated method stub
		gaDao.insert(ga);
		
	}

	@Override
	public List<Galeria> list() {
		// TODO Auto-generated method stub
		return gaDao.list();
	}

	@Override
	public void delete(int idGaleria) {
		// TODO Auto-generated method stub
		gaDao.delete(idGaleria);	
	}

	@Override
	public void update(Galeria ga) {
		// TODO Auto-generated method stub
		
		gaDao.update(ga);
		
	}

	@Override
	public List<Galeria> findByNamedGaleria(Galeria ga) {
		// TODO Auto-generated method stub
		return gaDao.findByNamedGaleria(ga) ;
	}
	
	
	
	

}









