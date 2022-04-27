package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPopularidadDao;
import pe.edu.upc.entidades.Popularidad;

public class PopularidadImplDao implements IPopularidadDao{
	
	@PersistenceContext(unitName = "gpoint")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insert(Popularidad pop) {
		try {
			em.persist(pop);
		} catch (Exception e) {
			System.out.println("Error al insertar popularidad");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Popularidad> list() {
		List<Popularidad> listaPopularidad = new ArrayList<Popularidad>();

		try {
			Query jpql = em.createQuery("from Popularidad pop");
			listaPopularidad = (List<Popularidad>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar popularidad");
		}
		return listaPopularidad;
	}
	
	
	@Transactional
	@Override
	public void delete(int idPopularidad) {
		try {
			Popularidad pop = em.find(Popularidad.class, idPopularidad);
			em.remove(pop);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}

	
}
