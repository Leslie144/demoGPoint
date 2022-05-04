package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDetalleResenaDao;
import pe.edu.upc.entities.DetalleResenas;

public class DetalleResenaImplDao implements IDetalleResenaDao {
	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(DetalleResenas dr) {
		try {
			em.persist(dr);
		} catch (Exception e) {
			System.out.println("Error al insertar detalle reseña en el Dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleResenas> list() {
		List<DetalleResenas> listaDetalleResenas = new ArrayList<DetalleResenas>();
		try {
			Query jpql = em.createQuery("from DetalleResenas dr");
			listaDetalleResenas = (List<DetalleResenas>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de detalle de reseña");
		}
		return listaDetalleResenas;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			DetalleResenas dr = em.find(DetalleResenas.class, id);
			em.remove(dr);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO de detalle reseña");
		}
	}

	@Transactional
	@Override
	public void update(DetalleResenas id) {
		try {
			em.merge(id);
		} catch (Exception e) {
			System.out.println("Error al actualizar en el DAO de detalle reseña");
		}
	}

}
