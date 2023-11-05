package Polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public static Car createCar(String type, String description){
        return switch(type.toUpperCase().charAt(0)){
            case 'G' -> new GasPoweredCar(description);
            case 'C' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            default -> new Car(description);
        };
    }
    public void startEngine(){
//        String instanceType = this.getClass().getSimpleName();
//        System.out.println(description + " is a " + instanceType + " car.");
        System.out.println("Car -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6;
    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }

    public void startGasEngine(){
        System.out.println("Gas engine started!");
    }
}

class ElectricCar extends Car{
    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    public void startGasEngine(){
        System.out.println("Electric motor started!");
    }
}

class HybridCar extends Car{
    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    public void startGasEngine(){
        System.out.println("Hybrid engine started!");
    }
}