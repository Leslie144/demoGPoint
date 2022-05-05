package pe.edu.upc.serviceimpl;


import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDetalleGaleriaDao;
import pe.edu.upc.entities.DetalleGaleria;
import pe.edu.upc.service.IDetalleGaleriaService;




@Named
public class DetalleGaleriaServiceImpl implements IDetalleGaleriaService {
	
	@Inject
	private IDetalleGaleriaDao dgDao;
	
	
	
	@Override
	public void insert(DetalleGaleria dg) {
		dgDao.insert(dg);
		
	}

	@Override
	public List<DetalleGaleria> list() {
		
		return dgDao.list();
	}

	@Override
	public void delete(int id) {
		dgDao.delete(id);
		
	}

	@Override
	public void update(DetalleGaleria id) {
		dgDao.update(id);
		
	}
	

}
