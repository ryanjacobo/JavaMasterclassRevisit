package dev.lpa.NestedClassesAndTypes;

import dev.lpa.NestedClassesAndTypes.InnerClasses.StoreEmployee;
import dev.lpa.NestedClassesAndTypes.StaticNestedClass.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018)
        ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        // using static nested class
        System.out.println("-----Using static nested class------");
//        employees.sort(new Employee.EmployeeComparator());
//        employees.sort(new Employee.EmployeeComparator<>("yearStarted")); // sort by yearStarted
//        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed()); // sort by yearStarted (reversed)
        employees.sort(new Employee.EmployeeComparator<>("employeeId"));

        for (Employee e : employees){
            System.out.println(e);
        }

        System.out.println("-----Store Members-----");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target")
        ));
//        var comparator = new StoreEmployee.EmployeeComparator<>();
        var genericEmployee = new StoreEmployee(); // to access an inner class, a new Enclosing(outer) class should be instantiated
        var comparator = genericEmployee.new StoreComparator<>(); // and inner class should be instantiated from the class instance
        storeEmployees.sort(comparator);
        for(StoreEmployee e : storeEmployees){
            System.out.println(e);
        }

        System.out.println("With Pig Latin Names (using local classes)");
        addPigLatinName(storeEmployees);
    }

    public static void addPigLatinName(List<? extends StoreEmployee> list) {
        String lastName = "Piggy";

        // Local Class - a class within a method, no access modifier, only accessible to the enclosing method body
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee> {
            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }

        List<DecoratedEmployee> newList = new ArrayList<>(list.size());

        for (var employee : list) {
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }

//        lastName = "Latin";
        newList.sort(null);
        for(var dEmployee : newList){
//            System.out.println(dEmployee);
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLatinName);
        }
    }
}
