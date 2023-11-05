public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Ryan");

        boolean isAlien = true;
        // code block: {}
        if(isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("I am afraid of aliens.");
        }

        int topScore = 100;
        if(topScore >= 100){
            System.out.println("You got top score!");
        }

        boolean isCar = false;
        // "isCar" means isCar == true; !isCar means isCar == false; isCar != true means isCar = false
        if(isCar != true){
            System.out.println("isCar is false.");
        } else {
            System.out.println("isCar is true.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic == true){
            System.out.println("Car is domestic.");
        } else {
            System.out.println("Car is foreign.");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Legal age" : "Under age";
        System.out.println(ageText);

        double firstVal = 20;
        double secondVal = 80;
        double sum = firstVal + secondVal;
        double product = sum * 100;
        double divisor = 40;
        double quotient = product / divisor;
        double remainder = product % divisor;
        boolean noRemainder = remainder == 0 ? true : false;
        System.out.println("quotient: " + quotient);
        if(!noRemainder){
            System.out.println(product + " / " + divisor + " got some remainder: " + remainder);
        } else {
            System.out.println(product + " / " + divisor + " got no remainder.");
        }
    }
}
