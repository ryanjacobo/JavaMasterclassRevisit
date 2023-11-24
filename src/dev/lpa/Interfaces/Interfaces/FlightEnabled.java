package dev.lpa.Interfaces.Interfaces;

import dev.lpa.Interfaces.Enums.FlightStages;

// interfaces is implemented to subclasses using the word "implements"
// omitting "public" on an interface makes it implicitly public
// an interface isn't a class therefore doesn't use the "class" modifier
public interface FlightEnabled {

    public static final double MILES_TO_KM = 1.60934; // constant, "public static final" are redundant
    double KM_TO_MILES = 0.621371;

    // operations an object can perform, defined by the classes that implement the interface
    public abstract void takeOff(); // "public" and "abstract" are not necessary
    abstract void land();
    void fly(); // "public" and "abstract" are not really necessary because any method declared without a body is implicitly declared both public and abstract

    // Extension method - uses "default" modifier
    default FlightStages transition(FlightStages stage){
//        System.out.println("transition not implemented on " + getClass().getSimpleName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    };
}
