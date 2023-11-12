package OOPMasterChallenge;

public class Drink {
    private String size;
    private double price;

    public Drink(){
        this.price = 2;
    }

    public Drink(String size){
        this.size = size;
        if(size == "s"){
            this.price = 2.0;
        }
        if(size == "m"){
            this.price = 2.5;
        }
        if(size == "l"){
            this.price = 3;
        }
    }

    public double getPrice(){
        return price;
    }
}

