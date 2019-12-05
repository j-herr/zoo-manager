import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Animal {
   static int compare = 0;
   public static int testCompare() { return compare; }
   
   static int numTigers; static int numPandas;static int numGiraffe;static int numElephants;
   static int numHippos; static int numAligators;static int numLions;static int numBears;
   static int numSeals;static int numGorillas;static int numLizards;static int numLemurs;

   static int tigerCost;static int pandaCost;static int giraffeCost;static int elephantCost;
   static int hippoCost;static int alligatorCost;static int lionCost;static int bearCost;
   static int sealCost;static int gorillaCost;static int lizardCost;static int lemurCost;
   
   static int numZookeepers;
   static int totalKeeperPay;
   
   public static int foodCost(int priceLb,int meals, int numAnimal) { return (priceLb * meals) * numAnimal; }
   public static int keeperPay(int numZookeepers) { return (13  * numZookeepers) * 6; } 
   
   //All Variables needed for class
   
   public static int getTiger() { return tigerCost; }
   public static int getPanda() { return pandaCost; }
   public static int getGiraffe() { return giraffeCost; }
   public static int getElephant() { return elephantCost; }
   public static int getHippo() { return hippoCost; }
   public static int getAlligator() { return alligatorCost; }
   public static int getLion() { return lionCost; }
   public static int getBear() { return bearCost; }
   public static int getSeal() { return sealCost; }
   public static int getGorilla() { return gorillaCost; }
   public static int getLizard() { return lizardCost; }
   public static int getLemur() { return lemurCost; }
   public static int getKeeper() {return totalKeeperPay; }
   
   
   
   public static void keeperScreen() { 
      JFrame frame = new JFrame("Animal Module");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(200,200);
      frame.setLayout(new GridLayout(2,2));
      JButton next = new JButton("Next");
      JButton clear = new JButton("Clear");
      JLabel keepLabel = new JLabel("<html> Total <br/> number of <br/> zookeepers</html>");
      JTextField keepField = new JTextField();
      
      frame.getContentPane().add(keepLabel);
      frame.getContentPane().add(keepField);
      frame.getContentPane().add(next);
      frame.getContentPane().add(clear);                                   //This is for the screen involving the zookeeper method
   
      frame.setVisible(true);
      next.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) { 
            totalKeeperPay = keeperPay(Integer.parseInt(keepField.getText()));
               numZookeepers = Integer.parseInt(keepField.getText());
            compare = 1;
            displayAnimal();
            frame.dispose();
            }});
       clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            keepField.setText("0");
            }});
   
   }         
   
   
   public static void displayAnimal() {
      JFrame frame = new JFrame("Animal Module Report");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(450,315);
      JPanel panel = new JPanel(new BorderLayout());
      JTextArea output = new JTextArea();
      JButton confirm = new JButton("Confirm Data");
      JButton reset = new JButton("Restart Module");
      
      frame.getContentPane().add(panel);
      panel.add(output,  BorderLayout.NORTH);
      panel.add(confirm, BorderLayout.CENTER);
      panel.add(reset, BorderLayout.SOUTH);
   
      output.append("Tiger food cost: $" + tigerCost + ", " + numTigers + " tigers, at $10 per lb, and 3 meals a day");
      output.append("\nPanda food cost: $" + pandaCost + ", " + numPandas + " pandas, at $6 per lb, and 6 meals a day");
      output.append("\nGiraffe food cost: $" + giraffeCost + ", " + numGiraffe + " giraffes, at $2 per lb, and 10 meals a day");
      output.append("\nElephant food cost: $" + elephantCost + ", " + numElephants + " elephants, at $9 per lb, and 3 meals a day");
      output.append("\nHippo food cost: $" + hippoCost + ", " + numHippos + " hippos, at $11 per lb, and 4 meals a day");
      output.append("\nAlligator food cost: $" + alligatorCost + ", " + numAligators + " alligators, at $3 per lb, and 3 meals a day");
      output.append("\nLion food cost: $" + lionCost + ", " + numLions + " lions, at $15 per lb, and 4 meals a day");
      output.append("\nBear food cost: $" + bearCost + ", " + numBears + " bears, at $5 per lb, and 7 meals a day");
      output.append("\nSeal food cost: $" + sealCost + ", " + numSeals + " seals, at $4 per lb, and 4 meals a day");
      output.append("\nGorilla food cost: $" + gorillaCost + ", " + numGorillas + " gorillas, at $3 per lb, and 6 meals a day");
      output.append("\nLizard food cost: $" + lizardCost + ", " +  numLizards + " lizards, at $1 per lb, and 9 meals a day");
      output.append("\nLemur food cost: $" + lemurCost + ", " + numLemurs + " lemurs, at $2 per lb, and 3 meals a day");
      output.append("\n\n Zookeeper cost: $" + totalKeeperPay + ", " + numZookeepers + " zookeeprs, who get paid $13/hour for 6 hrs/day");
   
      frame.setVisible(true);
      
      confirm.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
          compare = 1;
          ZooUI.main(null);
          frame.dispose();   
          }});
      reset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            main(null);
            frame.dispose();
            }});
      
   }
   
   
   
   
   public static void main(String[] args) {
      JFrame frame = new JFrame("Animal Module");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(200,300);
      frame.setLayout(new GridLayout(5,2));
      JFrame frameTwo = new JFrame("Animal Module");
      frameTwo.setLocationRelativeTo(null);
      frameTwo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frameTwo.setSize(200,300);
      frameTwo.setLayout(new GridLayout(5,2));
      JFrame frameThree = new JFrame("Animal Module");
      frameThree.setLocationRelativeTo(null);
      frameThree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frameThree.setSize(200,300);
      frameThree.setLayout(new GridLayout(5,2));
      
      
      JLabel tigers = new JLabel(" Tigers");
      JLabel pandas = new JLabel(" Pandas");
      JLabel giraffes = new JLabel(" Giraffes");
      JLabel elephants = new JLabel(" Elephants"); 
      JLabel hippos = new JLabel(" Hippos");
      JLabel alligators = new JLabel(" Alligators"); 
      JLabel lions = new JLabel(" Lions");
      JLabel bears = new JLabel(" Bears");
      JLabel seals = new JLabel(" Seals");
      JLabel gorillas = new JLabel(" Gorillas");
      JLabel lizards  = new JLabel(" Lizards");
      JLabel lemurs = new JLabel(" Lemurs");
      JLabel zookeepers = new JLabel(" Zookeepers"); 
      JButton next = new JButton("Next");
      JButton clear = new JButton("Clear");
      JButton next2 = new JButton("Next");
      JButton clear2 = new JButton("Clear");
      JButton next3 = new JButton("Next");
      JButton clear3 = new JButton("Clear");
      
      JTextField tigerNum = new JTextField();
      JTextField pandaNum = new JTextField();
      JTextField giraffeNum = new JTextField();
      JTextField elephantNum = new JTextField();
      JTextField hippoNum = new JTextField();
      JTextField alligatorNum = new JTextField();
      JTextField lionNum = new JTextField();
      JTextField bearNum = new JTextField();
      JTextField sealNum = new JTextField();
      JTextField gorillaNum = new JTextField();
      JTextField lizardNum= new JTextField();
      JTextField lemurNum= new JTextField();
      
      frame.getContentPane().add(tigers); 
         frame.getContentPane().add(tigerNum);  
      frame.getContentPane().add(pandas);
         frame.getContentPane().add(pandaNum);
      frame.getContentPane().add(giraffes);
         frame.getContentPane().add(giraffeNum);
      frame.getContentPane().add(elephants);
         frame.getContentPane().add(elephantNum); //First 4 populate the first frame
      frame.getContentPane().add(next);
      frame.getContentPane().add(clear);
      
      frameTwo.getContentPane().add(hippos);
         frameTwo.getContentPane().add(hippoNum);
      frameTwo.getContentPane().add(alligators);
         frameTwo.getContentPane().add(alligatorNum);
      frameTwo.getContentPane().add(lions);
         frameTwo.getContentPane().add(lionNum);
      frameTwo.getContentPane().add(bears);
         frameTwo.getContentPane().add(bearNum);
      frameTwo.getContentPane().add(next2);
      frameTwo.getContentPane().add(clear2);
      
      frameThree.getContentPane().add(seals);
         frameThree.getContentPane().add(sealNum);      
      frameThree.getContentPane().add(gorillas);
         frameThree.getContentPane().add(gorillaNum);
      frameThree.getContentPane().add(lizards);
         frameThree.getContentPane().add(lizardNum);
      frameThree.getContentPane().add(lemurs);
         frameThree.getContentPane().add(lemurNum);      
      frameThree.getContentPane().add(next3);
      frameThree.getContentPane().add(clear3);
      
      frame.setVisible(true);
      
      
      next.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
               tigerCost = foodCost(10,3,Integer.parseInt(tigerNum.getText()));
                  numTigers = Integer.parseInt(tigerNum.getText());
               pandaCost = foodCost(6,6,Integer.parseInt(pandaNum.getText()));
                  numPandas = Integer.parseInt(pandaNum.getText());
               giraffeCost = foodCost(2,10,Integer.parseInt(giraffeNum.getText()));
                  numGiraffe = Integer.parseInt(giraffeNum.getText());
               elephantCost = foodCost(9,3,Integer.parseInt(elephantNum.getText())); 
                  numElephants = Integer.parseInt(elephantNum.getText());
               
               frameTwo.setVisible(true);
               frame.dispose();      
         }});
         next2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
               hippoCost = foodCost(11,4,Integer.parseInt(hippoNum.getText()));
                  numHippos = Integer.parseInt(hippoNum.getText());
               alligatorCost = foodCost(3,3,Integer.parseInt(alligatorNum.getText()));
                  numAligators = Integer.parseInt(alligatorNum.getText());
               lionCost = foodCost(15,4,Integer.parseInt(lionNum.getText()));
                  numLions = Integer.parseInt(lionNum.getText());
               bearCost = foodCost(5,7,Integer.parseInt(bearNum.getText())); 
                  numBears = Integer.parseInt(bearNum.getText());
               
               frameThree.setVisible(true);
               frameTwo.dispose();      
         }});
         next3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
               sealCost = foodCost(2,4,Integer.parseInt(sealNum.getText()));
                  numSeals = Integer.parseInt(sealNum.getText()) ;
               gorillaCost = foodCost(3,6,Integer.parseInt(gorillaNum.getText()));
                  numGorillas = Integer.parseInt(gorillaNum.getText());
               lizardCost = foodCost(1,9,Integer.parseInt(lizardNum.getText()));
                  numLizards = Integer.parseInt(lizardNum.getText());
               lemurCost = foodCost(2,3,Integer.parseInt(lemurNum.getText())); 
                  numLemurs = Integer.parseInt(lemurNum.getText());
               
               keeperScreen();
               frameThree.dispose();      
         }});
   
         clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tigerNum.setText("0");
               pandaNum.setText("0");
               giraffeNum.setText("0");
               elephantNum.setText("0");
            }});
         clear2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               hippoNum.setText("0");
               alligatorNum.setText("0");
               lionNum.setText("0");
               bearNum.setText("0");
            }});
          clear3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               sealNum.setText("0");
               gorillaNum.setText("0");
               lizardNum.setText("0");
               lemurNum.setText("0");
            }});
   
   }






}