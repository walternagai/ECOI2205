package br.edu.unifei.ecoi2205.desserts.main;
public class CupCakeFactory implements IOrderFactory {
    @Override
    public IDessertFactory createOrder() {
        IDessertFactory cupcake = new CupCake();
        return cupcake;
    }
}