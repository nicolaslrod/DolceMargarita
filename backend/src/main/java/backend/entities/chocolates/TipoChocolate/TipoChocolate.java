package backend.entities.chocolates.TipoChocolate;

import javax.persistence.*;

@Entity
public abstract class TipoChocolate {

    @Id
    @Column(name = "TIPO_CHOCOLATE_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String img;

    public TipoChocolate(){}

    public Integer getId(){ return this.id;}

    public void addImg(String img) { this.img = img; }

    public String getImg() { return this.img; }
}
