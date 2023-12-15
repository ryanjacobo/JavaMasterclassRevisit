package dev.lpa.GenericsLesson.GenericsWildCard.Challenge.model;

import dev.lpa.GenericsLesson.GenericsWildCard.Challenge.util.QueryItem;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    // add a student id field to the Student class and implement a way to compare Students so that students are naturally ordered by a student id
    private static int LAST_ID = 10_000;
    private int studentID;
    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        studentID = LAST_ID++;
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentID, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    // 3. Implement at least one other mechanism for comparing Students by course or year, or for LPA Students by course or year, by percent complete
    @Override
    public int compareTo(@NotNull Student o) {
        return Integer.valueOf(studentID).compareTo(o.studentID);
    }
}
