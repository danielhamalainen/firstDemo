import javax.swing.*;

public class Fem8 { 
  public static void main (String[] arg) {
    
    String tabell = "";
    double startValue = -1;
    double counter = 0;
    
    for (double i = startValue; i <= 1; i = i + 0.1) {
      startValue = startValue + i;
      counter = 2 * startValue * startValue - 5 * startValue + 1;
      tabell = tabell + " " + counter + "\n";
    }
    
    JOptionPane.showMessageDialog(null, tabell);
      
  }
}