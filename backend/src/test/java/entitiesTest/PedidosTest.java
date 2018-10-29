package entitiesTest;

import backend.entities.Pedido;
import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.Forma;
import backend.entities.chocolates.TipoChocolate;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PedidosTest {

    public Chocolate choco1;
    public Chocolate choco2;

    @Before
    public void setUp(){
        choco1 = new Chocolate(Forma.FIGURA, TipoChocolate.SEMIAMARGO, 100);
        choco2 = new Chocolate(Forma.HUEVO, TipoChocolate.BLANCO, 500);
    }

    @Test
    public void elPrecioDeUnPedidoEsLaSumatoriaDeLosPreciosDeCadaChocolate(){
        Pedido pedido = new Pedido();
        pedido.agregarChocolate(choco1);
        pedido.agregarChocolate(choco2);

        assertEquals(pedido.getPrecio(), (choco1.precio() + choco2.precio()));
    }
}
