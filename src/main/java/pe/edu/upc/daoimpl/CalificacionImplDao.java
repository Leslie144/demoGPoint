package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICalificacionDao;
import pe.edu.upc.entities.Calificacion;

public class CalificacionImplDao implements ICalificacionDao {

	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	public void insert(Calificacion c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar Calificacion");
		}

	}

	@SuppressWarnings("unchecked")

	public List<Calificacion> list() {

		List<Calificacion> listaPersonas = new ArrayList<Calificacion>();

		try {
			Query jpql = em.createQuery("from Calificacion p");
			listaPersonas = (List<Calificacion>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Calificacion en el Dao");
		}
		return listaPersonas;
	}

	@Transactional
	public void delete(int idCalificacion) {

		try {
			Calificacion c = em.find(Calificacion.class, idCalificacion);
			em.remove(c);
		} catch (Exception e) {

			System.out.println("Error al eliminar calificación en el dao");
		}
	}

}
