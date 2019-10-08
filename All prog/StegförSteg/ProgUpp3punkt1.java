import javax.swing.*;

public class ProgUpp3punkt1 {
  public static void main (String[] arg) {
    
    
    String s = JOptionPane.showInputDialog("Radien?");
    
    double radie = Double.parseDouble(s);
    
    
    JOptionPane.showMessageDialog(null, 4 * Math.PI * radie * radie * radie / 3);
    
    JOptionPane.showMessageDialog(null, 4 * Math.PI * radie * radie);
 
  }
}