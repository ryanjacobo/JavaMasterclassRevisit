package TheObjectClass;

import Inheritance.Subclass.Employee;
import Inheritance.Subclass.HourlyEmployee;
import Inheritance.Subclass.SalariedEmployee;

// implicitly extends Object
public class Main {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carol");
        System.out.println(jimmy);

        System.out.println("---Worker Inheritance---");
        Employee tim = new Employee("Tim", "06/24/1979", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee ryan = new SalariedEmployee("Ryan", "12/29/1984", "01/01/2020", 80000);
        System.out.println(ryan);
        System.out.println("Ryan's paycheck = $" + ryan.collectPay());
        ryan.retire();
        System.out.println(ryan.collectPay());
        System.out.println(ryan);

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03703/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday pay = $" + mary.getDoublePay());

    }
}
