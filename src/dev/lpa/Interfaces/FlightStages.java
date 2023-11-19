package dev.lpa.Interfaces;

public enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values(); // initialize FlightStages[]
        return allStages[(ordinal() + 1) % allStages.length]; // (index + 1) % 4
    }
}
