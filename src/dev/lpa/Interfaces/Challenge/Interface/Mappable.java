package dev.lpa.Interfaces.Challenge.Interface;

import dev.lpa.Interfaces.Challenge.Enums.Color;
import dev.lpa.Interfaces.Challenge.Enums.Geometry;

public interface Mappable {

   String JSON_PROPERTY = """
           "properties": {%s} """;
    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
