package daoTest;

import backend.dao.PedidoDAO;
import backend.entities.Pedido;
import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.TipoChocolate;
import backend.runner.Runner;
import backend.runner.SessionFactoryProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static backend.entities.chocolates.Forma.HUEVO;
import static backend.entities.chocolates.TipoChocolate.BLANCO;
import static org.junit.Assert.assertEquals;

public class PedidoDAOTest {

    private Pedido pedido;
    private Chocolate chocolateBlanco;
    private Chocolate chocolateConLeche;
    private PedidoDAO pedidoDAO;

//    @After
//    public void cleanUp(){
//        SessionFactoryProvider.destroy();
//    }

    @Before
    public void setUp(){
        chocolateBlanco = new Chocolate(HUEVO, BLANCO,100);
        chocolateConLeche = new Chocolate(HUEVO, TipoChocolate.CONLECHE,100);
        pedido = new Pedido();
        pedido.agregarChocolate(chocolateBlanco);
        pedido.agregarChocolate(chocolateConLeche);
        pedidoDAO = new PedidoDAO();
    }

    @Test
    public void recuperoUnChocolateBlanco(){
        Runner.runInSession(() -> {

            pedidoDAO.guardar(pedido);

            Pedido pedidoRecuperado = pedidoDAO.recuperar(pedido.getId());

            assertEquals(pedidoRecuperado.getChocolates().size(), pedido.getChocolates().size());

            return null;
        });
    }


}
