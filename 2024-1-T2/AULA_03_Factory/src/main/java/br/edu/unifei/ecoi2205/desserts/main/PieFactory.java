package br.edu.unifei.ecoi2205.desserts.main;
public class PieFactory implements IOrderFactory {
    @Override
    public IDessertFactory createOrder() {
        IDessertFactory pie = new Pie();
        return pie;
    }
}