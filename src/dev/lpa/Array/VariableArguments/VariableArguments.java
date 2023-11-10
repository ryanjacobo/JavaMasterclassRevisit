package dev.lpa.Array;

public class VariableArguments {
    public static void main(String[] args) {
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);
        printText("Hello");

        printText("Hello", "World", "Again");

        String[] sArr = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(", ", sArr));
    }

    public static void printText(String... strArr) {
        // "..." allows the method to work with String not just String[]
        // There can be only one variable argument in a method
        // The variable argument must be the last argument
        for(String t: strArr){
            System.out.println(t);
        }
    }
}
