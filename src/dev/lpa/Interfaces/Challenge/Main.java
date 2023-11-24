package dev.lpa.Interfaces.Challenge;

import dev.lpa.Interfaces.Challenge.Classes.Building;
import dev.lpa.Interfaces.Challenge.Classes.UtilityLine;
import dev.lpa.Interfaces.Challenge.Enums.UsageType;
import dev.lpa.Interfaces.Challenge.Enums.UtilityType;
import dev.lpa.Interfaces.Challenge.Interface.Mappable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.SPORTS));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));
        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));
        mappables.add(new Building("Kipster Bike Park", UsageType.SPORTS));
        mappables.add(new UtilityLine("Kipster Water Park", UtilityType.WATER));

        for(var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
