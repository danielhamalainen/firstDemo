import javax.swing.*;

public class Fem7 { 
  public static void main (String[] arg) {
    
    String tabell = "";
    int startValue = -11;
    int counter = 0;
    
    for (int i = 1; i <= 21; i++) {
      startValue = startValue + 1;
      counter = 2 * startValue * startValue - 5 * startValue + 1;
      tabell = tabell + " " + counter + "\n";
    }
    
    JOptionPane.showMessageDialog(null, tabell);
      
  }
}