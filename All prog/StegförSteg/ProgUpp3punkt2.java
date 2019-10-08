import javax.swing.*;

public class ProgUpp3punkt2 {
  public static void main (String[] arg) {
    
    
    String s = JOptionPane.showInputDialog("Grader i Fahrenheit");
    
    double fahren = Double.parseDouble(s);
    
    double celsius = (fahren - 32) * 5/9;
    
    
    JOptionPane.showMessageDialog(null, celsius);
 
  }
}