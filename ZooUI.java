import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ZooUI extends JFrame{
            
    
   
      
   public static void main(String[] args) {
      JFrame frame = new JFrame("GMU Zoo"); //This is creating the frame and all the buttons that we will later add into the frame
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300,300);
      JButton restaurantButton = new JButton("Restaurant Module");
      JButton ticketButton = new JButton("Ticket Module");
      JButton animalButton = new JButton("Animal Module");
      JButton reportButton = new JButton("Daily Reports"); 
      JButton giftShopButton = new JButton("Gift Shop Module");
      frame.setLayout(new GridLayout(5,1));
      
      frame.getContentPane().add(restaurantButton); //this adds the button to the frame
         if(RestaurantOne.testCompare() == 1 && RestaurantTwo.testCompare() == 1) { restaurantButton.setVisible(false); } // Hides the button if module is complete
      frame.getContentPane().add(ticketButton);
         if(TicketMachine.testCompare() == 1) { ticketButton.setVisible(false); } // Hides the button if module is complete
      frame.getContentPane().add(animalButton);
         if(Animal.testCompare() == 1) { animalButton.setVisible(false); } //Hides when module is complete
      frame.getContentPane().add(giftShopButton);
      frame.getContentPane().add(reportButton);
      frame.setVisible(true);  
   
      ticketButton.addActionListener(new ActionListener() { //This section adds actions to the buttons
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the ticket module.");
            TicketMachine.main(null);
            frame.dispose();
            }
            });
      restaurantButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the restaurant module.");
            ChoosingRestaurant.main(null);
            frame.dispose();
            }
            });
      reportButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the report generating module.");
            ReportingModule.main(null);
            frame.dispose();
            }
            });
      animalButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("You are now in the animal module.");
            Animal.main(null);
            frame.dispose();
            }
            });

  
   
   }
}
   
   
