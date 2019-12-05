import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReportingModule extends JFrame {

   JTable table;
   
   public ReportingModule() { 
      setLayout (new FlowLayout()); 
      String[] columnNames = { "Module" , "Object" , "Cost/Revenue" };
      
      Object[][] data = {
            {"The Dog Pound", "Classic", RestaurantOne.getEntOne()},
            {"The Dog Pound", "Chicago", RestaurantOne.getEntTwo()},
            {"The Dog Pound", "Big Dog", RestaurantOne.getEntThree()},
            {"The Dog Pound", "Fries", RestaurantOne.getSideOne()},
            {"The Dog Pound", "DogCollars", RestaurantOne.getSideTwo()},
            {"The Dog Pound", "Front House Wages", RestaurantOne.getFrontWage()},
            {"The Dog Pound", "Back House Wages", RestaurantOne.getBackWage()},
            {"The Dog Pound", "Manager Wages", RestaurantOne.getManagerWage()},
            {"Senor Sapo", "Cheeseburger", RestaurantTwo.getEntOne()},
            {"Senor Sapo", "BBQ Bacon Burger", RestaurantTwo.getEntTwo()},
            {"Senor Sapo", "Sapo Special", RestaurantTwo.getEntThree()},
            {"Senor Sapo", "Frog Tails", RestaurantTwo.getSideOne()},
            {"Senor Sapo", "Raosted Veggies", RestaurantTwo.getSideTwo()},
            {"Senor Sapo", "Front House Wages", RestaurantTwo.getFrontWage()},
            {"Senor Sapo", "Back House Wages", RestaurantTwo.getBackWage()},
            {"Senor Sapo", "Manager Wages", RestaurantTwo.getManagerWage()},
            {"Animal", "Tiger", Animal.getTiger()},
            {"Animal", "Panda", Animal.getPanda()},
            {"Animal", "Giraffe", Animal.getGiraffe()},
            {"Animal", "Elephant", Animal.getElephant()},
            {"Animal", "Hippo", Animal.getHippo()},
            {"Animal", "Alligator", Animal.getAlligator()},
            {"Animal", "Lion", Animal.getLion()},
            {"Animal", "Bear", Animal.getBear()},
            {"Animal", "Seal", Animal.getSeal()},
            {"Animal", "Gorilla", Animal.getGorilla()},
            {"Animal", "Lizard", Animal.getLizard()},
            {"Animal", "Lemur", Animal.getLemur()},
            {"Animal", "Zookeeper's Wages", Animal.getKeeper()},
            {"Ticket", "Children Tickets", TicketMachine.getChild()},
            {"Ticket", "Adult Tickets", TicketMachine.getAdult()},
            {"Ticket", "Senior Tickets", TicketMachine.getSenior()},
      };
   
         table = new JTable(data, columnNames); 
         table.setPreferredScrollableViewportSize(new Dimension(500,530));
         table.setFillsViewportHeight(true);
         
         JScrollPane scrollPane = new JScrollPane(table);
         add(scrollPane);
   
   
   }
   
   public static void main(String[] args) {
      ReportingModule gui  = new ReportingModule();
      gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gui.setSize(600,600);
      gui.setVisible(true);
      gui.setTitle("Zoo Daily Report");
      gui.setLocationRelativeTo(null);
      
      JFrame frame = new JFrame();
      frame.setSize(300,80);
      frame.setLayout(new BorderLayout());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      
      JButton print = new JButton("Print Report");
      JButton exit  = new JButton("Exit Program");
      panel.add(print);
      panel.add(exit);
      frame.add(panel,BorderLayout.SOUTH);
   
      frame.setVisible(true);
      
      print.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            }});
      exit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            gui.dispose();
            frame.dispose();
            }});
   
   
   }











}