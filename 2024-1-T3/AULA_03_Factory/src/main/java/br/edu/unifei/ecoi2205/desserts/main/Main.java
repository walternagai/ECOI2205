package br.edu.unifei.ecoi2205.desserts.main;
import javax.swing.*;
public class Main {
    public static void main(String[] args) throws IllegalStateException {
        DessertBuilder dessertBuilder = new DessertBuilder();
        IOrderFactory orderFactory;
        String dessert = JOptionPane.showInputDialog(null,
                "What is your favorite dessert? (cheesecake/cupcake/pie)");
        dessert = dessert.toLowerCase();
        orderFactory = switch (dessert) {
            case "cheesecake" -> new CheeseCakeFactory();
            case "cupcake" -> new CupCakeFactory();
            case "pie" -> new PieFactory();
            default -> throw new IllegalStateException("Unexpected value: " +
                    dessert);
        };
        dessertBuilder.buildDessert(orderFactory);
    }
}
