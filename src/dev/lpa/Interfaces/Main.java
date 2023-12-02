package dev.lpa.Interfaces;

import dev.lpa.Interfaces.Interfaces.FlightEnabled;
import dev.lpa.Interfaces.Interfaces.OrbitEarth;
import dev.lpa.Interfaces.Interfaces.Trackable;
import dev.lpa.Interfaces.Parent.Animal;
import dev.lpa.Interfaces.Subclasses.Bird;
import dev.lpa.Interfaces.Subclasses.Jet;
import dev.lpa.Interfaces.Subclasses.Satellite;
import dev.lpa.Interfaces.Subclasses.Truck;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Bird bird = new Bird();
//        bird can be assigned to 3 other reference types - Animal, FlightEnabled, Trackable
        Animal animal = bird;
        animal.move();
        FlightEnabled flier = bird; // assigning bird (not instantiating)
        flier.takeOff();
        Trackable tracked = bird;
        tracked.track();

        System.out.println("-".repeat(40));
        inFlight(flier);

        System.out.println("-".repeat(40));
        Jet f16 = new Jet();
        inFlight(f16);

        System.out.println("-".repeat(40));
        Truck truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2fkm or %.2f miles%n", kmsTraveled, milesTraveled);
        System.out.printf("The truck traveled %.2fkm or %.2f miles%n", milesTraveled, milesTraveled * FlightEnabled.MILES_TO_KM);

        System.out.println("-".repeat(40));
        Bird eagle = new Bird();
        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(eagle);

        takeOffFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        System.out.println("-".repeat(40));
        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(f16);

        takeOffFliers(betterFliers); // method param must be changed to "List<FlightEnabled>" otherwise only ArrayList Type works
        flyFliers(betterFliers);
        landFliers(betterFliers);

        System.out.println("-".repeat(40));
        inFlight(new Satellite());
    }

    private static void inFlight(FlightEnabled flier){
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
