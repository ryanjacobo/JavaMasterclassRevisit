package Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie goonies = new Adventure("Goonies");
        goonies.watchMovie();

        Movie aceVentura = new Comedy("Ace Ventura");
        aceVentura.watchMovie();

        Movie theMovie = Movie.getMovie("S", "Star Wars");
        theMovie.watchMovie();
        Scanner s = new Scanner(System.in);
//        while(true){
//            System.out.println("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to quit): " );
//            String type = s.nextLine();
//            if("Qq".contains(type)){
//                // if user input contain either Q or q, loop breaks out
//                break;
//            }
//            System.out.print("Enter Movie Title: ");
//            String title = s.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }

        System.out.println("---Casting a class---");
        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        System.out.println("---Using var---");
        var nuttyProfessor = Movie.getMovie("C", "Nutty Professor");
        nuttyProfessor.watchMovie();
        var backToTheFuture = new Comedy("Back to the Future");
        backToTheFuture.watchComedy();

        Object unknownObject = Movie.getMovie("C", "The Mask");
        System.out.println(unknownObject.getClass().getSimpleName());
        System.out.println(unknownObject.getClass().getSimpleName() == "Comedy" ? true : false);
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy)unknownObject;
            c.watchComedy();
        }
        else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }

        System.out.println("---Car Class---");
        Object unknownCar = Car.createCar("G", "Tacoma");
        System.out.println(unknownCar.getClass().getSimpleName());
        if(unknownCar.getClass().getSimpleName() == "GasPoweredCar"){
            GasPoweredCar g = (GasPoweredCar) unknownCar;
            g.startGasEngine();
        }
        Car bmw = new GasPoweredCar("BMW");
        bmw.startEngine();
        Car tesla = new ElectricCar("Tesla");
        tesla.startEngine();
        Car prius = new HybridCar("Prius");
        prius.startEngine();

        Car gasCar = Car.createCar("g", "Mustang");
        gasCar.startEngine();

        Car ferrari = new Car("2022 Blue Ferrari 296 GTS");
        runRace(ferrari);

        Car ferrari2 = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari2);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
