package dev.lpa.Interfaces;

public class Test {
    public static void main(String[] args) {
        System.out.println("------inFlights method-------");
        inFlights(new Jet());
//        OrbitEarth.log("Testing " + new Satellite());
        System.out.println("------orbit method------");
        orbit(new Satellite());
    }

    private static void inFlights(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        if(flier instanceof OrbitEarth orbit){
            orbit.achieveOrbit();
        }
        flier.land();
    }

    public static void orbit(OrbitEarth flier){
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
