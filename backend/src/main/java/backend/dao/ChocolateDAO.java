package backend.dao;

import backend.entities.chocolates.Chocolate;
import backend.runner.Runner;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ChocolateDAO extends HibernateDAO<Chocolate> {

    public ChocolateDAO() { super(Chocolate.class);}


    public List<Chocolate> getChocolates() {
        Session session = Runner.getCurrentSession();

        String hql = "from Chocolate";

        Query<Chocolate> query = session.createQuery(hql, Chocolate.class);
        query.list();

        return query.getResultList();
    }
}
