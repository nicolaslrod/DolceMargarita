package serviceTest;

import backend.entities.chocolates.Chocolate;
import backend.runner.SessionFactoryProvider;
import backend.service.ServiceChocolate;
import backend.service.TestService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static backend.entities.chocolates.Forma.HUEVO;
import static backend.entities.chocolates.TipoChocolate.BLANCO;
import static junit.framework.TestCase.assertEquals;

public class ServiceChocolateTest {

    private TestService testService = new TestService();
    private ServiceChocolate service = new ServiceChocolate();
    private Chocolate chocolate;

    @Before
    public void setUp(){
        this.chocolate = new Chocolate(HUEVO, BLANCO,100);
    }

    @After
    public void cleanUp(){
        SessionFactoryProvider.destroy();
    }

    @Test
    public void seRecuperaLaListaDeChocolatesQueSoloContieneUnChocolateDeTipoHuevoBlanco(){
        this.testService.crearEntidad(this.chocolate);
        assertEquals(1,this.service.getChocolates().size());
        assertEquals(HUEVO,this.service.getChocolates().get(0).forma());
        assertEquals(BLANCO,this.service.getChocolates().get(0).tipoChocolate());
    }
}
