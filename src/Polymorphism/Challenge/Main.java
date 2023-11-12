package Polymorphism.Challenge;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden commodore = new Holden(6, "Holden Commodore");
        System.out.println(commodore.startEngine());
        System.out.println(commodore.accelerate());
        System.out.println(commodore.brake());

        Ford falcon = new Ford(6, "Ford Falcon");
        System.out.println(falcon.startEngine());
        System.out.println(falcon.accelerate());
        System.out.println(falcon.brake());
    }
}
