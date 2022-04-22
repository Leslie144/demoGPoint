package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICategoriaDao;
import pe.edu.upc.entities.Categoria;
import pe.edu.upc.service.ICategoriaService;


@Named
public class CategoriaServiceImpl implements ICategoriaService{
	
	@Inject
	private ICategoriaDao caDao;

	@Override
	public void insert(Categoria ca) {
		// TODO Auto-generated method stub
		caDao.insert(ca);
		
	}

	@Override
	public List<Categoria> list() {
		// TODO Auto-generated method stub
		return caDao.list();
	}

	@Override
	public void delete(int idCategoria) {
		// TODO Auto-generated method stub
		
		caDao.delete(idCategoria);
	}
	
	
	

}
