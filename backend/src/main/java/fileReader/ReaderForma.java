package fileReader;

import backend.entities.chocolates.Forma.Forma;

public class ReaderForma extends CSVFileReader<Forma> {
    /**
     * @param filePath the absolute path of the file to be read.
     */
    public ReaderForma(String filePath) {
        super(filePath);
    }

    @Override
    protected Forma parseLine(String[] line) {
        try {
            Forma forma = (Forma) Class.forName(line[2].trim()).newInstance();
            forma.addImg(line[3].trim());
            return forma;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
