package br.edu.unifei.ecoi2205.desserts.main;
public class CheeseCakeFactory implements IOrderFactory {
    @Override
    public IDessertFactory createOrder() {
        IDessertFactory cheesecake = new CheeseCake();
        return cheesecake;
    }
}
