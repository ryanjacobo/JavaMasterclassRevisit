package dev.lpa.Abstraction.Challenge;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // concrete method
    public double getPrice(int qty) {
        return price * qty;
    }

    // concrete method
    public void printPricedItem(int qty){
        System.out.printf("Qty: %d  X  Price: $%.2f, %s  %s %n", qty, price, type, description);
    }

    public abstract void showDetails();
}
