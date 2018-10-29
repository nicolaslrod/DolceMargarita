package backend.entities;

import backend.entities.chocolates.Chocolate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Pedido_id")
    private int id;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Chocolate> chocolates;

    public Pedido(){
        this.chocolates = new ArrayList<>();
    }

    public void agregarChocolate(Chocolate choco1) {
        this.chocolates.add(choco1);
    }

    public List<Chocolate> getChocolates(){
        return this.chocolates;
    }

    public double getPrecio() {
        return chocolates.stream().mapToDouble(Chocolate::precio).sum();
    }

    public Integer getId() {
        return id;
    }
}
