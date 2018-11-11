package daoTest;

import backend.dao.ChocolateDAO;
import backend.entities.chocolates.Chocolate;
import backend.runner.Runner;
import backend.runner.SessionFactoryProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static backend.entities.chocolates.Forma.HUEVO;
import static backend.entities.chocolates.TipoChocolate.BLANCO;
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
        chocolateBlanco = new Chocolate(HUEVO, BLANCO,100);
        chocolateDAO = new ChocolateDAO();
    }

    @Test
    public void recuperoUnChocolateBlanco(){
        Runner.runInSession(() -> {

            chocolateDAO.guardar(chocolateBlanco);

            Chocolate chocoBlancoRecuperado = chocolateDAO.recuperar(
                    chocolateBlanco.forma().toString() + chocolateBlanco.tipoChocolate().toString());

            assertEquals(chocoBlancoRecuperado.getNombre(), chocolateBlanco.forma().toString() + chocolateBlanco.tipoChocolate().toString());

            return null;
        });
    }

}
