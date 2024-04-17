package br.edu.unifei.ecoi2205.desserts.main;
public class DessertBuilder {
    public void buildDessert(IOrderFactory orderFactory) {
        IDessertFactory dessertFactory = orderFactory.createOrder();
        dessertFactory.create();
        dessertFactory.cook();
        dessertFactory.delivery();
    }
}
