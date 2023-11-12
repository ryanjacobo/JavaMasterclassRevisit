package OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {
        Burger firstBurger = new Burger();
        Toppings firstToppings = new Toppings(true, true, true, true, true);
        firstBurger.addToppings(firstToppings);
//        System.out.println("burger(+$" + firstToppings.getPrice() + "): " + firstBurger.getPrice());
        Drink firstDrink = new Drink("s");
//        System.out.println("+drinks: " + firstDrink.getPrice());
        Side firstSide = new Side("s");
//        System.out.println("+side: " + firstSide.getPrice());
        Meal firstMeal = new Meal(firstBurger, firstToppings, firstSide, firstDrink);
//        System.out.println("Your total: " + firstMeal.getTotal());
        firstMeal.printReceipt();

        Meal basicMeal = new Meal();
//        System.out.println("Basic burger: " + basicMeal.getBurger());
//        System.out.println("Basic drink: " + basicMeal.getDrink());
//        System.out.println("Basic side: " + basicMeal.getSide());
//        System.out.println("Basic total: " + basicMeal.getTotal());
        basicMeal.printReceipt();
    }
}
