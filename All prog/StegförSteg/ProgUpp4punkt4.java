import javax.swing.*;

public class ProgUpp4punkt4 {
  public static void main (String[] arg) {
    
    
    String sex = JOptionPane.showInputDialog(null, "Är du kille eller tjej?");
    
    String s = JOptionPane.showInputDialog(null, "Skriv ditt personnummer såhär: ååmmddxxxx");
    String number = s.substring(8, 9);
    int nr = Integer.parseInt(number);
  
    if(sex.equals("kille")) {
      if(nr == 1 || nr == 3 || nr == 5 || nr == 7 || nr == 9) {
        JOptionPane.showMessageDialog(null, "Stämmer");
      }
      else {
      JOptionPane.showMessageDialog(null, "Stämmer inte");
      }
    }
    else if(sex.equals("tjej")) {
      if(nr == 0 || nr == 2 || nr == 4 || nr == 6 || nr == 8) {
        JOptionPane.showMessageDialog(null, "Stämmer");
      }
      else {
      JOptionPane.showMessageDialog(null, "Stämmer inte");
      }
    }
    
    
    
  }
}