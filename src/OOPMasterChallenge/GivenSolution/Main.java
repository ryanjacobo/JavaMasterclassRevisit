package OOPMasterChallenge.GivenSolution;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();
        Item avocado = new Item("Topping", "avocado", 1.50);
        avocado.printItem();
        Item dessert = new Item("Ice Cream", "Rocky Road", 3.00);
        dessert.printItem();

        Burger burger = new Burger("regular", 4);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.addToppings("Lettuce", "tomato", "avocado"); // can only addToppings once
        burger.printItem();

        MealOrder regularMeal = new MealOrder();
        regularMeal.printItemizedList();

        // upgrade the base meal - MealOrder();
        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
//        deluxeMeal.addBurgerToppings("mushrooms", "special lettuce", "chipotle sauce", "cheddar cheese", "jalapenos");
        deluxeMeal.addBurgerToppings("mushrooms", "special lettuce", "chipotle sauce"); // only either 3 or 5 params (Burger or DeluxeBurger)
        deluxeMeal.printItemizedList();

    }
}
