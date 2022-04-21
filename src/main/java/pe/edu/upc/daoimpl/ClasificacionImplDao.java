package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IClasificacionDao;
import pe.edu.upc.entities.Clasificacion;


public class ClasificacionImplDao implements IClasificacionDao {

	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	
	public void insert(Clasificacion c) {
		try {
			em.persist(c);
		} catch (Exception e) {
			System.out.println("Error al insertar Clasificacion");
		}	
		
	}

	@SuppressWarnings("unchecked")
	
	public List<Clasificacion> list() {
		
			List<Clasificacion> listaPersonas = new ArrayList<Clasificacion>();

			try {
				Query jpql = em.createQuery("from Clasificacion p");
				listaPersonas = (List<Clasificacion>) jpql.getResultList();
			} catch (Exception e) {
				System.out.println("Error al listar clasificaciones");
			}
			return listaPersonas;
	}

	@Transactional
	
	public void delete(int idClasificacion) {
		
		try {
			Clasificacion c = em.find(Clasificacion.class, idClasificacion);
			em.remove(c);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}


}
