package backend.service;

import backend.dao.ChocolateDAO;
import backend.dao.PedidoDAO;
import backend.entities.chocolates.Chocolate;
import backend.runner.Runner;

import java.util.List;

public class ServiceChocolate {

    private  ChocolateDAO daoChocolate;
    private  PedidoDAO daoPedido;

    public ServiceChocolate() {
        daoChocolate = new ChocolateDAO();
        daoPedido = new PedidoDAO();
    }

    public List<Chocolate> getChocolates(){
        return Runner.runInSession(() -> {

            return this.daoChocolate.getChocolates();
        });
    }
}
