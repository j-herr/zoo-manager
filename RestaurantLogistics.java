public class RestaurantLogistics extends Restaurants {

   private String entreeOne;
   private String entreeTwo;
   private String entreeThree;
   private String drinkOne;
   private String drinkTwo;
   private String sideOne;
   private String sideTwo;
   private int entreeOnePrice;
   private int entreeTwoPrice;
   private int entreeThreePrice;
   private int drinkOnePrice;
   private int drinkTwoPrice;
   private int sideOnePrice;
   private int sideTwoPrice;
   
   
   public RestaurantLogistics (String restaurantName, int backHouseWorkers, int frontHouseWorkers, int managers,
                      int backHouseWage, int frontHouseWage, int managerWage, String entreeOne, String entreeTwo,
                      String entreeThree, String drinkOne, String drinkTwo, String sideOne, String sideTwo, int 
                      entreeOnePrice, int entreeTwoPrice, int entreeThreePrice, int drinkOnePrice, int drinkTwoPrice,
                      int sideOnePrice, int sideTwoPrice) {
              super(restaurantName, backHouseWorkers, frontHouseWorkers, managers, backHouseWage, frontHouseWage, managerWage);        
              this.setEntreeOne(entreeOne); this.setEntreeTwo(entreeTwo); this.setEntreeThree(entreeThree);
              this.setDrinkOne(drinkOne); this.setDrinkTwo(drinkTwo); this.setSideOne(sideOne); this.setSideTwo(sideTwo);
              this.setEntreeOnePrice(entreeOnePrice); this.setEntreeTwoPrice(entreeTwoPrice); this.setEntreeThreePrice(entreeThreePrice);
              this.setDrinkOnePrice(drinkOnePrice); this.setDrinkTwoPrice(drinkTwoPrice); this.setSideOnePrice(sideOnePrice); this.setSideTwoPrice(sideTwoPrice);
              }
                 
      public void setEntreeOne(String entreeOne) { this.entreeOne = entreeOne; }
      public void setEntreeTwo(String entreeTwo) { this.entreeTwo = entreeTwo; }
      public void setEntreeThree(String entreeThree) { this.entreeThree = entreeThree; }
      public void setDrinkOne(String drinkOne) { this.drinkOne = drinkOne; }
      public void setDrinkTwo(String drinkTwo) { this.drinkTwo = drinkTwo; }
      public void setSideOne(String sideOne) { this.sideOne = sideOne; }
      public void setSideTwo(String sideTwo) { this.sideTwo = sideTwo; }
      public void setEntreeOnePrice(int EntreeOnePrice) { this.entreeOnePrice = entreeOnePrice; }
      public void setEntreeTwoPrice(int EntreeTwoPrice) { this.entreeTwoPrice = entreeTwoPrice; }
      public void setEntreeThreePrice(int EntreeThreePrice) { this.entreeThreePrice = entreeThreePrice; }
      public void setDrinkOnePrice(int drinkOnePrice) { this.drinkOnePrice = drinkOnePrice; }
      public void setDrinkTwoPrice(int drinkTwoPrice) { this.drinkTwoPrice = drinkTwoPrice; }
      public void setSideOnePrice(int sideOnePrice) { this.sideOnePrice = sideOnePrice; }
      public void setSideTwoPrice(int sideTwoPrice) { this.sideTwoPrice = sideTwoPrice; }
     
      public String getEntreeOne() { return this.entreeOne; }
      public String getEntreeTwo() { return this.entreeTwo; }
      public String getEntreeThree() { return this.entreeThree; }
      public String getDrinkOne() { return this.drinkOne; }
      public String getDrinkTwo() { return this.drinkTwo; }
      public String getSideOne() { return this.sideOne; }
      public String getSideTwo() { return this.sideTwo; }
      public int getEntreeOnePrice() { return this.entreeOnePrice; }
      public int getEntreeTwoPrice() { return this.entreeTwoPrice; }
      public int getEntreeThreePrice() { return this.entreeThreePrice; }
      public int getDrinkOnePrice() { return this.drinkOnePrice; }
      public int getDrinkTwoPrice() { return this.drinkTwoPrice; }
      public int getSideOnePrice() { return this.sideOnePrice; }
      public int getSideTwoPrice() { return this.sideTwoPrice; }

}