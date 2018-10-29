package backend.dao;

import backend.entities.Pedido;

public class PedidoDAO extends HibernateDAO<Pedido> {

    public PedidoDAO() { super(Pedido.class);}

}
