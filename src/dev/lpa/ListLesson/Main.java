package dev.lpa.ArrayListLesson;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String department, int count){
    // constructor with default type and count
    public GroceryItem(String name){
        this(name, "DIARY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), department);
    }
}

public class Main {
    public static void main(String[] args) {
        // Array
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 4);
        groceryArray[2] = new GroceryItem("pineapple", "PRODUCE", 2);
        System.out.println(Arrays.toString(groceryArray));

        // ArrayList
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);

        // ArrayList
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 6));
        groceryList.add(0, new GroceryItem("bacon", "FROZEN", 1));
        groceryList.set(0, new GroceryItem("ice cream", "FROZEN", 1)); // "set" replaces the element in the index
        groceryList.remove(1);
        System.out.println(groceryList);
        groceryList.toString();
    }
}
