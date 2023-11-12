package OOPMasterChallenge;

public class Side {
    private double price;
    private String size;

    public Side(){
        this.price = 2;
    }
    public Side(String size){
        this.size = size;
        if(size == "s"){
            this.price = 2;
        }
        if(size == "m"){
            this.price = 2.50;
        }
        if(size == "l"){
            this.price = 3;
        }
    }

    public double getPrice() {
        return price;
    }
}
