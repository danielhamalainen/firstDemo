import javax.swing.*;

public class ProgUpp4punkt2 {
  public static void main (String[] arg) {
    
    
    String s = JOptionPane.showInputDialog("Radien?");
    
    double r = Double.parseDouble(s);
    
    if(r > 0) {
      double omkr = 2 * 3.1415926536 * r;
      double area = 3.1415926536 * r * r;
      JOptionPane.showMessageDialog(null, 
                "Omkrets: " + omkr + "\nArea: " + area);
    }
    else {
      JOptionPane.showMessageDialog(null, "Gör om gör rätt!");
    }
    
    
    
  }
}