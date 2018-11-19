package loader;

import backend.service.ServiceForma;
import backend.service.ServiceTamanio;
import backend.service.ServiceTipoChocolate;
import fileReader.ReaderForma;
import fileReader.ReaderTamanio;
import fileReader.ReaderTipo;


public class Loader {

    private static ReaderTipo readerTipo = new ReaderTipo("backend\\src\\main\\resources\\tipo.chocolate.csv");
    private static ReaderForma readerForma = new ReaderForma("backend\\src\\main\\resources\\forma.chocolate.csv");
    private static ReaderTamanio reanderTamanio = new ReaderTamanio("backend\\src\\main\\resources\\tamanio.chocolate.csv");
    private static ServiceTamanio serviceTamanio = new ServiceTamanio();
    private static ServiceTipoChocolate serviceTipoChocolate = new ServiceTipoChocolate();
    private static ServiceForma serviceForma = new ServiceForma();


    public static void load() {
        loadForma();
        loadTipo();
        loadTamanio();
    }

    public static void loadTipo() {
        readerTipo.readFile().stream().forEach( tipo -> serviceTipoChocolate.guardar(tipo));
    }

    public static void loadForma() {

        readerForma.readFile().stream().forEach( forma -> serviceForma.guardar(forma));
    }

    public static void loadTamanio() {
        reanderTamanio.readFile().stream().forEach( tamanio -> serviceTamanio.guardar(tamanio));
    }

    public static void main(final String[] args) {
        load();
    }
}
