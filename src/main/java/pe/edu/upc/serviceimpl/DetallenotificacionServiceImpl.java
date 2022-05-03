package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDetallenotificacionDao;
import pe.edu.upc.entities.Detallenotificacion;
import pe.edu.upc.service.IDetallenotificacionService;

@Named
public class DetallenotificacionServiceImpl implements IDetallenotificacionService {
	@Inject
	private IDetallenotificacionDao dnDao;
	
	@Override
	public void insert(Detallenotificacion dn) {
		dnDao.insert(dn);
		
	}

	@Override
	public List<Detallenotificacion> list() {
		// TODO Auto-generated method stub
		return dnDao.list();
	}

	@Override
	public void delete(int idNotificacion) {
		dnDao.delete(idNotificacion);
		
	}

}
