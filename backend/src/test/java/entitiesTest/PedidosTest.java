package entitiesTest;

import backend.entities.Cliente;
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
    public Cliente marge;

    @Before
    public void setUp(){
        choco1 = new Chocolate(Forma.FIGURA, TipoChocolate.SEMIAMARGO, 100);
        choco2 = new Chocolate(Forma.HUEVO, TipoChocolate.BLANCO, 500);
        marge = new Cliente(203656838, "Marge Simpson", 123434141, "Avenida siempreviva 742", "marge@gmail.com");
    }

    @Test
    public void elPrecioDeUnPedidoEsLaSumatoriaDeLosPreciosDeCadaChocolate(){
        Pedido pedido = new Pedido(marge);
        pedido.agregarChocolate(choco1);
        pedido.agregarChocolate(choco2);

        assertEquals(pedido.getPrecio(), (choco1.precio() + choco2.precio()));
    }
}
