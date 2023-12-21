package dev.lpa.NestedClassesAndTypes.StaticNestedClass;

import java.util.Comparator;

public class Employee {
    // Static Nested class
    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted - o2.yearStarted;
            } else if (sortType.equalsIgnoreCase("employeeId")) {
                return o1.employeeId - o2.employeeId;
            }
            return o1.name.compareTo(o2.name);
        }

    }
    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}
