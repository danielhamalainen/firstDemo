import javax.swing.*;

public class Tre8 {
  public static void main(String[] args) {
  
    String a, b, c, d, e, f, g;
    double maxtemp;
    double temp;
    
    a = JOptionPane.showInputDialog("Måndag?");
      temp = Double.parseDouble(a);
      maxtemp = temp;
    
    b = JOptionPane.showInputDialog("Tisdag?");
      temp = Double.parseDouble(b);
      maxtemp = Math.max(maxtemp, temp);
    
    c = JOptionPane.showInputDialog("Onsdag?");
      temp = Double.parseDouble(c);
      maxtemp = Math.max(maxtemp, temp);
    
    d = JOptionPane.showInputDialog("Torsdag?");
      temp = Double.parseDouble(d);
      maxtemp = Math.max(maxtemp, temp);
    
    e = JOptionPane.showInputDialog("Fredag?");
      temp = Double.parseDouble(e);
      maxtemp = Math.max(maxtemp, temp);
    
    f = JOptionPane.showInputDialog("Lördag?");
      temp = Double.parseDouble(f);
      maxtemp = Math.max(maxtemp, temp);
    
    g = JOptionPane.showInputDialog("Söndag?");
      temp = Double.parseDouble(g);
      maxtemp = Math.max(maxtemp, temp);
    
    JOptionPane.showMessageDialog(null, "Maxtemperaturen denna veckan var: " + maxtemp + " grader!");
    
    
    
    
    
    
  
  
  
  
  }
}
 
  