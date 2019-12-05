import java.util.ArrayList;
public class GiftShop
{
   //for simplicity, we're assuming all employees do 8 hr shifts.
   private final int hrsWorked = 8;
   //name of gift shop
   private String giftShopName;
   
   //how many part time sales associates worked.
   private int salesAssociates;
   
   //how many assitant managers on duty
   private int assistantManagers;
   
   //how many managers on duty
   private int managers;
   
   //wages for sales associates (sa)
   private double salesAssociateWage;
   
   
   //wages for assistant managers (asm)
   private double assistantManagerWage;
   
   //wages for store managers (sm)
   private double managerWage;
   
   //Expenses for employees
   private double totalWages;
   private double allSAWages;
   private double allASMWages;
   private double allSMWages;
   
   private double giftRevenue;
   
   Inventory giftShopInventory;
   
   //Initializes the gift shop with a default inventory
   public GiftShop(String name, int sa, int asm, int sm, double saWage, double asmWage,double smWage)
   {
      this.giftShopInventory = new Inventory();
      setGiftShopName(name);
      setSalesAssociates(sa);
      setAssistantManagers(asm);
      setManagers(sm);
      setSAWage(saWage);
      setASMWage(asmWage);
      setSMWage(smWage);
      setAllSAWages();
      setAllASMWages();
      setAllSMWages();
      setTotalWages();
      
   }
   
   //adds revenue from gift sales
   public void addGiftRevenue(Gift gift, int quantity)
   {
      this.giftRevenue = this.giftRevenue + (gift.getGiftPrice() * qantity);
   }
   public double getGiftRevenue()
   {
      return this.giftRevenue;  
   }
   //this is all the wages combined.
   public void setTotalWages()
   {
      this.totalWages = this.allSAWages + this.allASMWages + this.allSMWages;
   }
   
   //returns all the wages combined.
   public double getTotalWages()
   {
      return this.totalWages;
   }
   
   //sets wages for all sales associates
   public void setAllSAWages()
   {
      this.allSAWages = salesAssociateWage * (salesAssociates * hrsWorked);
   }
   
   //gets total wages for all sales associates (for detailed report)
   public double getAllSAWages()
   {
      return this.allSAWages;
   }
   
   //sets total wages for all assistant managers that worked
   public void setAllASMWages()
   {
      this.allASMWages = assistantManagerWage * (assistantManagers * hrsWorked);
   }
   
   //gets total wages for all assistantManagers
   public double getAllASMWages()
   {
      return this.allASMWages;
   }
   
   //sets total wages for all managers on duty
   public void setAllSMWages()
   {
      this.allSMWages = managerWage * (managers * hrsWorked);
   }
   
   //gets total only for managers on duty
   public double getAllSMWages()
   {
      return this.allSMWages;
   }
   public void setGiftShopName(String name)
   {
      this.giftShopName = name;
   }
   public String getGiftShopName()
   {
      return this.giftShopName;
   }
   public void setSalesAssociates(int numOfSA)
   {
      this.salesAssociates = numOfSA;
   }
   public int getSalesAssociates()
   {
      return this.salesAssociates;
   }

   public void setAssistantManagers(int numOfASM)
   {
      this.assistantManagers = numOfASM;
   }
   public int getAssistantManagers()
   {
      return this.assistantManagers;
   }
   public void setManagers(int numOfSM)
   {
      this.managers = numOfSM;
   }
   public int getManagers()
   {
      return this.managers;
   }
   public void setSAWage (double saWage)
   {
      this.salesAssociateWage = saWage;
   }
   public double getSAWage()
   {
      return salesAssociateWage;
   }

   public void setASMWage(double asmWage)
   {
      this.assistantManagerWage = asmWage;
   }
   public double getASMWage()
   {
      return assistantManagerWage;
   }
   public void setSMWage(double SMWage)
   {
      this.managerWage = SMWage;
   }
   public double getSMWage()
   {
      return managerWage;
   }
   
   //will display total cost of all employees entered, and will also
   //display total value of current inventory
   public String toString()
   {
      String output;
      double t = totalWages;
      double val = giftShopInventory.getTotalValue();
      output = "Total cost of all employees entered: $" + t + "\nTotal value of all inventory: $" + val + "\nTotal gift sales: $" + getGiftRevenue();
      return output;
   }
   public void displayInventory()
   {
      giftShopInventory.displayInventory();
   }
}
