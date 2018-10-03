package com.udemy.cipmicula;

public class Hamburger {

    private double price;
    private String breadRoll;
    private String meat;


    private String additionalItem1;
    private double additionalItem1Price;

    private String additionalItem2;
    private double additionalItem2Price;

    private String additionalItem3;
    private double additionalItem3Price;

    private String additionalItem4;
    private double additionalItem4Price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Hamburger(double price, String breadRoll, String meat) {
        this.price = price;
        this.breadRoll = breadRoll;
        this.meat = meat;
    }

    public void addAdditionalItem1(String item, double amount) {
        this.additionalItem1 = item;
        this.additionalItem1Price += amount;
    }

    public void addAdditionalItem2(String item, double amount) {
        this.additionalItem2 = item;
        this.additionalItem2Price += amount;
    }

    public void addAdditionalItem3(String item, double amount) {
        this.additionalItem3 = item;
        this.additionalItem3Price += amount;
    }

    public void addAdditionalItem4(String item, double amount) {
        this.additionalItem4 = item;
        this.additionalItem4Price += amount;
    }

    public double checkoutItems() {
        double hamburgerPrice = this.price;
        System.out.println("Base price of burger -> " + this.price);
        if(this.additionalItem1 != null) {
            hamburgerPrice += additionalItem1Price;
            System.out.println("Added " + additionalItem1 + " -> " + additionalItem1Price);
        }
        if(this.additionalItem2 != null) {
            hamburgerPrice += additionalItem2Price;
            System.out.println("Added " + additionalItem2 + " -> " + additionalItem2Price);
        }
        if(this.additionalItem3 != null) {
            hamburgerPrice += additionalItem3Price;
            System.out.println("Added " + additionalItem3 + " -> " + additionalItem3Price);
        }
        if(this.additionalItem4 != null) {
            hamburgerPrice += additionalItem4Price;
            System.out.println("Added " + additionalItem4 + " -> " + additionalItem4Price);
        }
       return hamburgerPrice;
    }
}
