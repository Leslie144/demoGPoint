package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICalificacionDao;
import pe.edu.upc.entities.Calificacion;
import pe.edu.upc.service.ICalificacionService;



@Named
public class CalificacionServiceImpl implements ICalificacionService {

	@Inject
	private ICalificacionDao cDao;

	
	public void insert(Calificacion p) {
		cDao.insert(p);
	}

	
	public List<Calificacion> list() {
		
		return cDao.list();
	}

	
	public void delete(int idClasificacion) {
		
		cDao.delete(idClasificacion);
	}

}
