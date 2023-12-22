package dev.lpa.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person (String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van Pelt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

        System.out.println("----anonymous class-----");
        var comparatorLastName = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };
        people.sort(comparatorLastName);
        System.out.println(people);

        System.out.println("----lambda expression-----");
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName));
        System.out.println(people);
//        for(Person person : people){
//            System.out.println(person);
//        }

        System.out.println("----two-level comparator----");
        interface EnhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed = new EnhancedComparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ? secondLevel(o1, o2) : result); // 0 means the 2 arguments are the same
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };
        people.sort(comparatorMixed);
        System.out.println(people);

        List<String> list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));
        System.out.println("----without lambda-----");
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("----using lambda expression----");
        list.forEach((s) -> System.out.println(s));

        System.out.println("----multiple statements-----");
        list.forEach((s) -> {
            char first = s.charAt(0);
            System.out.println(s + " means " + first);
        });
    }
}
