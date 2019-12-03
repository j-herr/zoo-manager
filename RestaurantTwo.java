import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RestaurantTwo {
   static int compare =0;
   
   public static int testCompare(){ return compare; };
    public static String getName() {
      return restaurantName;
   }
  
  
   public static int backEmployeeWages(int backHouseWage, int backHouseWorkers) { return (8*backHouseWage)*backHouseWorkers; }   
   public static int frontEmployeeWages(int frontHouseWage, int frontHouseWorkers) { return (8*frontHouseWage)*frontHouseWorkers;  }
   public static int managerWages(int managerWage, int managers) { return (8*managerWage)*managers;  } 
   //These 3 methods give the wages for each type of worker 
   
   public static int entreeOneRevenue(int entreeOnePrice, int entreeOneSold) {return entreeOnePrice * entreeOneSold; }
   public static int entreeTwoRevenue(int entreeTwoPrice, int entreeTwoSold) {return entreeTwoPrice * entreeTwoSold; }
   public static int entreeThreeRevenue(int entreeThreePrice, int entreeThreeSold) {return entreeThreePrice * entreeThreeSold; }
   public static int sideOneRevenue(int sideOnePrice, int sideOneSold) {return sideOnePrice * sideOneSold; }
   public static int sideTwoRevenue(int sideTwoPrice, int sideTwoSold) {return sideTwoPrice * sideTwoSold; }
   //These methods give the revenue for the amount of food sold

   static int backHouseWorkers = 0;static int frontHouseWorkers = 0;static int frontHouseWage = 0;static int backHouseWage = 0;static int managers = 0;static int managerWage = 0;
   static String restaurantName = "Senor Sapo's";static String entreeOne = "Cheeseburger";static String entreeTwo = "BBQ Bacon Burger";
   static String entreeThree = "The Sapo Special";static String sideOne = "Frog Tails";static String sideTwo = "Roasted Veggies"; 
   static int entreeOnePrice = 6;static int entreeTwoPrice = 9;static int entreeThreePrice = 15;static int sideOnePrice = 2;static int sideTwoPrice = 5;
   static int entreeOneSold = 0;static int entreeTwoSold = 0;static int entreeThreeSold = 0;static int sideOneSold = 0;static int sideTwoSold = 0;
   static int totalBackWage = 0; static int totalFrontWage = 0; static int totalManagerWage = 0;


public static void employeeScreen() {
      JFrame employeeFrame = new JFrame(restaurantName);
      employeeFrame.setSize(550,300);
      employeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      employeeFrame.setLayout(new GridLayout(4,2));
      employeeFrame.setVisible(true);
      
      JLabel backWorkers = new JLabel("Amount of Back House Workers:");
      JLabel frontWorkers = new JLabel("Amount of Front House Workers:");
      JLabel managerWorks = new JLabel("Amount of Managers Working:");
      JTextField backWorkersIn = new JTextField();
      JTextField frontWorkersIn = new JTextField();
      JTextField managersIn = new JTextField();
      JButton send = new JButton("Send");
      JButton clear = new JButton("Clear");
      
      
      employeeFrame.getContentPane().add(backWorkers);
      employeeFrame.getContentPane().add(backWorkersIn);
      employeeFrame.getContentPane().add(frontWorkers);
      employeeFrame.getContentPane().add(frontWorkersIn);
      employeeFrame.getContentPane().add(managerWorks);
      employeeFrame.getContentPane().add(managersIn);
      employeeFrame.getContentPane().add(send);
      employeeFrame.getContentPane().add(clear);
      
      
      clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            backWorkersIn.setText("0");
            frontWorkersIn.setText("0");
            managersIn.setText("0");
            }
            });//adds functionality for clear button
            
      send.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            backHouseWorkers = Integer.parseInt(backWorkersIn.getText());
            frontHouseWorkers = Integer.parseInt(frontWorkersIn.getText());
            managers = Integer.parseInt(managersIn.getText());
            System.out.println(backHouseWorkers);
            System.out.println(frontHouseWorkers);
            System.out.println(managers);
            afterSend();
            employeeFrame.dispose();
            }
            }); //adds functionality for Send button

   }



