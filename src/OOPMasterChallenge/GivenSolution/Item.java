package OOPMasterChallenge.GivenSolution;
// creates additional items to be added to the meal i.e. drinks, side, dessert
public class Item {
    private String type;
    private String name;
    private double basePrice;
    private String size = "MEDIUM"; // default field, only get change via setSize()

    // Item("drink", "beer", 5)
    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.basePrice = price;
    }

    // get always returns
    public String getName() {
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdjustedPrice(){
        return switch(size){
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size; // only applies if size = "SMALL" or "LARGE"
    }

    // static - called within the class
    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price); //%20s = 20 spaces, %6.2f = 6 spaces with 2 dec places, %n = next line
    }

    // polymorphism - overloading, what's called outside(in the Main)
    public void printItem(){
//        System.out.println("----------Item ordered---------");
        printItem(getName(), getAdjustedPrice());
//        System.out.println("----------End of Item----------");

    }
}
