package backend.service;

import backend.runner.Runner;
import org.hibernate.Session;

import java.io.Serializable;

public class TestService {

    public void crearEntidad(Object object) {
        Runner.runInSession(() -> {
            Session session = Runner.getCurrentSession();
            session.save(object);
            return null;
        });
    }

    public <T> T recuperarEntidad(Class<T> tipo, Serializable key) {
        return Runner.runInSession(() -> {
            Session session = Runner.getCurrentSession();
            T valor = session.get(tipo, key);
            return valor;
        });
    }

    public void upDate(Object object) {
        Runner.runInSession(() -> {
            Session session = Runner.getCurrentSession();
            session.saveOrUpdate(object);
            return null;
        });

    }
}