package br.edu.unifei.ecoi2205.desserts.main;
public class Pie implements IDessertFactory {
    @Override
    public void create() {
        System.out.println("Creating Granma Nagai's pie");
    }
    @Override
    public void cook() {
        System.out.println("Cooking Granma Nagai's pie");
    }
    @Override
    public void delivery() {
        System.out.println("Delivering Granma Nagai's pie");
    }
}