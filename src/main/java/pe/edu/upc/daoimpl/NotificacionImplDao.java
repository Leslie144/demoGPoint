package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.INotificacionDao;
import pe.edu.upc.entities.Notificacion;

public class NotificacionImplDao implements INotificacionDao {

	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	public void insert(Notificacion n) {
		try {
			em.persist(n);
		} catch (Exception e) {
			System.out.println("Error al insertar Notificacion");
		}

	}

	@SuppressWarnings("unchecked")

	public List<Notificacion> list() {

		List<Notificacion> listaNotificaciones = new ArrayList<Notificacion>();

		try {
			Query jpql = em.createQuery("from Notificacion n");
			listaNotificaciones = (List<Notificacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Notificacion en el Dao");
		}
		return listaNotificaciones;
	}

	@Transactional
	public void delete(int idNotificacion) {

		try {
			Notificacion n = em.find(Notificacion.class, idNotificacion);
			em.remove(n);
		} catch (Exception e) {

			System.out.println("Error al eliminar notificacion en el dao");
		}
	}

}
