package dev.lpa.Interfaces;

public class Satellite implements OrbitEarth, Trackable{

    FlightStages stage = FlightStages.GROUNDED;


    public void achieveOrbit() {
        transition("Orbit was achieved");
    }

    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while Orbiting");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }

    @Override
    public String toString() {
        return "Satellite{}";
    }
}
