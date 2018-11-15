package fileReaderTest;

import fileReader.ReaderTipo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class ReaderTipoTest {

    public String path;
    public ReaderTipo reader;

    @Before
    public void setUp(){
        this.path = "C:/Users/Lucas/Desktop/tipo.chocolate.csv";
        this.reader = new ReaderTipo(path);
    }

    @Test
    public void fileReaderDeTipoLeeCorrectamenteElCSV(){
        this.reader.readFile().stream().forEach(p -> System.out.println(p.getClass().getSimpleName()));
        assertNotNull(this.reader.readFile());
    }
}
