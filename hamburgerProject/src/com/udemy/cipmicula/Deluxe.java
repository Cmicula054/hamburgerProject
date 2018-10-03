package com.udemy.cipmicula;

public class Deluxe extends Hamburger{

    public Deluxe(String breadRoll, String meat) {
        super(8.55, breadRoll, meat);
        super.addAdditionalItem1("Chips", 1.99);
        super.addAdditionalItem2("Drink", 1.87);
    }

    @Override
    public void addAdditionalItem1(String item, double amount) {
        System.out.println("Unable to add any further items");
    }

    @Override
    public void addAdditionalItem2(String item, double amount) {
        System.out.println("Unable to add any further items");
    }

    @Override
    public void addAdditionalItem3(String item, double amount) {
        System.out.println("Unable to add any further items");
    }

    @Override
    public void addAdditionalItem4(String item, double amount) {
        System.out.println("Unable to add any further items");
    }

    @Override
    public double checkoutItems() {
        return super.checkoutItems();
    }
}
