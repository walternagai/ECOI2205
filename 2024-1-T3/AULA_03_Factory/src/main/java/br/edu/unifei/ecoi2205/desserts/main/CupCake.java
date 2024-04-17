package br.edu.unifei.ecoi2205.desserts.main;
public class CupCake implements IDessertFactory {
    @Override
    public void create() {
        System.out.println("Creating Granpa Nagai's cupcake");
    }
    @Override
    public void cook() {
        System.out.println("Cooking Granpa Nagai's cupcake");
    }
    @Override
    public void delivery() {
        System.out.println("Delivering Granpa Nagai's cupcake");
    }
}
