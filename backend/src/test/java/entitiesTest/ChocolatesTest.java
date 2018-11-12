package entitiesTest;

import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.Forma.Huevo;
import backend.entities.chocolates.TipoChocolate.ChocolateBlanco;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ChocolatesTest {

    public Chocolate choco;

    @Before
    public void setUp(){
        choco = new Chocolate(new Huevo(), new ChocolateBlanco(),100);
    }

    @Test
    public void lePidoSuFormaAUnHuevo(){
        assertEquals(choco.forma().getClass().toString(),  new Huevo().getClass().toString());
    }

    @Test
    public void lePidoSuTipoAUnHuevo(){
        assertEquals(choco.tipoChocolate().getClass().toString(), new ChocolateBlanco().getClass().toString());
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
