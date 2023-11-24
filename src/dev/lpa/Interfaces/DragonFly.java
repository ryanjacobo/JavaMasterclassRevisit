package dev.lpa.Interfaces;

import dev.lpa.Interfaces.Interfaces.FlightEnabled;

public record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
