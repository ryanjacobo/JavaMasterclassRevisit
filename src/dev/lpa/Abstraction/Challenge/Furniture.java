package dev.lpa.Abstraction.Challenge;

public class Furniture extends ProductForSale{

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in NC.");
        System.out.printf("The price of the shoes is $%.2f %n", price);
        System.out.println(description);
    }


}
