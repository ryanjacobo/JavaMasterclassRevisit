package ClassesAndObjects;

import java.util.Locale;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Red";

    private int doors = 4;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        // "this" distinguishes the parameter from the class variable
        if(make==null)make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porsche", "bmw" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
//        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "" : "Not") + " Convertible");
    }
}
