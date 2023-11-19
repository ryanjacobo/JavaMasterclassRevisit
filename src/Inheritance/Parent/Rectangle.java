package Inheritance.Parent;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double length;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(double width, double length){
        this(0, 0, width, length); // using this to use constructor chaining
    }

    public Rectangle(double x, double y, double width, double length){
        this.x = y;
        this.y = y;

        if(width < 0){
            width = 0;
        }
        if(length < 0){
            length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }
    public double getArea(){
        return width * length;
    }
}
