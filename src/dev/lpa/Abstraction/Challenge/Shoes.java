package dev.lpa.Abstraction.Challenge;

public class Shoes extends ProductForSale{

    public Shoes(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " shoes are comfortable and stylish.");
        System.out.printf("The price of the shoes is $%.2f %n", price);
        System.out.println(description);
    }


}
