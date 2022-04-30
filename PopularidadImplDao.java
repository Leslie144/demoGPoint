package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPopularidadDao;
import pe.edu.upc.entidades.Popularidad;

public class PopularidadImplDao implements IPopularidadDao {

	@PersistenceContext(unitName = "demoSX61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Popularidad po) {
		try {
			em.persist(po);
		} catch (Exception e) {
			System.out.println("Error al insertar Popularidad");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Popularidad> list() {
		List<Popularidad> listaPopularidades = new ArrayList<Popularidad>();

		try {
			Query jpql = em.createQuery("from Popularidad po");
			listaPopularidades = (List<Popularidad>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar Popularidadas");
		}
		return listaPopularidades;
	}

	@Transactional
	@Override
	public void delete(int idPopularidad) {
		try {
			Popularidad po = em.find(Popularidad.class, idPopularidad);
			em.remove(po);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
}
