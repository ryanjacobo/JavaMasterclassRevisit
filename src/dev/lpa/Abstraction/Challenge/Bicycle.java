package dev.lpa.Abstraction.Challenge;

public class Bicycle extends ProductForSale{

    public Bicycle(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " bicycle is top-of-the-line, latest release.");
        System.out.printf("The price of the bike is $%.2f %n", price);
        System.out.println(description);
    }
}
