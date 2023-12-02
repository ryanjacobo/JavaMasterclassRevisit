package dev.lpa.Interfaces.Parent;

public abstract class Animal {
    // an abstract may or may not have a constructor

    // must be implemented to its subclass
    public abstract void move();

    public final String getExplicitType(){
        return getClass().getSimpleName();
    }
}

