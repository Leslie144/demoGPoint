package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICategoriaDao;
import pe.edu.upc.entities.Categoria;

public class CategoriaImplDao implements ICategoriaDao {
	
	@PersistenceContext(unitName = "demoSX61v1")
	private EntityManager em;
	

	@Transactional 
	@Override
	public void insert(Categoria cat) {
		// TODO Auto-generated method stub
		try {		
			em.persist(cat);
					
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Error al insertar Categoria en el  Dao");
		}						
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> list() {
		// TODO Auto-generated method stub
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		
		try {
			
			Query jpql= em.createQuery("from Categoria cat");
			listaCategorias= (List<Categoria>)jpql.getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception			
			System.out.println("Error al listar en el dao de categoria");
		}
				
		return listaCategorias;
	}


	@Transactional
	@Override
	public void delete(int idCategoria) {
		// TODO Auto-generated method stub
		try {
			
			Categoria cate=em.find(Categoria.class, idCategoria);
			em.remove(cate);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Error al eliminar categoria en el dao");
		}
				
	}
	
		
}
