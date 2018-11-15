package serviceTest;

import backend.runner.SessionFactoryProvider;
import backend.service.ServiceTipoChocolate;
import backend.service.TestService;
import loader.Loader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class ServiceTipoChocolateTest {

    private TestService testService;
    private ServiceTipoChocolate serviceTipoChocolate;

    @Before
    public void setUp(){
        Loader.load();
        this.testService = new TestService();
        this.serviceTipoChocolate = new ServiceTipoChocolate();
    }

    @After
    public void cleanUp(){
        SessionFactoryProvider.destroy();
    }

    @Test
    public void testTraigoSetInicialDeTiposDeChocolates() {
        this.serviceTipoChocolate.recuperarTodos().stream().forEach(t -> System.out.println(t.getClass().getSimpleName()));
        assertNotNull(this.serviceTipoChocolate.recuperarTodos());
    }

}
