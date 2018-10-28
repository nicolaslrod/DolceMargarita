package Pedido;

import chocolates.Chocolate;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Chocolate> chocolates;

    public Pedido(){
        this.chocolates = new ArrayList<Chocolate>();
    }

    public void agregarChocolate(Chocolate choco1) {
        this.chocolates.add(choco1);
    }

    public double getPrecio() {
        return chocolates.stream().mapToDouble(Chocolate::precio).sum();
    }
}
