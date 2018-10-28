package icTest;

import chocolates.Chocolate;
import chocolates.Forma;
import chocolates.TipoChocolate;
import org.junit.Before;
import org.junit.Test;

import static chocolates.Forma.HUEVO;
import static chocolates.TipoChocolate.BLANCO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChocolatesTest {

    public Chocolate choco;

    @Before
    public void setUp(){
        choco = new Chocolate(HUEVO, BLANCO,100);;
    }

    @Test
    public void lePidoSuFormaAUnHuevo(){
        assertEquals(choco.forma(), HUEVO);
    }

    @Test
    public void lePidoSuTipoAUnHuevo(){
        assertEquals(choco.tipoChocolate(), BLANCO);
    }

    @Test
    public void lePidoElPesoAUnHuevo(){
        assertTrue(choco.peso().equals(100));
    }

    @Test
    public void unHuevoDe100GramosCuesta50Pesos(){
        assertTrue(choco.precio().equals(50.00));
    }
}
