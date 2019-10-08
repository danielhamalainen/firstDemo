import javax.swing.*;

public class ProgUpp4punkt1 {
  public static void main(String[] args) {
  
  String min = JOptionPane.showInputDialog(null, "Hur många minuter pratar du i telefon/månad?");
  int mins = Integer.parseInt(min);
  
  if(mins <= 33) {
    JOptionPane.showMessageDialog(null, "Kontant är billigast då!");
  }
  else if(mins <= 66) {
    JOptionPane.showMessageDialog(null, "Normal är billigast då!");
  }
  else {
    JOptionPane.showMessageDialog(null, "Plus passar dig din tjötkärring!");
  }
  
  
  }
}