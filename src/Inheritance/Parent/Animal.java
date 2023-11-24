package Inheritance.Parent;

public class Animal {
    private String type;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String type, int brain, int body, int size, int weight){
        this.type = type;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal eats!");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at speed " + speed);
    }

    public String getType() {
        return type;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody(){
        return body;
    }

    public int getSize(){
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
