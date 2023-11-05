package Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, "2540x1440");
        Dimension moboDim = new Dimension(9, 10, 2);
        Motherboard theMobo = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44", moboDim);

        // Composition
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMobo);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

        System.out.println("---Smart Kitchen---");
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);

        kitchen.getDishWasher().doDishes();
        kitchen.getBrewMaster().brewCoffee();
        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(true, true, false, true);
        kitchen.doKitchenWork();

        System.out.println("---Class composition---");
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
