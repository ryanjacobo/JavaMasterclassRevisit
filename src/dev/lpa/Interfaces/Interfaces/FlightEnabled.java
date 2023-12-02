package dev.lpa.Interfaces.Interfaces;

import dev.lpa.Interfaces.Enums.FlightStages;

import java.security.cert.Extension;

// interfaces is implemented to subclasses using the word "implements"
// omitting "public" on an interface makes it implicitly public
// an interface isn't a class therefore doesn't use the "class" modifier
public interface FlightEnabled {

    // any fields declared on an interface are not instance fields, they're implicitly "public static final", which mean they're really constants
    // Constants use Snake case naming convention
    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    // operations an object can perform, defined by the classes that implement the interface
    public abstract void takeOff(); // "public" and "abstract" are not necessary
    abstract void land();
    void fly(); // "public" and "abstract" are not really necessary because any method declared without a body is implicitly declared both public and abstract

    default String getExplicitType(){
        return getClass().getSimpleName();
    }

    // takes the current stage and transitions to the next stage
    // Without Extension method
    //    FlightStages transition(FlightStages stage); // would need to be applied to all classes to address the problem or use "default" modifier
    // Extension method - uses "default" modifier, "default" allows other classes to extend the interface without having to override the method
        default FlightStages transition(FlightStages stage){
//            System.out.println("transition not implemented on " + getClass().getSimpleName());
//            return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
//            System.out.print(getExplicitType() + " is ");
        return nextStage;
    };

}
