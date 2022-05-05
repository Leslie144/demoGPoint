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
		List<Usuario> listausuarios = new ArrayList<Usuario>();
		try {
			Query jpql = em.createQuery("from Usuario us");
			listausuarios = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el dao de usuario");
		}
		return listausuarios;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> login(String usuario, String contrasena) {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query query = em.createQuery("from Usuario u where u.usuario = ?1 and u.contrasena = ?2");
			query.setParameter(1, usuario);
			query.setParameter(2, contrasena);
			lista = (List<Usuario>) query.getResultList();

		} catch (Exception e) {
			System.out.println("Error al ingresar en el dao de usuario");
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findByNameUser(Usuario u) {
		List<Usuario> listabuscar = new ArrayList<Usuario>();
		try {
			Query jpql = em.createQuery("from Usuario us where us.usuario like?1");
			jpql.setParameter(1, "%" + u.getUsuario() + "%");
			listabuscar = (List<Usuario>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al busca en el dao de usuario");
		}
		return listabuscar;
	}

}