public static void afterSend(){
      compare = 1;
      JFrame sentFrame = new JFrame(restaurantName);
      sentFrame.setSize(300,250);
      sentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel = new JPanel(new BorderLayout());
      JTextArea output = new JTextArea();  
      JButton send = new JButton("Confirm Data");
      JButton reset = new JButton("Restart");
      send.setSize(100,100);
      reset.setSize(100,100);
      sentFrame.getContentPane().add(panel);
      panel.add(output, BorderLayout.NORTH);
      panel.add(send, BorderLayout.CENTER);
      panel.add(reset, BorderLayout.SOUTH);
      
      
      output.append("\nRevenue for Classic Dogs: $" + entreeOneRevenue(entreeOnePrice, entreeOneSold));
      output.append("\nRevenue for Chicago Dogs: $" + entreeTwoRevenue(entreeTwoPrice, entreeTwoSold));
      output.append("\nRevenue for The Big Dogs: $" + entreeThreeRevenue(entreeThreePrice, entreeThreeSold));
      output.append("\nRevenue for Fries: $" + sideOneRevenue(sideOnePrice, sideOneSold));
      output.append("\nRevenue for Dog Collars: $" + sideTwoRevenue(sideTwoPrice, sideTwoSold));
      output.append("\n\nBack of House Workers total wage: $" + backEmployeeWages(12, backHouseWorkers));
      output.append("\nFront of House Workers total wage: $" + frontEmployeeWages(8, frontHouseWorkers));
      output.append("\nManagers total wage: $" + managerWages(30, managers));
      sentFrame.setVisible(true);
      
         reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               main(null);
               sentFrame.dispose();
         }});
         send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(RestaurantOne.testCompare() == 0) {
                  ChoosingRestaurant.rest1Pass();
               }
               else{
               ChoosingRestaurant.main(null);
               sentFrame.dispose(); }
               }});
   }
   

