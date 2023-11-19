package dev.lpa.Interfaces;

import dev.lpa.Interfaces.Parent.Animal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
//        FlightEnabled flier = bird;
//        Trackable tracked = bird;
        animal.move();

        bird.takeOff();
        bird.fly();
        bird.track();
        bird.land();

        inFlights(bird);

        inFlights(new Jet());

        Truck truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled % .2fkm or %.2f miles%n", kmsTraveled, milesTraveled);

        List<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        takeOffFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        takeOffFliers(betterFliers); // method param must be changed to "List<FlightEnabled>" otherwise only ArrayList Type works
        flyFliers(betterFliers);
        landFliers(betterFliers);

        inFlights(new Satellite());
    }

    private static void inFlights(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        if(flier instanceof OrbitEarth orbit){
            orbit.achieveOrbit();
        }
        flier.land();
    }

    private static void takeOffFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.land();
        }
    }
}
