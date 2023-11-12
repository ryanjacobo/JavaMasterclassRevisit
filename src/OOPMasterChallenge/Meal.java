package OOPMasterChallenge;

public class Meal {
    private Burger burger;
    private Side side;
    private Drink drink;

    private Toppings toppings;

    public Meal(){
        this.burger = new Burger();
        this.side = new Side();
        this.drink = new Drink();
        this.toppings = new Toppings();
    }
    public Meal(Burger burger, Toppings toppings, Side side, Drink drink){
       this.burger = burger;
        this.side = side;
        this.drink = drink;
        this.toppings = toppings;
    }

    public double getBurger() {
        return burger.getPrice();
    }

    public double getSide() {
        return side.getPrice();
    }

    public double getDrink() {
        return drink.getPrice();
    }

    public double getTotal(){
       return burger.getPrice() + side.getPrice() + drink.getPrice();
    }

    public void printReceipt(){
        System.out.println("Burger" + "(+" + toppings.getPrice() + "): " + getBurger());
        System.out.println("Side: " + getSide());
        System.out.println("Drinks: " + getDrink());
        System.out.println("Total: " + getTotal());
    }
}
