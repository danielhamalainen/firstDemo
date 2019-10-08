import javax.swing.*;

public class Fyra5 {
  public static void main (String[] arg) {
    
    String min = JOptionPane.showInputDialog(null, "Hur många minuter var samtalet?");
    double minutes = Double.parseDouble(min);
    
    double dag = JOptionPane.showConfirmDialog(null, "Ägde det rum under dagtid?");
    
    if(dag == 0) {
      JOptionPane.showMessageDialog(null, "Kostnaden för ditt samtal är: " + 2.50 * minutes + 0.60 + " kr!");
    }
    else if(dag == 1) {
      JOptionPane.showMessageDialog(null, "Kostnaden för ditt samtal är: " + 0.55 * minutes + 0.60 + " kr!");
    }
    else {
      JOptionPane.showMessageDialog(null, "Beräkningen avbruten!");
      System.exit(0);
    }
    
    
        
  }
}