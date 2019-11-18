public class Restaurants {
   private String restaurantName;
   private int backHouseWorkers; //number for back of house workers
   private int frontHouseWorkers; // number for front of house workers
   private int managers; //probably going to be one or two 
   private int backHouseWage;  //wages will all be per hour for uniformity
   private int frontHouseWage;
   private int managerWage;
   
   public Restaurants(String restaurantName, int backHouseWorkers, int frontHouseWorkers, int managers,
                      int backHouseWage, int frontHouseWage, int managerWage) {
           this.setRestaurantName(restaurantName);
           this.setBackHouseWorkers(backHouseWorkers);
           this.setFrontHouseWorkers(frontHouseWorkers);
           this.setManagers(managers);
           this.setBackHouseWage(backHouseWage);
           this.setFrontHouseWage(frontHouseWage);
           this.setManagerWage(managerWage);
           }

   public void setRestaurantName(String restaurantName) { this.restaurantName = restaurantName; }
   public void setBackHouseWorkers(int backHouseWorkers) { this.backHouseWorkers = backHouseWorkers; } 
   public void setFrontHouseWorkers(int frontHouseWorkers) { this.frontHouseWorkers = frontHouseWorkers; }
   public void setManagers(int managers) { this.managers = managers; }
   public void setBackHouseWage(int backHouseWage) { this.backHouseWage = backHouseWage; }
   public void setFrontHouseWage(int frontHouseWage) { this.frontHouseWage = frontHouseWage; }
   public void setManagerWage (int managerWage) { this.managerWage = managerWage; }
   
   public String getRestaurantName() {return this.restaurantName; }
   public int getBackHouseWorkers() {return this.backHouseWorkers; }
   public int getFrontHouseWorkers() { return this.frontHouseWorkers; }
   public int getManagers() { return this.managers; }
   public int getBackHouseWage() { return this.backHouseWage * 8 * this.backHouseWorkers; }
   public int getFrontHouseWage() { return this.frontHouseWage * 8 * this.frontHouseWorkers; }
   public int getManagerWage() { return this.managerWage * 8 * this.managers; }
   
      
   




}