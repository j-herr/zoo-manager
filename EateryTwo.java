import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EateryTwo { 
   
   public static ArrayList<EateryTwo> menu = new ArrayList<EateryTwo>();
   public static String restName = "Senor Sapo's";
   private int unitPrice; private int unitsSold; private String unitName;
   
   public EateryTwo(String unitName) { this.setUnitName(unitName); menu.add(this); }
   public EateryTwo(int unitPrice, int unitsSold, String unitName) {
      this.setUnitPrice(unitPrice);
      this.setUnitsSold(unitsSold);
      this.setUnitName(unitName);
      menu.add(this); 
      }
      
   public int calcRevenue() { return this.unitPrice * this.unitsSold; }
   
   public void setUnitName(String unitName) { this.unitName = unitName; }
   public void setUnitPrice(int unitPrice) { this.unitPrice = unitPrice; }
   public void setUnitsSold(int unitsSold) { this.unitsSold = unitsSold; }  
   
   public int getUnitPrice() { return this.unitPrice; }
   public int getUnitsSold() { return this.unitsSold; }
   public String getUnitName() { return this.unitName; }
  

   public void editItem() {
      int tempPrice;
      int tempAmount;
      
      JFrame frame = new JFrame();
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(200,200);
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      
      
      JLabel header = new JLabel(this.getUnitName());
      header.setFont(new Font("Serif", Font.BOLD, 20));   
      JLabel enterAmountLabel = new JLabel("Enter amount of item sold: ");
      JLabel enterPriceLabel = new JLabel("Enter price of item: ");     
      JTextField enterAmountField = new JTextField(10);
      JTextField enterPriceField = new JTextField(10);
      JButton confirm = new JButton("Confirm");
      JButton reset = new JButton("Reset");
   
      panel.add(header);
      panel.add(enterAmountLabel);
      panel.add(enterAmountField);
      panel.add(enterPriceLabel);
      panel.add(enterPriceField);
      panel.add(confirm);
      panel.add(reset);  
      
      confirm.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            setUnitPrice(Integer.parseInt(enterPriceField.getText()));
            setUnitsSold(Integer.parseInt(enterAmountField.getText()));
            main(null);
            frame.dispose();
         }});
      reset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         enterAmountField.setText("0");
         enterPriceField.setText("0");
         }});
      
      
      
      
      frame.add(panel);
      frame.setVisible(true);
   }

  
  public static void afterFinish() {
      
      
      JFrame frame = new JFrame();
      //frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(250,500);
      frame.setLayout(new BorderLayout());
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      JTextArea output = new JTextArea();
      JButton confirm = new JButton("Confirm");
      JPanel panel2 = new JPanel();
      
      output.append(" -Revenue for each menu item-");
      for(EateryTwo x : menu) {
         output.append(x.toString());
         System.out.print("\n"); 
        }
      
      
      confirm.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ChoosingRestaurant.main(null);
            frame.dispose();
            }}); 
      
      panel.add(output);
      panel2.add(confirm);
      frame.add(panel);
      frame.add(panel2, BorderLayout.SOUTH);
      frame.setVisible(true);
 } 
  

   @Override
   public String toString() { return "\n" + "\n Item: " + this.getUnitName() + "\n Units sold: " + this.getUnitsSold() + 
                                     "\n Item Price: " + this.getUnitPrice() + "\n Revenue for item: " + this.calcRevenue();
                            }

public static void main(String[] args) {
   EateryTwo entreeOne = new EateryTwo("Cheeseburger");
   EateryTwo entreeTwo = new EateryTwo("Bacon BBQ Burger");
   EateryTwo entreeThree = new EateryTwo("The Sapo Special");
   EateryTwo sideOne = new EateryTwo("Frog Tails");
   EateryTwo sideTwo = new EateryTwo("Roast Veggies");
   
   JFrame frame = new JFrame();
   frame.setLocationRelativeTo(null);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(150,250);
   JPanel panel = new JPanel();
   panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      
   JLabel choice = new JLabel("Select an item to edit"); 
   JButton entOneButton = new JButton(entreeOne.getUnitName());   
   JButton entTwoButton = new JButton(entreeTwo.getUnitName());
   JButton entThreeButton = new JButton(entreeThree.getUnitName());
   JButton sideOneButton = new JButton(sideOne.getUnitName());
   JButton sideTwoButton = new JButton(sideTwo.getUnitName());
   JButton finish = new JButton("Finish");
   
   panel.add(choice);
   panel.add(entOneButton);
   panel.add(entTwoButton);
   panel.add(entThreeButton);
   panel.add(sideOneButton);
   panel.add(sideTwoButton);
   panel.add(finish);
   
   entOneButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      entreeOne.editItem();
      frame.dispose();
      }});

   
   entTwoButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      entreeTwo.editItem();
      frame.dispose();
      }});

   
   entThreeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      entreeThree.editItem();
      frame.dispose();
      }});

   
   sideOneButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      sideOne.editItem();
      frame.dispose();
      }});

   
   sideTwoButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      sideTwo.editItem();
      frame.dispose();
      }});
   
   finish.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      afterFinish();
      frame.dispose();
      }});
   
   
   
   
   
   
   frame.add(panel);
   frame.setVisible(true);
   
   
   }
}