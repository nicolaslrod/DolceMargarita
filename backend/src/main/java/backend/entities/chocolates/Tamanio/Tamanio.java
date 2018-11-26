package backend.entities.chocolates.Tamanio;

import javax.persistence.*;

@Entity
public abstract class Tamanio {

    @Id
    @Column(name = "TAMANIO_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String img;

    public Tamanio(){}

    public Integer getId(){ return this.id;}

    public void addImg(String img) { this.img = img; }

    public String getImg() { return this.img; }
}
