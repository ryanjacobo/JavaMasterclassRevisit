package ClassesAndObjects;

public class Dog {
//    private static String name; // static variable: using "static" in the field makes assigning a name to a new Dog object constant to other new objects
    private String name; // instance variable

    public Dog(String name){
        this.name = name;
    }

    // Instance method
    public void printName(){
        System.out.println("name: " + name);
    }

    // Static method
    public static void bark(){
        System.out.println("Woof!");
    }
}
