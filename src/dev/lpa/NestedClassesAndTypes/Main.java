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
    }
}
