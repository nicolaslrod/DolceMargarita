package backend.dao;

import backend.runner.Runner;
import org.hibernate.Session;

import java.io.Serializable;

public abstract class HibernateDAO<T> {

    public Class<T> tipo;

    public HibernateDAO(Class<T> clase) {
        this.tipo = clase;
    }

    public void guardar(T instancia) {
        Session session = Runner.getCurrentSession();
        session.save(instancia);
    }

    public T recuperar(Serializable id) {
        Session session = Runner.getCurrentSession();
        return session.get(this.tipo , id);
    }

}
