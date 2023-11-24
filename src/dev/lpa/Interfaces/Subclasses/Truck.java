package dev.lpa.Interfaces.Subclasses;

import dev.lpa.Interfaces.Interfaces.Trackable;

// implements Trackable but does not extend Animal nor implements FlightEnabled
public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
