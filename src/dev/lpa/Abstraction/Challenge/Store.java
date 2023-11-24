package dev.lpa.Abstraction.Challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Store {

    // Manage a list of products for sale
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new Shoes("Leather", 50, "Italian casual leather shoes."));
        storeProducts.add(new Shoes("Rubber", 70, "Limited Ed Nike sneakers."));

        storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));
        storeProducts.add(new Bicycle("Santa Cruz", 5000, "RockShox suspension with SRAM X01 drivetrain components."));
        System.out.println("-".repeat(30));
        listProducts();

        // Manage an order which can just be a list of OrderItem objects
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        addItemToOrder(order1, 2, 1);
        printOrder(order1);


        System.out.println("\nOrder 2");
        ArrayList<OrderItem> order2 = new ArrayList<>();
        addItemToOrder(order2, 3, 2);
        addItemToOrder(order2, 4, 2);
        printOrder(order2);
    }

    public static void listProducts() {
        for(var item : storeProducts){
            item.showDetails();
            System.out.println("-".repeat(30));
        }
    }

    // Create a method to add an item to the order. "order" = new ArrayList<OrderItem>()
    public static void addItemToOrder(ArrayList<OrderItem> order, int productIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(productIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}

//record OrderItem(int qty, ProductForSale product){}
