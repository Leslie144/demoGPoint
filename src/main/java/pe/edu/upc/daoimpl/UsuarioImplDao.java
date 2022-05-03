package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioImplDao implements IUsuarioDao {
	@PersistenceContext(unitName = "demoGPoint")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Usuario us) {
		try {
			em.persist(us);
		} catch (Exception e) {
			System.out.println("Error al insertar usuario en el Dao");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		List<Usuario> listaRoles = new ArrayList<Usuario>();
		try {
			Query jpql = em.createQuery("from Usuario us");
			listaRoles = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de usuario");
		}
		return listaRoles;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Usuario us = em.find(Usuario.class, id);
			em.remove(us);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO de usuario");
		}
	}

	@Transactional
	@Override
	public void update(Usuario id) {
		try {
			em.merge(id);
		} catch (Exception e) {
			System.out.println("Error al actualizar en el DAO de usuario");
		}
	}

}
