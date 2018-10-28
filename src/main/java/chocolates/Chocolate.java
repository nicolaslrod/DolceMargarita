package chocolates;

public class Chocolate {

    private Forma forma;
    private TipoChocolate colorChocolate;
    private Integer pesoGramos;

    public Chocolate(Forma unaForma, TipoChocolate unColor, Integer unPeso){
        this.forma = unaForma;
        this.colorChocolate = unColor;
        this.pesoGramos = unPeso;
    }

    public Forma forma() {
        return this.forma;
    }

    public TipoChocolate tipoChocolate() {
        return this.colorChocolate;
    }

    public Integer peso() {
        return this.pesoGramos;
    }

    public Double precio() {
        //TODO: PREGUNTAR
        return this.pesoGramos * 0.5;
    }
}
