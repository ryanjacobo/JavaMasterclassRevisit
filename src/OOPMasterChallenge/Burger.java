package OOPMasterChallenge;

public class Burger {
    private double price;

    public Burger(){
        this.price = 3;
    }

    public double addToppings(Toppings toppings){
        return this.price += toppings.getPrice();
    }

    public double getPrice() {
      return this.price;
    }
}

class Toppings{
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean cheese;
    private boolean bacon;
    private double price;

    public Toppings(){
        this.price = 0;
    }
    public Toppings(boolean lettuce, boolean tomato, boolean onion, boolean cheese, boolean bacon) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.cheese = cheese;
        this.bacon = bacon;
        if(this.lettuce){
            this.price += 0.5;
        }
        if(this.tomato){
            this.price += 0.5;
        }
        if(this.onion){
            this.price += 0.5;
        }
        if(this.cheese){
            this.price += 1.0;
        }
        if(this.bacon){
            this.price += 2;
        }
    }

    public double getPrice() {
        return this.price;
    }
}
