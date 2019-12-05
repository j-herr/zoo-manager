import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicketMachine {
   static int compare = 0;
   public static int testCompare() { 
      return compare; }
   
   static int numTickets = 0;static int totalNumTickets = 0;static int numAdults = 0;
   static int numChildren = 0;static int numSeniors = 0;static int totalTicketRevenue = 0;
   static int adultPrice = 15;static int childPrice = 5;static int seniorPrice = 10; 
   static int totalAdult = 0;static int totalChildren = 0;static int totalSenior = 0;
   
   public static int adultSold(int numAdults, int adultPrice) { 
      return numAdults * adultPrice; } 
   public static int childrenSold(int numChildren, int childPrice) { 
      return numChildren * childPrice; } //These methods return the total revenue gained from tickets for each category 
   public static int seniorSold(int numSeniors, int seniorPrice) { 
      return numSeniors * seniorPrice; }
   
   //public static int totalRevenue(int totalAdult, int totalChildren, int totalSenior) { 
    //  return totalAdult + totalChildren + totalSenior; } //Returns total revenue for all ticket sales
   
   public static int getChild() { return totalChildren; }
   public static int getAdult() { return totalAdult; }
   public static int getSenior() { return totalSenior; }
   
   
   
   
   public static void afterSend() {
           totalChildren = childrenSold(numChildren, childPrice);
           totalAdult = adultSold(numAdults, adultPrice);
           totalSenior = seniorSold(numSeniors, seniorPrice);
           
      JFrame sentFrame = new JFrame("GMU Zoo");
      sentFrame.setLocationRelativeTo(null);
      sentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      sentFrame.setSize(300,250);
      JPanel panel = new JPanel(new BorderLayout());
      sentFrame.getContentPane().add(panel);
      JTextArea output = new JTextArea();
      panel.add(output, BorderLayout.NORTH);
      JButton confirm = new JButton("Confirm Data");
      JButton reset = new JButton("Reset Module");
      panel.add(confirm, BorderLayout.CENTER);
      panel.add(reset, BorderLayout.SOUTH);
      
      output.append("Amount of Children Tickets sold: " + numChildren);
      output.append("\n     Children Ticket Revenue: $" + childrenSold(numChildren, childPrice));
      output.append("\n\nAmount of Adult Tickets sold: " + numAdults);
      output.append("\n     Adult Ticket Revenue: $" + adultSold(numAdults, adultPrice));
      output.append("\n\nAmount of Senior Tickets sold: " + numSeniors);
      output.append("\n     Senior Ticket Revenue: $" + seniorSold(numSeniors, seniorPrice));
      output.append("\n\n");
      sentFrame.setVisible(true);
      
      confirm.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               compare = 1;
               ZooUI.main(null);
               sentFrame.dispose();
            }});
      reset.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               main(null); 
               sentFrame.dispose();
            }});
   }
   
   public static void main(String[] args) {
      JFrame frame = new JFrame("GMU Zoo");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(700,300);
      frame.setLayout(new GridLayout(4,2));
      /*JPanel panel = new JPanel(new BorderLayout());
      panel.setSize(600,200);*/
      //frame.getContentPane().add(panel);
      JLabel childLabel = new JLabel("Amount of Child tickets sold ($5 per)");
      frame.add(childLabel);
      JTextField childField = new JTextField();
      frame.add(childField);
      JLabel adultLabel = new JLabel("Amount of Adult tickets sold ($15 per)");
      frame.add(adultLabel);
      JTextField adultField = new JTextField();
      frame.add(adultField);
      JLabel seniorLabel = new JLabel("Amount of Senior tickets sold ($10 per)");
      frame.add(seniorLabel);
      JTextField seniorField = new JTextField();
      frame.add(seniorField);
      JButton confirm = new JButton("Confirm Sales");
      frame.add(confirm);
      JButton reset = new JButton ("Reset"); 
      frame.add(reset);
      
      frame.setVisible(true);
      
      confirm.addActionListener(
         new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
               numAdults = Integer.parseInt(adultField.getText());
               numChildren = Integer.parseInt(childField.getText());
               numSeniors = Integer.parseInt(seniorField.getText());
               afterSend();
               frame.dispose();
            }});
      reset.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               childField.setText("0");
               adultField.setText("0");
               seniorField.setText("0");
            }});
      
      
   }
}