public static void main(String[] args) { //Main is for the GUI implementation
   JFrame frame = new JFrame(restaurantName); //This is creating the frame and all the buttons that we will later add into the frame
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(650,300);
   frame.setLayout(new GridLayout(6,2));
   JLabel entreeOneLabel = new JLabel(entreeOne + " sold: (enter only whole integers)");
   JTextField entreeOneUnits = new JTextField();
   JLabel entreeTwoLabel = new JLabel(entreeTwo + " sold: (enter only whole integers)");
   JTextField entreeTwoUnits = new JTextField();
   JLabel entreeThreeLabel = new JLabel(entreeThree + " sold: (enter only whole integers)"); 
   JTextField entreeThreeUnits = new JTextField();
   JLabel sideOneLabel = new JLabel(sideOne + " sold: (enter only whole integers)");
   JTextField sideOneUnits = new JTextField();
   JLabel sideTwoLabel = new JLabel(sideTwo + " sold: (enter only whole integers)");
   JTextField sideTwoUnits = new JTextField();
   JButton send = new JButton("Send");
   send.setSize(100,100);
   JButton clear = new JButton("Clear");
   clear.setSize(50,50); 
     
     
      frame.getContentPane().add(entreeOneLabel);
      frame.getContentPane().add(entreeOneUnits);
      frame.getContentPane().add(entreeTwoLabel);
      frame.getContentPane().add(entreeTwoUnits);
      frame.getContentPane().add(entreeThreeLabel);
      frame.getContentPane().add(entreeThreeUnits);
      frame.getContentPane().add(sideOneLabel);
      frame.getContentPane().add(sideOneUnits);
      frame.getContentPane().add(sideTwoLabel); //These create all the button and labels
      frame.getContentPane().add(sideTwoUnits);
      frame.add(send);
      frame.add(clear);
      
      
      clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            entreeOneUnits.setText("0");
            entreeTwoUnits.setText("0");
            entreeThreeUnits.setText("0");
            sideOneUnits.setText("0");
            sideTwoUnits.setText("0");          
            }
            });//adds functionality for clear button
            
      send.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            entreeOneSold = Integer.parseInt(entreeOneUnits.getText());
            entreeTwoSold = Integer.parseInt(entreeTwoUnits.getText());
            entreeThreeSold = Integer.parseInt(entreeThreeUnits.getText());
            sideOneSold = Integer.parseInt(sideOneUnits.getText());
            sideTwoSold = Integer.parseInt(sideTwoUnits.getText());
             System.out.println(entreeOneSold);
             System.out.println(entreeTwoSold);
             System.out.println(entreeThreeSold);
             System.out.println(sideOneSold);
             System.out.println(sideTwoSold);
            employeeScreen();
            frame.dispose();
            }
            }); //adds functionality for Send button
      
      frame.setVisible(true);
}
   /*public static void testingMain() {
   int backHouseWorkers = 0; int frontHouseWorkers = 0; int frontHouseWage = 0; int backHouseWage = 0; int managers = 0; int managerWage = 0;
   String restaurantName = "Senor Sapo's"; String entreeOne = "Cheeseburger"; String entreeTwo = "BBQ Bacon Burger";
   String entreeThree = "The Sapo Special"; String sideOne = "Frog Tails"; String sideTwo = "Roasted Veggies"; 
   int entreeOnePrice = 6; int entreeTwoPrice = 9; int entreeThreePrice = 15; int sideOnePrice = 2; int sideTwoPrice = 5;
   int entreeOneSold = 0; int entreeTwoSold = 0; int entreeThreeSold = 0; int sideOneSold = 0; int sideTwoSold = 0;
   
   int totalBackWage = backEmployeeWages(backHouseWage, backHouseWorkers);
   int totalFrontWage = frontEmployeeWages(frontHouseWage, frontHouseWorkers);
   int totalManagerWage = managerWages(managerWage, managers);
   int totalEntree1Revenue = entreeOneRevenue(entreeOnePrice, entreeOneSold);
   int totalEntree2Revenue = entreeTwoRevenue(entreeTwoPrice, entreeTwoSold);
   int totalEntree3Revenue = entreeThreeRevenue(entreeThreePrice, entreeThreeSold);
   int totalSide1Revenue = sideOneRevenue(sideOnePrice, sideOneSold);
   int totalSide2Revenue = sideTwoRevenue(sideTwoPrice, sideTwoSold);

   
   
   backHouseWorkers = 5;frontHouseWorkers = 2;frontHouseWage = 8;backHouseWage = 10;managers = 2;managerWage = 53; 
   entreeOneSold = 84;entreeTwoSold = 72;entreeThreeSold = 30;sideOneSold = 76;sideTwoSold = 26;
   
   totalBackWage = backEmployeeWages(backHouseWage, backHouseWorkers);
   totalFrontWage = frontEmployeeWages(frontHouseWage, frontHouseWorkers);
   totalManagerWage = managerWages(managerWage, managers);
   totalEntree1Revenue = entreeOneRevenue(entreeOnePrice, entreeOneSold);
   totalEntree2Revenue = entreeTwoRevenue(entreeTwoPrice, entreeTwoSold);
   totalEntree3Revenue = entreeThreeRevenue(entreeThreePrice, entreeThreeSold);
   totalSide1Revenue = sideOneRevenue(sideOnePrice, sideOneSold);
   totalSide2Revenue = sideTwoRevenue(sideTwoPrice, sideTwoSold);
   
   System.out.println("Back of House Wages: $" + totalBackWage +" Front of House Wages: $" + totalFrontWage + " Manager Wages: $" + totalManagerWage
                       + "\nEntree One Revenue: $" + totalEntree1Revenue + " Entree Two Revenue: $" + totalEntree2Revenue + " Entree Three Revenue: $"
                       + totalEntree3Revenue + "\nSide One Revenue: $" + totalSide1Revenue + " Side Two Revenue: $" + totalSide2Revenue);
   int totalRevenue = (totalEntree1Revenue + totalEntree2Revenue + totalEntree3Revenue + totalSide1Revenue + totalSide2Revenue) -
                      (totalBackWage + totalFrontWage + totalManagerWage);
   System.out.println("Total Revenue: $" + totalRevenue);
   //Testing of the methods 
   
   
   backHouseWorkers = 8;frontHouseWorkers = 4;frontHouseWage = 10;backHouseWage = 15;managers = 1;managerWage = 50; 
   entreeOneSold = 111;entreeTwoSold = 48;entreeThreeSold = 67;sideOneSold = 76;sideTwoSold = 88;

   totalBackWage = backEmployeeWages(backHouseWage, backHouseWorkers);
   totalFrontWage = frontEmployeeWages(frontHouseWage, frontHouseWorkers);
   totalManagerWage = managerWages(managerWage, managers);
   totalEntree1Revenue = entreeOneRevenue(entreeOnePrice, entreeOneSold);
   totalEntree2Revenue = entreeTwoRevenue(entreeTwoPrice, entreeTwoSold);
   totalEntree3Revenue = entreeThreeRevenue(entreeThreePrice, entreeThreeSold);
   totalSide1Revenue = sideOneRevenue(sideOnePrice, sideOneSold);
   totalSide2Revenue = sideTwoRevenue(sideTwoPrice, sideTwoSold);
   
   System.out.println("\nBack of House Wages: $" + totalBackWage +" Front of House Wages: $" + totalFrontWage + " Manager Wages: $" + totalManagerWage
                       + "\nEntree One Revenue: $" + totalEntree1Revenue + " Entree Two Revenue: $" + totalEntree2Revenue + " Entree Three Revenue: $"
                       + totalEntree3Revenue + "\nSide One Revenue: $" + totalSide1Revenue + " Side Two Revenue: $" + totalSide2Revenue);
   totalRevenue = (totalEntree1Revenue + totalEntree2Revenue + totalEntree3Revenue + totalSide1Revenue + totalSide2Revenue) -
                      (totalBackWage + totalFrontWage + totalManagerWage);
   System.out.println("Total Revenue: $" + totalRevenue);
   


   }*/
 

}