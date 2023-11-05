package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player kipster = new Player("Kipster",100, "AR-15");
        kipster.loseHealth(23);
        System.out.println(kipster.getName() + " health: " + kipster.getHealth());

        Player george = new Player("George");
        System.out.println(george.getName() + "'s weapon: " + george.getWeapon());
        Player marty = new Player("Marty", 200, "Sword");
        System.out.println(marty.getName() + " health: " + marty.getHealth());
        System.out.println(marty.getName() + "'s weapon: " + marty.getWeapon());

        System.out.println("---Printer---");
        Printer firstPrinter = new Printer(100, true);
        System.out.println(firstPrinter.toString());
        firstPrinter.printPages(5);
        firstPrinter.printPages(7);
        firstPrinter.addToner(20);
        firstPrinter.printPages(50);
        System.out.println("Total pages printed to date: " + firstPrinter.getPagesPrinted());

        Printer secondPrinter = new Printer(80, false);
        System.out.println(secondPrinter.toString());
        secondPrinter.printPages(6);
        secondPrinter.printPages(63);
        System.out.println("Total pages printed to date: " + secondPrinter.getPagesPrinted());
    }
}
