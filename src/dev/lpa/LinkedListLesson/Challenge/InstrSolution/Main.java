package dev.lpa.LinkedListLesson.Challenge.InstrSolution;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Sydney", 0));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Melbourne", 877));
//        placesToVisit.addFirst(new Place("Sydney", 0));
//        addPlace(placesToVisit, new Place("Sydney", 0));
        int index = 0;
        for(Place p : placesToVisit){
            System.out.println(placesToVisit.get(index));
            index++;
        }

        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop){
            // if iterator has no previous element,
            if(!iterator.hasPrevious()){
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch(menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {           // Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();  // Adjust position forward
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward) {           // Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();  // Adjust position backwards
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;

            }
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        // contains() - checks if place instance is already in the List
//        if(list.contains(place)){
//            System.out.println("Found duplicate: " + place);
//            return;
//        }

        // compares every name in the list with the name of the arg passed in the method
        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0; // index that gets assigned to the place
        for(var listPlace : list) {
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place); // add always places the place at the start
                return;
            }
            matchedIndex++;
        }

        // place gets added after passing the validation - p.name(),
        list.add(place);
    }


    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}

record Place(String name, int distance){

    @Override
    public String toString() {
//        return "Place{" +
//                "name='" + name + '\'' +
//                ", distance=" + distance +
//                '}';
        return String.format("%s (%d)", name, distance);
    }
}