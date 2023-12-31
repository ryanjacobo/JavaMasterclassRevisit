package dev.lpa.ListLesson.Challenge.GroceryList;

import java.util.*;

public class GroceryList {
    private static ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startProgram();
    }

    public static void startProgram(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do: ");
        int input = scanner.nextInt();
            switch(input){
                case 0 -> System.out.println("Good bye!");
                case 1 -> addItems(groceryList);
                case 2 -> removeItems(groceryList);
                default -> System.out.println("Invalid Input");
            }
    }

    public static void addItems(ArrayList<String> groceryList){
        System.out.println("Type grocery items(separated by comma).");
        String input = scanner.nextLine();
        String[] items = input.split(",");
        for(int i = 0; i < items.length; i++){
            String trimmed = items[i].trim();
            if(groceryList.contains(trimmed)){
                System.out.println(items[i] + " is already in the list.");
            } else {
                groceryList.add(items[i].trim());
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Grocery items: " + groceryList);
        startProgram();
    }

    public static void removeItems(ArrayList<String> groceryList){
        System.out.println("Type the item(s) that you would like to remove from the list(separated by comma).");
        String input = scanner.nextLine();
        String[] items = input.split(",");
        List<String> removed = new ArrayList<>();
        for(int i = 0; i < items.length; i++){
            String trimmed = items[i].trim();
            if(groceryList.contains(trimmed)){
                removed.add(trimmed);
                groceryList.remove(trimmed);
            } else {
                System.out.println(trimmed + " is not in the list.");
            }
        }
       for(int i = 0; i < removed.size(); i++){
            System.out.print(removed.get(i));
            if(i < removed.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println(" removed");
        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Grocery items: " + groceryList);
        startProgram();
    }
}
