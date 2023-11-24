package dev.lpa.Abstraction;

// an abstract class is called with the the word "extends"
public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // abstract methods can be created without a body
    public abstract void move(String speed);
    public abstract void makeNoise();

    // "final" keeps method from being overridden by a class
    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

abstract class Mammal extends Animal{
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks." : "runs.");
    }

    public abstract void shedHair();
}
