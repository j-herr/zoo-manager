import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeScreen extends JFrame{
   
  public static void main(String[] args) {
   JFrame frame = new JFrame("Welcome!");
   frame.setLayout(new BorderLayout());
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(600,450);
   ImageIcon bg = new ImageIcon("ZooImage.jpg"); 
   
   JLabel background = new JLabel("",bg,JLabel.CENTER);
   frame.add(background);
   
   JButton enter = new JButton("Enter End of Day Report System");
   JPanel panel = new JPanel();
   panel.setLayout(new FlowLayout(FlowLayout.CENTER));
   panel.add(enter);
   frame.add(panel, BorderLayout.SOUTH);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   
   enter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         ZooUI.main(null);
         frame.dispose();
         }});
}
}