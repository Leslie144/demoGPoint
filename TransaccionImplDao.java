package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITransaccionDao;
import pe.edu.upc.entities.Transaccion;

public class TransaccionImplDao implements ITransaccionDao {

	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Transaccion tra) {
		try {

			em.persist(tra);
		} catch (Exception e) {
			System.out.println("Error al insertar transaccion en el Dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transaccion> list() {
		List<Transaccion> listaTransacciones = new ArrayList<Transaccion>();

		try {
			Query jpql = em.createQuery("from Transaccion tra");
			listaTransacciones = (List<Transaccion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de transaccion");
		}
		return listaTransacciones;
	}

	@Transactional
	public void update(Transaccion tra) {
		
		try {
			em.merge(tra);
		} catch (Exception e) {
			System.out.println("Error al modificar en el dao de transaccion");
		}
		
	}

	
	

}
