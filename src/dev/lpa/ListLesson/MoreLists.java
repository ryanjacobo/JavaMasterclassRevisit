package dev.lpa.ListLesson;

import java.util.*;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items); // creates a List of Array (List.of(items)
        System.out.println(list);
        System.out.println(list.getClass().getName()); // items is an immutable collection within a List
//        list.add("yogurt"); // not permissible

        // converting an Array to a List
        ArrayList<String> groceries = new ArrayList<>(list); // "()" stores the array to be added to the list and makes it mutable
        groceries.add("yogurt");
        groceries.remove("apples");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        // combine 2 lists
        groceries.addAll(nextList);
        System.out.println(groceries);

        // get()
        System.out.println("Third item = " + groceries.get(2));

        // contains()
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        // indexOf()
        System.out.println(groceries.indexOf("pickles"));

        groceries.add("yogurt");
        System.out.println(groceries.lastIndexOf("yogurt"));

        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        // removeAll()
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        // retainAll()
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        // clear
        groceries.clear();
        System.out.println(groceries);

//        isEmpty()
        System.out.println(groceries.isEmpty());

        // List.of - immutable, Arrays.asList - mutable
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.remove("apples");
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        groceries.add("strawberries");
        System.out.println(groceries);

        // .sort(Comparator.naturalOrder())
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        // .sort(Comparator.reverseOrder())
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

        // Arrays.asList();
        String[] originalArray = new String[]{"First", "Second", "Third"};
//        originalArray[3] = "Fourth";
        System.out.println(Arrays.toString(originalArray));
        var originalList = Arrays.asList(originalArray);
//        originalList.add("Fourth");
        System.out.println(originalList);

        // To modify an Array, it needs to be initialized as a var first
        String[] originalArr = new String[]{"First", "Second", "Third"}; // immutable
        var origList = Arrays.asList(originalArr); // mutable
        origList.set(0, "one");
        System.out.println(origList);
        System.out.println(Arrays.toString(originalArr));

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday"); // creates an immutable list
//        newList.add("Wednesday"); // not permissible
        System.out.println(newList);

        // initializing a mutable List
        ArrayList<String> properList = new ArrayList<>(List.of("Wednesday","Thursday","Friday"));
        properList.add("Saturday");
        System.out.println(properList);
    }
}
