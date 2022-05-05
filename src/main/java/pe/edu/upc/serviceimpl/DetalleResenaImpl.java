package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDetalleResenaDao;
import pe.edu.upc.entities.DetalleResenas;
import pe.edu.upc.service.IDetalleResenaService;

@Named
public class DetalleResenaImpl implements IDetalleResenaService{
	@Inject
	private IDetalleResenaDao drDao;

	@Override
	public void insert(DetalleResenas dr) {
		// TODO Auto-generated method stub
		drDao.insert(dr);
	}

	@Override
	public List<DetalleResenas> list() {
		// TODO Auto-generated method stub
		return drDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		drDao.delete(id);
	}

	@Override
	public void update(DetalleResenas id) {
		// TODO Auto-generated method stub
		drDao.update(id);
	}
	
}
