package dev.lpa.Interfaces.Enums;

import dev.lpa.Interfaces.Interfaces.Trackable;

public enum FlightStages implements Trackable {
//    public enum FlightStages {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this); // this = LAUNCH, CRUISE, DATA_COLLECTION
        }
    }

    // get next flight stage
    public FlightStages getNextStage(){
        FlightStages[] allStages = values(); // initialize FlightStages[], 'values()' is a built-in method provided by Java for enums
        return allStages[(ordinal() + 1) % allStages.length]; // (index + 1) % 4, retrieves the next stage from the array
    }
}
