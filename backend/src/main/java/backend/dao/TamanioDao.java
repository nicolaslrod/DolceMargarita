package backend.dao;

import backend.entities.chocolates.Tamanio.Tamanio;
import backend.runner.Runner;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class TamanioDao extends HibernateDAO<Tamanio>{

    public TamanioDao() {
        super(Tamanio.class);
    }

    public List<Tamanio> recuperarTodos() {
        Session session = Runner.getCurrentSession();

        String hql = "from Tamanio";

        Query<Tamanio> query = session.createQuery(hql, Tamanio.class);
        query.list();

        return query.getResultList();
    }


}
