package dev.lpa.Interfaces;

// an interface extending another interface
public interface OrbitEarth extends FlightEnabled{
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

    @Override
    default FlightStages transition(FlightStages stage) {
//        return FlightEnabled.super.transition(stage);

        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}
