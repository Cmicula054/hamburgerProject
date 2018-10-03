package com.udemy.cipmicula;

public class HealthyBurger extends Hamburger {

    private String additionalItem5;
    private double additionalItem5Price;

    private String additionalItem6;
    private double additionalItem6Price;


    public HealthyBurger(String meat) {
        super(7.89, "Brown rye Bread", meat);
    }

    public void addAdditionalItem5(String item, double amount) {
        this.additionalItem5 = item;
        this.additionalItem5Price += amount;
    }

    public void addAdditionalItem6(String item, double amount) {
        this.additionalItem6 = item;
        this.additionalItem6Price += amount;
    }

    @Override
    public double checkoutItems() {
       double hamburgerPrice = super.checkoutItems();
        if(this.additionalItem5 != null) {
            hamburgerPrice += additionalItem5Price;
            System.out.println("Added " + additionalItem5 + " -> " + additionalItem5Price);
        }
        if(this.additionalItem6 != null) {
            hamburgerPrice += additionalItem6Price;
            System.out.println("Added " + additionalItem6 + " -> " + additionalItem6Price);
        }
        return hamburgerPrice;
    }
}
