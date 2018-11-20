package backend.dao;

import backend.entities.Cliente;

public class ClienteDAO extends HibernateDAO<Cliente> {
    public ClienteDAO() {
        super(Cliente.class);
    }


}
