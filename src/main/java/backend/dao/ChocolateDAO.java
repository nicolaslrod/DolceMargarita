package backend.dao;

import backend.entities.chocolates.Chocolate;

public class ChocolateDAO extends HibernateDAO<Chocolate> {

    public ChocolateDAO() { super(Chocolate.class);}

}
