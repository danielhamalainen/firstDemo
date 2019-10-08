import javax.swing.*;

public class Fyra3 {
  public static void main (String[] arg) {
    
    String a = JOptionPane.showInputDialog(null, "Vad fick du för betyg?");
    int betyg = Integer.parseInt(a);
    
    if(betyg < 25) {
      JOptionPane.showMessageDialog(null, "F");
    }
    else if(betyg < 30) {
      JOptionPane.showMessageDialog(null, "E");
    }
    else if(betyg < 35) {
      JOptionPane.showMessageDialog(null, "D");
    }
    else if(betyg < 40) {
      JOptionPane.showMessageDialog(null, "C");
    }
    else if(betyg < 45) {
      JOptionPane.showMessageDialog(null, "B");
    }
    else {
      JOptionPane.showMessageDialog(null, "A, Grattis!");
    }
    
  }
}