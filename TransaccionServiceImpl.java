package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITransaccionDao;
import pe.edu.upc.entities.Transaccion;
import pe.edu.upc.service.ITransaccionService;

@Named
public class TransaccionServiceImpl implements ITransaccionService{

	@Inject
	private ITransaccionDao traDao;
	
	@Override
	public void insert(Transaccion tra) {
		traDao.insert(tra);
	}

	@Override
	public List<Transaccion> list() {
		return traDao.list();
	}

	@Override
	public void update(Transaccion tra) {
		traDao.update(tra);
	}

}
