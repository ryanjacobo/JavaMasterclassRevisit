package dev.lpa.LinkedListLesson.Challenge;

import java.util.*;

import static java.util.Collections.*;

public class ListIterator {
    private static LinkedList<City> placesToVisit = new LinkedList<>();

    public static void main(String[] args) {
        addCity("Darwin", 3972);
        addCity("Brisbane", 917);
        addCity("Adelaide", 1374);
        addCity("Sydney", 0);
        addCity("Perth", 3923);
        addCity("Melbourne", 877);

//        listPlaces(placesToVisit);
//        travelForward(placesToVisit);
//        travelBack(placesToVisit);
//
        mainMenu();
    }

    public static void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions (select word or letter)");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
        String input = scanner.nextLine().toUpperCase();
        boolean quitLoop = false;
//        while(!quitLoop){
            switch(input){
                case "F" -> travelForward(placesToVisit);
                case "B" -> travelBack(placesToVisit);
                case "L" -> listPlaces(placesToVisit);
                case "M" -> mainMenu();
                case "Q" -> {
                    System.out.println("Good bye!");
//                    quitLoop = true;
                }
                default -> {
                    System.out.println("Invalid Input");
                    mainMenu();
                }
            }
//        }

    }

   public static void addCity(String name, int distance){
        City newCity = new City(name, distance);
        placesToVisit.add(newCity);
   }

    public static void listPlaces(LinkedList<City> list){
        Collections.sort(list, Comparator.comparingInt(City::getDistance));
        for(City city : list){
            System.out.println("City: " + city.getName() + ", Distance: " + city.getDistance());
        }
        mainMenu();
    }

    public static void travelForward(LinkedList<City> list){
        Collections.sort(list, Comparator.comparingInt(City::getDistance));
        System.out.println("Start at: " + list.getFirst().getName());
        for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1).getName() + " to: " + list.get(i).getName());
        }
        System.out.println("Trip ends at: " + list.getLast().getName());
        mainMenu();
    }

    public static void travelBack(LinkedList<City> list){
        Collections.sort(list, Comparator.comparingInt(City::getDistance));
        System.out.println("Starts at: " + list.getLast().getName());
        for(int i = 1; i < list.size(); i++){
            int current = list.size() - 1;
            System.out.println("--> From: " + list.get(list.size() - i).getName() + " to: " + list.get(current - i).getName());
        }
        System.out.println("Trip ends at: " + list.getFirst().getName());
        mainMenu();
    }
}

class City {
    private String name;
    private int distance;

    public City(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%s (%d", name, distance);
    }
}

