import javax.swing.*;

public class ProgUpp4punkt3 {
  public static void main (String[] arg) {
    
    
    String s = JOptionPane.showInputDialog("Postnummer? t.ex 44335");
    String number = s.substring(0, 2);
    int nr = Integer.parseInt(number);
    
    if(nr >= 20 && nr <= 62 || nr == 65 || nr == 66) {
      JOptionPane.showMessageDialog(null, "Götaland");
    }
    else if(nr >= 80) {
      JOptionPane.showMessageDialog(null, "Norrland");
    }
    else {
      JOptionPane.showMessageDialog(null, "Svealand");
    }
    
    
     

    
        
  }
}