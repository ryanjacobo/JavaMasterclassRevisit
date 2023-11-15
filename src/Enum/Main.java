package Enum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal()); // ordinal is the index
        System.out.println(getRandomDay());

        for(int i = 0; i < 10; i++){
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.FRIDAY){
//                System.out.println("Found a Friday!!!");
//            }

            switchDayOfWeek(weekDay);
        }

        for(Topping topping : Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch(weekDay){
            case WED -> System.out.printf("Wednesday is Day %d%n", weekDayInteger);
            case SAT -> System.out.printf("Saturday is Day %d%n", weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger); // charAt(0) stays uppercase, substring(starting at 1) is lowercase
        }
    }
    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7); // random instance from 1-7
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger]; // returns a random DayOfTheWeek.values();
    }
}
