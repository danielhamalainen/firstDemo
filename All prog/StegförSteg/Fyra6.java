import javax.swing.*;

public class Fyra6 {
  public static void main (String[] arg) {
    
    String first = JOptionPane.showInputDialog(null, "Skriv ditt personnummer såhär: 950630");
        
    String second = JOptionPane.showInputDialog(null, "Skriv ditt personnummer såhär: 950630");
   
    
    String one = first.substring(2);
    String two = second.substring(2);
    
    if(one.equals(two)) {
      JOptionPane.showMessageDialog(null, "Ni har samma födelsedag!");
    }   
    else {
      JOptionPane.showMessageDialog(null, "Ni har ej samma födelsedag!");
    }
        
  }
}