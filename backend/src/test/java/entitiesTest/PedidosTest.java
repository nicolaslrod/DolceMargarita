package entitiesTest;

import backend.entities.Cliente;
import backend.entities.Pedido;
import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.Forma.Figuras;
import backend.entities.chocolates.Forma.Huevos;
import backend.entities.chocolates.Tamanio.Grande;
import backend.entities.chocolates.TipoChocolate.ChocolateBlanco;
import backend.entities.chocolates.TipoChocolate.ChocolateSemiAmargo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PedidosTest {

    public Chocolate choco1;
    public Chocolate choco2;
    public Cliente marge;

    @Before
    public void setUp(){
        choco1 = new Chocolate(new Figuras(), new ChocolateSemiAmargo(), 100);
        choco2 = new Chocolate(new Huevos(new Grande()), new ChocolateBlanco(), 500);
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
