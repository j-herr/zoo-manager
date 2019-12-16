import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChoosingRestaurant {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Choose Which Restaurant");
      frame.setLocationRelativeTo(null);
      frame.setSize(100,150);
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER));
      JButton rest1 = new JButton("Hot Dog Pound");
      JButton rest2 = new JButton("Senor Sapo's");
      JButton done = new JButton("Done");
      
      panel.add(rest1);
      panel.add(rest2);
      panel.add(done);
      frame.add(panel);
      frame.setVisible(true);
      
      rest1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            EateryOne.main(null);
            frame.dispose();
            }});
      rest2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            EateryTwo.main(null);
            frame.dispose();
            }});
      done.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ZooGui.main(null);
            frame.dispose();
            }}); 
  
   }
   
   
   
   }
