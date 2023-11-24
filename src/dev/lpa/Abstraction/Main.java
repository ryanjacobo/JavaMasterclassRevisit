package dev.lpa.Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100); // Abstracts cannot be used to create Objects

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();

//        dog.doAnimalStuff(dog);
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Germand Shepherd", "big", 150));
        animals.add(new Dog("Pug", "small", 70));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "medium", 20));
        animals.add(new Horse("Clydesdale", "large", 1000));

        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal currentAnimal){
                currentAnimal.shedHair();
            }
        }

    }

    private static void doAnimalStuff(Animal animal){
        // using abstract methods
        animal.makeNoise();
        animal.move("not slow");
    }
}
