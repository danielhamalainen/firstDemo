import javax.swing.*;

public class Fyra4 {
  public static void main (String[] arg) {
    
    String a = JOptionPane.showInputDialog(null, "Längd i mm");
    int tall = Integer.parseInt(a);
    
    String b = JOptionPane.showInputDialog(null, "Bredd i mm");
    int wide = Integer.parseInt(b);
    
    String c = JOptionPane.showInputDialog(null, "Tjocklek i mm");
    int thick = Integer.parseInt(c);
    
    if(tall > 600 || tall < 140) {
      JOptionPane.showMessageDialog(null, "Icke godkänt!");
    }
    else if(wide > 200 || wide < 90) {
      JOptionPane.showMessageDialog(null, "Icke godkänt!");
    }
    else if(thick > 100) {
      JOptionPane.showMessageDialog(null, "Icke godkänt!");
    }
    else {
      JOptionPane.showMessageDialog(null, "OK");
    }
    
    
        
  }
}