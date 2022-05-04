package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDetalleGaleriaDao;
import pe.edu.upc.entities.DetalleGaleria;

public class DetalleGaleriaImplDao implements IDetalleGaleriaDao{
	
	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insert(DetalleGaleria dg) {
		try {
			em.persist(dg);
		} catch (Exception e) {
			System.out.println("Error al insertar detalle galeria en DAO");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleGaleria> list() {
		List<DetalleGaleria> listadetallegalerias = new ArrayList<DetalleGaleria>();
		try {
			
			Query jpql = em.createQuery("from DetalleGaleria dg");
			listadetallegalerias = (List<DetalleGaleria>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de detalle galeria");
		}
		return listadetallegalerias;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		try {
			DetalleGaleria dg = em.find(DetalleGaleria.class, id);
			em.remove(dg);
			
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO de detalle de galeria");
		}
		
	}
	
	@Transactional
	@Override
	public void update(DetalleGaleria id) {
		try {
			em.merge(id);
		} catch (Exception e) {
			System.out.println("Error al actualizar en el DAO de detalle de galeria");
		}
		
	}

}
