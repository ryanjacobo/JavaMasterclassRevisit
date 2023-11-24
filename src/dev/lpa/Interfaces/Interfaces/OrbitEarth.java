package dev.lpa.Interfaces.Interfaces;

import dev.lpa.Interfaces.Enums.FlightStages;

// an interface extending another interface
public interface OrbitEarth extends FlightEnabled, Trackable {
    void achieveOrbit(); // abstract method

    // "public" access modifier is implicit on interfaces
    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ": " + description;
        log(description);
    }

    // FlightEnabled implements FlightStages therefore this class has access to FlightStages method via default
    @Override
    default FlightStages transition(FlightStages stage) {
//        return FlightEnabled.super.transition(stage);

        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}
