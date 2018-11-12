package backend.entities.chocolates.Forma;

import javax.persistence.*;

@Entity
public abstract class Forma {

    @Id
    @Column(name = "FORMA_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    public Forma(){}
}
