package daoTest;

import backend.dao.ChocolateDAO;
import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.Forma.Huevos;
import backend.entities.chocolates.Tamanio.Grande;
import backend.entities.chocolates.TipoChocolate.ChocolateBlanco;
import backend.runner.Runner;
import backend.runner.SessionFactoryProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class ChocolateDAOTest {

    Chocolate chocolateBlanco;
    ChocolateDAO chocolateDAO;

    @After
    public void cleanUp(){
        SessionFactoryProvider.destroy();
    }

    @Before
    public void setUp(){
        chocolateBlanco = new Chocolate(new Huevos(new Grande()), new ChocolateBlanco(),100);
        chocolateDAO = new ChocolateDAO();
    }

    @Test
    public void recuperoUnChocolateBlanco(){
        Runner.runInSession(() -> {

            chocolateDAO.guardar(chocolateBlanco);

            Chocolate chocoBlancoRecuperado = chocolateDAO.recuperar(chocolateBlanco.getNombre());

            assertEquals(chocoBlancoRecuperado.getNombre(), chocolateBlanco.forma().getClass().getSimpleName() +" de "+chocolateBlanco.tipoChocolate().getClass().getSimpleName());

            return null;
        });
    }

}
