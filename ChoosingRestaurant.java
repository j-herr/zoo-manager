import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChoosingRestaurant {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Choose Which Restaurant");
      frame.setLocationRelativeTo(null);
      frame.setSize(200,200);
      frame.setLayout(new GridLayout(2,1));
      JButton rest1 = new JButton(RestaurantOne.getName());
      JButton rest2 = new JButton(RestaurantTwo.getName());
      
      frame.getContentPane().add(rest1);
      frame.getContentPane().add(rest2);
      frame.setVisible(true);
      
      rest1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            RestaurantOne.main(null);
            frame.dispose();
            }});
      rest2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            RestaurantTwo.main(null);
            frame.dispose();
            }});
   }
   
   public static void rest1Pass() {
      RestaurantOne.main(null);
   }
   public static void rest2Pass() {
      RestaurantTwo.main(null);
   }
   }