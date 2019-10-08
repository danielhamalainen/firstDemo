import javax.swing.*;

public class Tre4 {
  public static void main (String[] arg) {
    
    
    String minuter = JOptionPane.showInputDialog("Minuter/månad?");
    String kr = JOptionPane.showInputDialog("Kr/minut?");
    
    double minut = Double.parseDouble(minuter);
    double kronor = Double.parseDouble(kr);
    
    double sum = minut * kronor;
    
    JOptionPane.showMessageDialog(null, "Mobilen kostar dig " + sum + " kr/månad");
  }
}