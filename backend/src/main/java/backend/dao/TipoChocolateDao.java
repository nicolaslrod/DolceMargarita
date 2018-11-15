package backend.dao;

import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.TipoChocolate.TipoChocolate;
import backend.runner.Runner;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class TipoChocolateDao extends HibernateDAO<TipoChocolate> {
    public TipoChocolateDao() {
        super(TipoChocolate.class);
    }

    public List<TipoChocolate> recuperarTodos() {
        Session session = Runner.getCurrentSession();

        String hql = "from TipoChocolate";

        Query<TipoChocolate> query = session.createQuery(hql, TipoChocolate.class);
        query.list();

        return query.getResultList();
    }
}
