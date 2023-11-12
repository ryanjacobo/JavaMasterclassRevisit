package OOPMasterChallenge.GivenSolution;

public class DeluxeBurger extends Burger{

    Item deluxe1;
    Item deluxe2;

    // suppers name and price from Burger class
    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    // suppers addToppings from Burger class
    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3); // supers addToppings from Burger class and allocates two more toppings params
        deluxe1 = new Item("TOPPING", extra4, 0);
        deluxe2 = new Item("TOPPING", extra5, 0);
    }

    @Override
//    public void printItemizedList() {
//        super.printItemizedList();
        public void printItem() {
            super.printItem();
        if(deluxe1 != null){
            deluxe1.printItem();
        }
        if(deluxe2 != null){
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
