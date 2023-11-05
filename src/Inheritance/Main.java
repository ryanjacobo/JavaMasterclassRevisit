package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        dog.run();

        System.out.println("---Circle Inheritance---");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());

        Circle negative = new Circle(-5);
        System.out.println(negative.getRadius());

        System.out.println("---Rectangle Inheritance---");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        Rectangle test1 = new Rectangle(-5,1);
        System.out.println(test1.getArea());
        Rectangle test2 = new Rectangle(5,-1);
        System.out.println(test2.getArea());
        Rectangle test3 = new Rectangle(1,3);
        System.out.println(test3.getArea());
        Rectangle test4 = new Rectangle(5.25,3.5);
        System.out.println(test4.getArea());
    }
}
