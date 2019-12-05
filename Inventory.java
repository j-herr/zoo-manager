import java.util.ArrayList;
public class Inventory
{

   //Will keep track of current Inventory; defaulted to 1000;
   public static ArrayList<Gift> inStock = new ArrayList<Gift>(1000);
   private Gift temp;
   private double totalValue = 0;
   
   //will keep track of gifts added to basket
   public static ArrayList<Gift> inBasket = new ArrayList<Gift>();

   public Inventory()
   {
   
      for (int i = 0; i < 200 ; i++)
      {
         inStock.add(new Gift("Key Chain", 4.99, 1));
         temp = inStock.get(i);
         setTotalValue(temp);
         
      }
      for (int i = 200; i <401; i++)
      {
         inStock.add(new Gift("Coffee Mug", 14.99, 2));
         temp = inStock.get(i);
         setTotalValue(temp);
      }
      for (int i = 400 ; i < 601; i++)
      {
         inStock.add(new Gift("Zoo Shirt", 19.99, 3));
         temp = inStock.get(i);
         setTotalValue(temp);
      }
      for (int i = 600; i <801; i++)
      {
         inStock.add(new Gift("Stuffed Animal Small", 24.99, 4));
         temp = inStock.get(i);
         setTotalValue(temp);
      }
      
      for (int i = 800; i <1001; i++)
      {
         inStock.add(new Gift("Stuffed Animal Large", 49.99, 5));
         temp = inStock.get(i);
         setTotalValue(temp);
      }
   }

   public void setGift(Gift gift)
   {
      this.temp = gift;
   }
   public Gift getGift()
   {
      return this.temp;
   }
   public void setTotalValue(Gift gift)
   {
      this.totalValue = totalValue + gift.getGiftPrice();
      this.totalValue = Math.floor(totalValue * 100)/100;
   }
   public double getTotalValue()
   {
      return this.totalValue;
   }
   
   public void displayInventory()
   {
      Gift temp2 = inStock.get(0);
      Gift temp3;
      int count = 0;
      for (int i = 0; i < inStock.size(); i++)
      {
         temp3 = inStock.get(i);
         if (temp2.getGiftCode() == temp3.getGiftCode())
         {
            count++;
         }
         else
         {
            System.out.println(temp2.getGiftName() + " x" + count + " at $" + temp2.getGiftPrice() + " each");
            temp2 = inStock.get(i);
            count = 0;
         }
         
      }
      System.out.println(temp2.getGiftName() + " x" + count + " at $" + temp2.getGiftPrice() + " each");
   }
}