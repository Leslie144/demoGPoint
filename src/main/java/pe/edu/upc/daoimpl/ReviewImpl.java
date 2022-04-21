package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReviewDao;
import pe.edu.upc.entities.Review;

public class ReviewImpl implements IReviewDao {
	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Review r) {
		try {
			em.persist(r);
		} catch (Exception e) {
			System.out.println("Error al insertar rese�a en DAO");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Review> list() {
		List<Review> listaResenas = new ArrayList<Review>();
		try {
			Query jpql = em.createQuery("from Review r");
			listaResenas = (List<Review>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de rese�a");
		}
		return listaResenas;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Review rev = em.find(Review.class, id);
			em.remove(rev);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO de rese�a");
		}
	}

	@Transactional
	@Override
	public void update(Review id) {
		// TODO Auto-generated method stub

	}

}
