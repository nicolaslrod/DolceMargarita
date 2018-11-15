package fileReaderTest;

import fileReader.ReaderForma;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class ReaderFormaTest {

    public String path;
    public ReaderForma reader;

    @Before
    public void setUp(){
        this.path = "C:/Users/Lucas/Desktop/forma.chocolate.csv";
        this.reader = new ReaderForma(path);
    }

    @Test
    public void fileReaderDeTipoLeeCorrectamenteElCSV(){
        this.reader.readFile().stream().forEach(p -> System.out.println(p.getClass().getSimpleName()));
        assertNotNull(this.reader.readFile());
    }
}
