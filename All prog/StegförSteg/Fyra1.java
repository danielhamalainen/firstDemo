import javax.swing.*;

public class Fyra1 {
  public static void main (String[] arg) {
    
    
    String minuter = JOptionPane.showInputDialog("Minuter/månad?");
    String kr = JOptionPane.showInputDialog("Kr/minut?");
    
    double minut = Double.parseDouble(minuter);
    double kronor = Double.parseDouble(kr);
    
    double sum = minut * kronor;
    double nyaSum;
    
    if(sum >= 1000) {
      nyaSum = sum * 0.1;
      sum = sum - nyaSum;
    }
    
    
    JOptionPane.showMessageDialog(null, "Mobilen kostar dig " + sum + " kr/månad");
  }
}