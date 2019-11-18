/*
This initializes a gift. This can be added through the GiftShop class
This will also include appropriate get and setter methods
As well as a toString that will be used by another class to display all elements in stock
  */
public class Gift
{

   private String giftName;
   private double giftPrice;
   
   public Gift()
   {
      this.giftName = " ";
      this.giftPrice = 0.0;
   }
   public Gift(String name, double price)
   {
      setGiftName(name);
      setGiftPrice(price);
   }
   
   public void setGiftName(String name)
   {
      this.giftName = name;
   }
   
   public String getGiftName()
   {
      return giftName;
   }
   
   public void setGiftPrice(double price)
   {
      this.giftPrice = price;
   }
   public double getGiftPrice()
   {
      return giftPrice;
   
   }
   public String toString()
   {
      String output="Gift: ";
      output = output + getGiftName() + ", $" + getGiftPrice();
      return output;
       
   }   
}