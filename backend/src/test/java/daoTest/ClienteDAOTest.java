package daoTest;
import backend.dao.ChocolateDAO;
import backend.dao.ClienteDAO;
import backend.entities.Cliente;
import backend.entities.chocolates.Chocolate;
import backend.entities.chocolates.Forma.Huevos;
import backend.entities.chocolates.Tamanio.Grande;
import backend.entities.chocolates.TipoChocolate.ChocolateBlanco;
import backend.runner.Runner;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClienteDAOTest {

    ClienteDAO clienteDAO = new ClienteDAO();
    Cliente cliente;

    @Before
    public void setUp(){
         cliente = new Cliente(40399825, "Pepe Torres", 45672345, "calle 3 numero 3434", "pepe@gmail.com");
    }

    @Test
    public void recuperoUnCliente(){
        Runner.runInSession(() -> {

            clienteDAO.guardar(cliente);

            Cliente clienteRecuperado = clienteDAO.recuperar(cliente.getDni());

            assertEquals(cliente.getDni(), clienteRecuperado.getDni());
            assertEquals(cliente.getNombreYApellido(), clienteRecuperado.getNombreYApellido());
            assertEquals(cliente.getTelefono(), clienteRecuperado.getTelefono());
            assertEquals(cliente.getDireccion(), clienteRecuperado.getDireccion());
            assertEquals(cliente.getEmail(), clienteRecuperado.getEmail());

            return null;
        });
    }
}
