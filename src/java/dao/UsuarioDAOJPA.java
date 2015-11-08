package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Usuario;
import utils.JPAUtils;

public class UsuarioDAOJPA implements UsuarioDAO {

    @Override
    public void remover(Usuario u) {
        EntityManager em = JPAUtils.getEntityManager();
        em.getTransaction().begin();        
        em.remove(em.merge(u));
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void salvar(Usuario u) {
        EntityManager em = JPAUtils.getEntityManager();
        em.getTransaction().begin();
        if (u.getId() == null) {
            em.persist(u);
        } else {
            em.merge(u);
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Usuario buscarPorId(int id) {
        EntityManager em = JPAUtils.getEntityManager();
        Usuario usuario = em.find(Usuario.class, id);
        em.close();
        return (usuario);
    }

    @Override
    public Usuario buscarPorMatricula(int matricula) {
       EntityManager em = JPAUtils.getEntityManager();
        Usuario usuario = em.find(Usuario.class, matricula);
        em.close();
        return (usuario); 
    }

    @Override
    public List<Usuario> listar() {
        EntityManager em = JPAUtils.getEntityManager();
        List<Usuario> listaUsuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
        em.close();
        return (listaUsuarios);
    }
    
}
