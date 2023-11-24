package dev.lpa.Interfaces.Subclasses;

import dev.lpa.Interfaces.Interfaces.FlightEnabled;
import dev.lpa.Interfaces.Interfaces.Trackable;
import dev.lpa.Interfaces.Parent.Animal;

// extends Animal and implements Trackable and FlightEnabled
public class Bird extends Animal implements Trackable, FlightEnabled {
    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
