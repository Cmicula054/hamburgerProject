package com.udemy.cipmicula;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger(7.25, "White", "Beef");

        hamburger.addAdditionalItem1("Pickles", .54); //Added Pickles -> 0.54
        hamburger.addAdditionalItem2("Onions", .32); //Added Onions -> 0.32
        hamburger.addAdditionalItem3("Lettuce", .66); //Added Lettuce -> 0.66
        hamburger.addAdditionalItem4("tomato", .88); //Added tomato -> 0.88

        System.out.println("Total price is " + hamburger.checkoutItems()); // Total price is 9.65

        System.out.println("-------------------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon");

        healthyBurger.addAdditionalItem5("tofu", .79); //Added tofu -> 0.79
        healthyBurger.addAdditionalItem6("spinach", .33); //Added spinach -> 0.33

        System.out.println("Total price is " + healthyBurger.checkoutItems()); //Total price is 9.01

        System.out.println("-------------------------------------------");

        Deluxe deluxe = new Deluxe("Cheesy", "Angus");

        System.out.println("Total price is " + deluxe.checkoutItems()); //Total price is 12.41
    }
}
