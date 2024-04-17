package br.edu.unifei.ecoi2205.desserts.main;
public class CheeseCake implements IDessertFactory {
    @Override
    public void create() {
        System.out.println("Creating Uncle Nagai's cheesecake");
    }
    @Override
    public void cook() {
        System.out.println("Cooking Uncle Nagai's cheesecake");
    }
    @Override
    public void delivery() {
        System.out.println("Delivering Uncle Nagai's cheesecake");
    }
}