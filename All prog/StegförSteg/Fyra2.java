import javax.swing.*;

public class Fyra2 {
  public static void main (String[] arg) {
    
    
    String a = JOptionPane.showInputDialog(null, "Priset för ett årskort?");
    int year = Integer.parseInt(a);
    
    String b = JOptionPane.showInputDialog(null, "Priset för engångsbiljett?");
    int oneTime = Integer.parseInt(b);
    
    String c = JOptionPane.showInputDialog(null, "Hur många ggr tränar du per år?");
    int times = Integer.parseInt(c);
    
    if(times * oneTime < year) {
      JOptionPane.showMessageDialog(null, "Det lönar sig att köpa biljetter");
    }
    else {
      JOptionPane.showMessageDialog(null, "Punga ut för ett årskort, bättre i längden!");
    }
    
    
    
  }
}