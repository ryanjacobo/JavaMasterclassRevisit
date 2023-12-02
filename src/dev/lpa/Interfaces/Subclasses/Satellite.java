package dev.lpa.Interfaces.Subclasses;

import dev.lpa.Interfaces.Enums.FlightStages;
import dev.lpa.Interfaces.Interfaces.OrbitEarth;

public class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;


    public void achieveOrbit() {
//        transition(getExplicitType() + "has achieved orbit");
        flightStatus(getExplicitType() + " has achieved orbit");
    }

    private void flightStatus(String description){
        System.out.println(description); // flightStatus(description)
        System.out.print(getExplicitType() + " is "); // FlightEnabled.transition(stages)
        stage = transition(stage);// calls FlightEnabled.transition(stage); calls OrbitEarth.transition(stage)
        stage.track(); // FlightStages.track()
    }

//    private final String getExplicitType(){
//        return getClass().getSimpleName();
//    }

    // extended from FlightEnabled
    @Override
    public void takeOff() {
        flightStatus(getExplicitType() + " is taking Off");
    }

    @Override
    public void land() {
        flightStatus(getExplicitType() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getExplicitType() + " is flying");
        achieveOrbit();
//        flightStatus("Data collection while Orbiting");
    }

    public void dataCollection() {
        flightStatus(getExplicitType() + " is collecting data while Orbiting");
    }

    @Override
    public String toString() {
        return "Satellite instance";
    }
}
