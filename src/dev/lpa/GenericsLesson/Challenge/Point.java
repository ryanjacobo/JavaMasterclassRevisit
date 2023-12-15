package dev.lpa.GenericsLesson.Challenge;

import java.util.Arrays;

abstract class Point implements Mappable{
    private double[] location;

    public Point(String coords){
        this.location = Mappable.stringToLatLon(coords);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")" );
    }

    private String location() {
        return Arrays.toString(location);
    }
}
