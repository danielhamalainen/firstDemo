import javax.swing.*;

public class Fyra8 {
  public static void main(String[] args) {
  
  String persNr = JOptionPane.showInputDialog(null, "Skriv ditt personnummer såhär: ååmmdd-xxxx");
  
  switch(persNr.charAt(9)) {
  
    case '0': case '2': case '4': case '6': case '8':
    JOptionPane.showMessageDialog(null, "Du är en kvinna!");
    break;
    
    case '1': case '3': case '5': case '7': case '9':
    JOptionPane.showMessageDialog(null, "Du är en man!");
    
  }
  
  
  }
}