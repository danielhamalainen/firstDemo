import javax.swing.*;
import java.util.*;

public class ProgUpp2punkt1 {
  public static void main(String[] args) {
  
  String a = Calendar.getInstance().getTime().toString();
  a = a.trim();
  String timma = a.substring(11, 13);
  String minut = a.substring(14, 16);
  String sekund = a.substring(17, 19);
  
  JOptionPane.showMessageDialog(null, "Klockan är: " + timma + ":" + minut + ":" + sekund);

  
  }
}