package backend.entities.chocolates;

import javax.persistence.*;

@Entity
public class Chocolate {

    @Id
    private String nombre;

    @Enumerated(value = EnumType.STRING)
    private Forma forma;

    @Enumerated(value = EnumType.STRING)
    private TipoChocolate colorChocolate;

    private Integer pesoGramos;

    public Chocolate(){}

    public Chocolate(Forma unaForma, TipoChocolate unTipo, Integer unPeso){
        this.forma = unaForma;
        this.colorChocolate = unTipo;
        this.pesoGramos = unPeso;
        this.nombre = unaForma.toString() + unTipo.toString();
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

    public String getNombre() {
        return this.nombre;
    }
}
