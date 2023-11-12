package dev.lpa.LinkedListLesson;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney"); // add to a LinkedList
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);


        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin"); // add to the start of a LinkedList
        list.addLast("Hobart"); // add to the end of a LinkedList
        // Queue methods
        list.offer("Melbourne"); // add to the end of a LinkedList
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        // Stack methods
        list.push("Alice Springs");
//        list.addLast("Melbourne");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll(); // removes first el
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        String p4 = list.pop(); // removes the last
        System.out.println(p4 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());
        System.out.println("Index of Darwin = " + list.indexOf("Darwin"));
        System.out.println("Index of Melbourne = " + list.lastIndexOf("Melbourne")); // works for elements that have duplicate in the List

        // queue retrieval method
        System.out.println("Element from element() = " + list.element()); // first element

        // stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at " + list.getFirst());
        System.out.println("--------Using For-loop--------");
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }

        // using while-loop
        System.out.println("-------Using While-loop-------");
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
//        var iterator = list.iterator();
        var iterator = list.listIterator(); // allows iterator.add();
        while(iterator.hasNext()){
            if(iterator.next().equals("Brisbane")){
//                iterator.remove(); // removes brisbane
//                list.remove(); // causes an error
                iterator.add("Lake Wivenhoe");
            }
//            System.out.println(iterator.next());
        }
        // hasPrevious()/previous() enables reverse iteration
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}
