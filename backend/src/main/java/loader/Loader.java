package loader;

import backend.dao.FormaDao;
import backend.dao.TipoChocolateDao;
import backend.service.ServiceForma;
import backend.service.ServiceTipoChocolate;
import fileReader.ReaderForma;
import fileReader.ReaderTipo;


public class Loader {

    private static ReaderTipo readerTipo = new ReaderTipo("backend\\src\\main\\resources\\tipo.chocolate.csv");
    private static ReaderForma readerForma = new ReaderForma("backend\\src\\main\\resources\\forma.chocolate.csv");
    private static ServiceTipoChocolate serviceTipoChocolate = new ServiceTipoChocolate();
    private static ServiceForma serviceForma = new ServiceForma();


    public static void load() {
        loadForma();
        loadTipo();
    }

    public static void loadTipo() {
        readerTipo.readFile().stream().forEach( tipo -> serviceTipoChocolate.guardar(tipo));
    }

    public static void loadForma() {
        readerForma.readFile().stream().forEach( forma -> serviceForma.guardar(forma));
    }

    public static void main(final String[] args) {
        load();
    }
}
