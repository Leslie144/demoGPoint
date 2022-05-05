package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IJuegoDao;
import pe.edu.upc.entities.Juego;

public class JuegoImplDao implements IJuegoDao {
	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Juego j) {
		try {
			em.persist(j);
		} catch (Exception e) {
			System.out.println("Error al insertar Juego en el Dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Juego> list() {
		List<Juego> listaRoles = new ArrayList<Juego>();
		try {
			Query jpql = em.createQuery("from Juego j");
			listaRoles = (List<Juego>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Juego en el dao");
		}
		return listaRoles;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Juego us = em.find(Juego.class, id);
			em.remove(us);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO de Juego");
		}
	}

	@Transactional
	@Override
	public void update(Juego id) {
		try {
			em.merge(id);
		} catch (Exception e) {
			System.out.println("Error al actualizar Juego en el DAO");
		}
	}


}
