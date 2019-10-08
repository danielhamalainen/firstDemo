import javax.swing.*;
import java.util.*;

public class ProgUpp2punkt2 {
  public static void main(String[] args) {
  
  String name = JOptionPane.showInputDialog(null, "Skriv in: efternamn, förnamn");
  
  int fName = name.lastIndexOf(' ') + 1;
  
  String a = name.substring(12);
  String b = a.toUpperCase();
  
  JOptionPane.showMessageDialog(null, "Hej " + b );

  
  }
}