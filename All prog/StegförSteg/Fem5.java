import javax.swing.*;

public class Fem5 {
  public static void main(String[] args) {
  
    String s = JOptionPane.showInputDialog("n?");
    int n = Integer.parseInt(s);
    int sum = 0;
    int k = 1;
    
    for(k = 1; k <= n; k++) {
      sum = sum + k;
    }
    
    JOptionPane.showMessageDialog(null, "Summan blir: " + sum);
    
  
  }
}