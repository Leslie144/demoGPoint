package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.entities.Rol;

public class RolImplDao implements IRolDao {

	@PersistenceContext(unitName = "gpoint1")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Rol r) {
		try {
			em.persist(r);
		} catch (Exception e) {
			System.out.println("Error al insertar rol");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Rol> list() {
		List<Rol> listaRoles = new ArrayList<Rol>();

		try {
			Query jpql = em.createQuery("from Rol r");
			listaRoles = (List<Rol>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar roles");
		}
		return listaRoles;
	}

	@Transactional
	@Override
	public void delete(int idRol) {
		try {
			Rol ro = em.find(Rol.class, idRol);
			em.remove(ro);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
}
