import javax.swing.*;
import java.util.*;

public class ProgUpp2punkt3 {
  public static void main(String[] args) {
  
  String name = JOptionPane.showInputDialog(null, "Skriv en mening!");
  
  String a = name.trim();
  
  int b = a.indexOf(' ');
  String firstWord = a.substring(0, b);
  
  int c = a.lastIndexOf(' ') + 1;
  String lastWord = a.substring(c);
  
  int nr = a.length();
  
  JOptionPane.showMessageDialog(null, "Du skrev en text med: " + nr + " tecken" + "\n" +
                                      "Det första ordet var: " + firstWord + "\n" + 
                                      "Det sista ordet var: " + lastWord);
  

  
  }
}