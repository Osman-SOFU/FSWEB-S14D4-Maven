package org.example.model;

public class Coke extends ProductForSale {

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
    }
}
