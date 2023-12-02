package dev.lpa.Interfaces;

import dev.lpa.Interfaces.Enums.FlightStages;
import dev.lpa.Interfaces.Interfaces.FlightEnabled;
import dev.lpa.Interfaces.Interfaces.OrbitEarth;
import dev.lpa.Interfaces.Interfaces.Trackable;
import dev.lpa.Interfaces.Subclasses.Jet;
import dev.lpa.Interfaces.Subclasses.Satellite;

public class Test {
    public static void main(String[] args) {
        System.out.println("------inFlights method-------");
        inFlights(new Jet());

        System.out.println("------orbit method------");
//        OrbitEarth.log("Testing " + new Satellite());
        orbit(new Satellite());
//        inFlights(new Satellite());
    }

    private static void inFlights(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.GROUNDED); // FlightEnabled.transition(stage)

        // OrbitEarth.log: description(GROUNDED): OrbitEarth.transition(GROUNDED).logStage(GROUNDED, description)
        // FlightStages.track()
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        if(flier instanceof OrbitEarth orbit){
            orbit.achieveOrbit();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier){
        System.out.println("--------Satellite.takeOff()-------");
        flier.takeOff(); // Satellite.takeOff(); Satellite.flightStatus(description); OrbitEarth.log(description);
        System.out.println("--------Satellite.fly()-------");
        flier.fly(); // Satellite.achieveOrbit()
        System.out.println("--------Satellite().dataCollection()-------");
        flier.dataCollection();
        System.out.println("--------Satellite.land()-------");
        flier.land();
    }
}
