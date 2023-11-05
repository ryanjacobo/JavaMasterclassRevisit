package Composition;

public class SmartKitchen{
   private CoffeeMaker brewMaster;
   private Refrigerator iceBox;
   private DishWasher dishWasher;
   private Microwave microwave;

   public SmartKitchen() {
      brewMaster = new CoffeeMaker();
      iceBox = new Refrigerator();
      dishWasher = new DishWasher();
      microwave = new Microwave();
   }

   public CoffeeMaker getBrewMaster() {
      return brewMaster;
   }

   public Refrigerator getIceBox() {
      return iceBox;
   }

   public DishWasher getDishWasher() {
      return dishWasher;
   }

   public Microwave getMicrowave() {
      return microwave;
   }

   public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag, boolean microwaveFlag){
      brewMaster.setHasWorkToDo(coffeeFlag);
      iceBox.setHasWorkToDo(fridgeFlag);
      dishWasher.setHasWorkToDo(dishWasherFlag);
      microwave.setHasWorkToDo(microwaveFlag);
   }

   public void doKitchenWork() {
      brewMaster.brewCoffee();
      iceBox.orderFood();
      dishWasher.doDishes();
      microwave.heatFood();
   }
}

class CoffeeMaker{
   private boolean hasWorkToDo;

   public void setHasWorkToDo(boolean hasWorkToDo) {
      this.hasWorkToDo = hasWorkToDo;
   }

   public void brewCoffee(){
      if(hasWorkToDo){
         System.out.println("Brewing Coffee");
         hasWorkToDo = false;
      }
   }
}

class Refrigerator{
   private boolean hasWorkToDo;

   public void setHasWorkToDo(boolean hasWorkToDo) {
      this.hasWorkToDo = hasWorkToDo;
   }

   public void orderFood(){
      if(hasWorkToDo){
         System.out.println("Ordering Food");
         hasWorkToDo = false;
      }
   }
}

class DishWasher{
   private boolean hasWorkToDo;

   public void setHasWorkToDo(boolean hasWorkToDo) {
      this.hasWorkToDo = hasWorkToDo;
   }

   public void doDishes(){
      if(hasWorkToDo){
         System.out.println("Washing dishes");
         hasWorkToDo = false;
      }
   }
}

class Microwave{
   private boolean hasWorkToDo;

   public  void setHasWorkToDo(boolean hasWorkToDo){
      this.hasWorkToDo = hasWorkToDo;
   }
   public void heatFood(){
      if(hasWorkToDo){
         System.out.println("Heating food");
         hasWorkToDo = false;
      }
   }
}