package dev.lpa.Interfaces.Challenge.Classes;

import dev.lpa.Interfaces.Challenge.Enums.Color;
import dev.lpa.Interfaces.Challenge.Enums.Geometry;
import dev.lpa.Interfaces.Challenge.Enums.PointMarker;
import dev.lpa.Interfaces.Challenge.Enums.UsageType;
import dev.lpa.Interfaces.Challenge.Interface.Mappable;

public class Building implements Mappable {
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage){
        this.name = name;
        this. usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch(usage){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
