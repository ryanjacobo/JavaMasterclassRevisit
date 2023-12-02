package dev.lpa.Interfaces.Interfaces;

public interface Trackable {
    void track();

    default String getExplicitType(){
        return getClass().getSimpleName();
    }
}
