package icTest;

import icImpl.CITest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ICTest {

    @Test
    public void testInicial(){
        assertTrue(true);
    }

    @Test
    public void claseCITestQueRetornaTrueAlPedirleSuEstado(){
        CITest ciTest = new CITest();

        assertTrue(ciTest.estado());
    }

}
