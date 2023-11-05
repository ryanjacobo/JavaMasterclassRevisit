package ClassesAndObjects;

public class Carpet {
    private double cost;

    public Carpet(double cost){
//        setCost(cost);
        if(cost<0){
            cost = 0;
        }
        this.cost = cost;
    }

    public double getCost() {
//        return cost;
        return cost;
    }
}
