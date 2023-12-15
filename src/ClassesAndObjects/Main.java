package ClassesAndObjects;

import java.awt.*;

public class Main {
    record LPAStudent(String id, String name, String dateOfBirth, String classList) {

    }
    public static void main(String[] args) {
        System.out.println("---Car Class---");
        Car car = new Car();
        car.describeCar();
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        car.setMake("BMW");
        car.setModel("Tacoma");
        car.setDoors(4);
        car.setColor("Black");
        car.setConvertible(false);
        car.describeCar();

        Car targa = new Car();
        targa.setModel("Spider");
        targa.describeCar();

        System.out.println("---BankAccount Class---");
        BankAccount ryan = new BankAccount();
        ryan.setAccountNumber(0001);
        ryan.setCustName("Ryan Jacobo");
        ryan.setEmail("ryanjacobo@email.com");
        ryan.setPhoneNumber("650-793-9870");
        ryan.deposit(1000.25);
        ryan.withdraw(100.50);
        ryan.deposit(400);

        ryan.printAccount();

        System.out.println("---SimpleCalculator Class---");
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        BankAccount kipster = new BankAccount(2, 10000, "Kipster", "kipster@email.com", "650-693-5056");
        kipster.deposit(1300);
        kipster.printAccount();

        BankAccount noParams = new BankAccount();
        noParams.printAccount();

        System.out.println("---Customer Class---");
        Customer first = new Customer("Marty", 3000, "marty@email.com");
        System.out.println(first.toString());
        Customer second = new Customer("George", "george@email.com");
        System.out.println(second.toString());
        Customer third = new Customer();
        System.out.println(third.toString());

        System.out.println("---Dog Class---");
        Dog rex = new Dog("Rex");
        Dog fluffy = new Dog("Fluffy");

        rex.printName();
        fluffy.printName();
        fluffy.bark();

        System.out.println("---Student Class---");
        // POJO
        for(int i = 1; i <= 5; i++){
            Student s = new Student("S923300" + i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Time";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "05/11/1985", "Java Masterclass");
            System.out.println(s);
        }

        // Record
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S923300" + i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Time";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "05/11/1985", "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
        System.out.println(recordStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());

        System.out.println("---Wall---");
        Wall firstWall = new Wall(-1.25,-1.25);
//        firstWall.setHeight(2);
        System.out.println(firstWall.getHeight() + ", " + firstWall.getWidth());
        System.out.println(firstWall.getArea());
        Wall secondWall = new Wall(4.5,2.0);
        System.out.println(secondWall.getArea());

        System.out.println("---Point---");
        Point firstP = new Point(6,5);
        Point secondP = new Point(3, 1);
//        firstP.distance();
//        System.out.println("distance(0,0)= " + firstP.distance());
        System.out.println("distance(second)= " + firstP.distance(secondP));
        System.out.println("distance(2,2)= " + firstP.distance(2,2));
        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

        System.out.println("---Carpet Cost Calculator---");
        Floor floor = new Floor(2.75, 4.0);
        Carpet carpet = new Carpet(3.5);
        Calculator carpetCost = new Calculator(floor, carpet);
        System.out.println(carpetCost.getTotalCost());

        floor = new Floor(5.4, 4.5);
        carpet = new Carpet(1.5);
        carpetCost = new Calculator(floor, carpet);
        System.out.println(carpetCost.getTotalCost());

        System.out.println("---Complex Number---");
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());
    }
}
