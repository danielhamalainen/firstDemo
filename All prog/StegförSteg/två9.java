import javax.swing.*;
import java.awt.*;

public class två9 {
  public static void main(String[] args) {
    
    String a = "Daniel Hämäläinen 950630-0038";
    String day = a.substring(20, 22);
    String month = a.substring(22, 24);
    
    
    JOptionPane.showMessageDialog(null, month + "/" + day);
    
  
  
  }
}