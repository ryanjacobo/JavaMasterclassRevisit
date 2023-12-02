package dev.lpa.Interfaces.Subclasses;

import dev.lpa.Interfaces.Interfaces.FlightEnabled;
import dev.lpa.Interfaces.Interfaces.Trackable;
import dev.lpa.Interfaces.Parent.Animal;

// extends Animal and implements Trackable and FlightEnabled
public class Bird extends Animal implements Trackable, FlightEnabled {
    // the subclass of an abstract class doesn't have to call the constructor of the abstract class
    @Override
    public void move() {
        System.out.println(getExplicitType() + " Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getExplicitType() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getExplicitType()  + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getExplicitType() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getExplicitType() + "'s coordinates recorded");
    }
}
