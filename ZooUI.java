import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ZooUI extends JFrame{
            
    
   
      
   public static void main(String[] args) {
      JFrame frame = new JFrame("Enter Zoo name here"); //This is creating the frame and all the buttons that we will later add into the frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300,300);
      JButton restaurantButton = new JButton("Restaurant Module");
      JButton ticketButton = new JButton("Ticket Module");
      JButton animalButton = new JButton("Animal Module");
      JButton reportButton = new JButton("Daily Reports"); 
      frame.setLayout(new GridLayout(2,2));
      
      frame.getContentPane().add(restaurantButton); //this adds the button to the frame
      frame.getContentPane().add(ticketButton);
      frame.getContentPane().add(animalButton);
      frame.getContentPane().add(reportButton);
      frame.setVisible(true);  
   
      ticketButton.addActionListener(new ActionListener() { //This section adds actions to the buttons
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the ticket module.");
            }
            });
      restaurantButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the restaurant module.");
            }
            });
      reportButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the report generating module.");
            }
            });
      animalButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the animal module.");
            }
            });

  
   
   }
}
   
   

