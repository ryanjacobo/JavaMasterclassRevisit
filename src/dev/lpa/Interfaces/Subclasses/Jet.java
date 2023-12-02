package dev.lpa.Interfaces.Subclasses;

import dev.lpa.Interfaces.Enums.FlightStages;
import dev.lpa.Interfaces.Interfaces.FlightEnabled;
import dev.lpa.Interfaces.Interfaces.Trackable;

// implements FlightEnabled and Trackable but doesn't extend Animal
public class Jet implements FlightEnabled, Trackable {

    @Override
    public void takeOff() {
        System.out.println(getExplicitType() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getExplicitType() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getExplicitType() + " is flying");
    }

    @Override
    public String getExplicitType() {
        return FlightEnabled.super.getExplicitType();
    }

    @Override
    public void track() {
        System.out.println(getExplicitType() + "'s coordinates recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.print(getExplicitType() + " is ");
        return FlightEnabled.super.transition(stage);
    }

}
