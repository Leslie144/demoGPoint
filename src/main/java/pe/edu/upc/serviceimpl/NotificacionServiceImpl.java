package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.INotificacionDao;
import pe.edu.upc.entities.Notificacion;
import pe.edu.upc.service.INotificacionService;



@Named
public class NotificacionServiceImpl implements INotificacionService {

	@Inject
	private INotificacionDao nDao;

	
	public void insert(Notificacion n) {
		nDao.insert(n);
	}

	
	public List<Notificacion> list() {
		
		return nDao.list();
	}

	
	public void delete(int idNotificacion) {
		
		nDao.delete(idNotificacion);
	}
	
}
