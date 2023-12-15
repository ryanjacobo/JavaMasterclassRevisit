package dev.lpa.GenericsLesson.GenericsWildCard;

import dev.lpa.GenericsLesson.GenericsWildCard.model.LPAStudent;
import dev.lpa.GenericsLesson.GenericsWildCard.model.Student;
import dev.lpa.GenericsLesson.GenericsWildCard.util.QueryItem;
import dev.lpa.GenericsLesson.GenericsWildCard.util.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            students.add(new Student());
        }
//        students.add(new LPAStudent());

        printList(students);

        System.out.println("--------LPAStudent---------");
        LPAStudent ryan = new LPAStudent();
        System.out.println("Ryan's percent completed: " + ryan.getPercentComplete());
        List<LPAStudent> lpaStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents); // <Student> was removed from printList param to enable lpaStudents to be the param

        System.out.println("-------using a wildcard(unbounded)-------");
        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1,2,3)));

        System.out.println("----multiple upper bounds----");
        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printList(matches);

        System.out.println("------Static methods-----");
        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
        printList(students2021);

//        QueryList<Employee> employeeList = new QueryList<>(); // QueryList only accepts Student
    }

    // Using Generic method (<T>) fixes the warning, adding extends Student allows the method to access getYearStarted()
//    public static <T extends Student> void printList(List<T> students){
    // wildcard with upper bound specified
    public static void printList(List<? extends Student> students){
        for (var student : students){
//            System.out.println(student);
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    // using wildcard(?), List<?> allows arg to be any type of list
    public static void testList(List<?> list){
        for(var element : list){
            if(element instanceof String s){
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i){
                System.out.println("Integer: " + i.floatValue());
            }
        }
        System.out.println();
    }
}

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

