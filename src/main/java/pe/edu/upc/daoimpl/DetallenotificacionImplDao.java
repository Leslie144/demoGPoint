package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDetallenotificacionDao;

import pe.edu.upc.entities.Detallenotificacion; 

public class DetallenotificacionImplDao implements IDetallenotificacionDao {
	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Detallenotificacion dn) {
		try {
			em.persist(dn);
		} catch (Exception e) {
			System.out.println("Error al insertar detalle de notificacion en el dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Detallenotificacion> list() {
		List<Detallenotificacion> listadetallenotificaciones = new ArrayList<Detallenotificacion>();
		try {
			
			Query jpql = em.createQuery("from Detallenotificacion dn");
			listadetallenotificaciones =(List<Detallenotificacion>) jpql.getResultList();
			
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de detalle de notificacion");
		}
		
		return listadetallenotificaciones;
	}
	
	@Transactional
	@Override
	public void delete(int idNotificacion) {
		try {
			Detallenotificacion dn = em.find(Detallenotificacion.class, idNotificacion);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el dao");
		}
		
	}

}
