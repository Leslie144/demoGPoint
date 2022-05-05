package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IGaleriaDao;
import pe.edu.upc.entities.Galeria;

public class GaleriaImplDao implements IGaleriaDao {

	@PersistenceContext(unitName = "demoSX61v1")
	private EntityManager em; // referencia al persisten

	
	@Transactional
	@Override
	public void insert(Galeria ga) {
		// TODO Auto-generated method stub}
		try {
			em.persist(ga);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Error al insertar Galeria en el  Dao");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Galeria> list() {
		
		List<Galeria> listaGalerias = new ArrayList<Galeria>();

		try {

			Query jpql = em.createQuery("from Galeria ga");
			listaGalerias = (List<Galeria>) jpql.getResultList();

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Error al listar Galeria en el  Dao");
		}

		return listaGalerias;
	}
	
	@Transactional
	@Override
	public void delete(int idGaleria) {
		// TODO Auto-generated method stub

		try {

			Galeria gale = em.find(Galeria.class, idGaleria);
			em.remove(gale);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Error al eliminar Galeria en el dao");
		}

	}
	
	////
	@Transactional
	@Override
	public void update(Galeria ga) {
		
		try {
			em.merge(ga); //para actualizar el metodo es merge
			
		} catch (Exception e) {
			System.out.println("Error al actualizar Galeria en el dao");
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Galeria> findByNamedGaleria(Galeria ga) {
				
		List<Galeria> lista = new ArrayList<Galeria>();
		try {
			
			Query q = em.createQuery("from Galeria ga where ga.nombreGaleria like ?1");
			q.setParameter(1, "%"+ ga.getNombreGaleria() + "%");		
			lista = (List<Galeria>) q.getResultList();
			
		} catch (Exception e) {
			System.out.println("Error al buscar Galeria en el dao");
		}
		
		return lista;
	}

	
	
	
}
