package dev.lpa.NestedClassesAndTypes.BillsBurger;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private double price = 5.0;
    private Burger burger;
    private Item drink;
    private Item side;
    private double conversionRate;
    // if meal price doesn't need to be converted
    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Burger("basic");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side",  2.0);
    }

    public double getTotal(){
        double total = burger.getPrice() + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }
    // Items are instantiated in the constructor
    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side, "Total Due: ", getTotal());
    }

    public void addToppings(String... selectedToppings){
        burger.addToppings(selectedToppings);
    }

    private class Item {
        private String name;
        private String type;
        private double price;
        // for burger, only 2 args are needed
        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0); // calls the lower constructor, if type = burger, price is default in Meal
        }
        // for drink and side, 3 args are needed
        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name, getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate){
            return price * rate;
        }
    }

    private class Burger extends Item {

        private enum Extra {AVOCADO, BACON, CHEESE, KETCHUP, MAYO, PICKLES, LETTUCE, TOMATO, ONIONS;
            private double getPrice(){
                return switch(this){
                    case AVOCADO, CHEESE -> 1.0;
                    case BACON -> 1.5;
                    default -> 0;
                };
            }
        };
        private List<Item> toppings = new ArrayList<>();


        public Burger(String name) {
            super(name, "burger", 5.0);
        }

        public double getPrice(){
//            double total = price;
            double total = super.price;
            for(Item topping : toppings){
                total += topping.price;
            }
            return total;
        }

        private void addToppings(String... selectedToppings){
            for(String selectedTopping : selectedToppings){
                try {
                    Extra topping = Extra.valueOf(selectedTopping.toUpperCase());
                    toppings.add(new Item(topping.name(), "TOPPING", topping.getPrice()));
                } catch (IllegalArgumentException ie){
                    System.out.printf("No topping found for %s.\n", selectedTopping);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder itemized = new StringBuilder(super.toString());
            for(Item topping : toppings){
                itemized.append("\n");
                itemized.append(topping);
            }
            return itemized.toString();
        }
    }
}
