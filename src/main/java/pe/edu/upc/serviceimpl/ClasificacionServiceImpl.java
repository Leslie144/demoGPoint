package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IClasificacionDao;
import pe.edu.upc.entities.Clasificacion;
import pe.edu.upc.service.IClasificacionService;


@Named
public class ClasificacionServiceImpl implements IClasificacionService {

	@Inject
	private IClasificacionDao cDao;

	
	public void insert(Clasificacion p) {
		cDao.insert(p);
	}

	
	public List<Clasificacion> list() {
		
		return cDao.list();
	}

	
	public void delete(int idClasificacion) {
		
		cDao.delete(idClasificacion);
	}

}
