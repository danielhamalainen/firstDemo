import javax.swing.*;
import java.awt.*;

public class ProgUpp2 {
  public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Detta är ett informationsmeddelande",  
                      "Information", JOptionPane.INFORMATION_MESSAGE);
                      Toolkit.getDefaultToolkit().beep();
    JOptionPane.showMessageDialog(null, "Detta är ett varningsmeddelande",  
                      "Varning", JOptionPane.WARNING_MESSAGE);
                      Toolkit.getDefaultToolkit().beep();
    JOptionPane.showMessageDialog(null, "Detta är ett felmeddelande",  
                      "Fel", JOptionPane.ERROR_MESSAGE);
                      Toolkit.getDefaultToolkit().beep();
  }
}