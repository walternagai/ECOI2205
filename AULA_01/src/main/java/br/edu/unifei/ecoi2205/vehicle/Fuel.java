package br.edu.unifei.ecoi2205.vehicle;

public enum Fuel {
    GAS ("Gas"),
    ALCOHOL ("Alcohol"),
    DIESEL ("Diesel");

    public final String description;

    Fuel(String description) {
        this.description = description;
    }
}