import javax.swing.*;

public class Fem1 {
  public static void main(String[] args) {
  
    String s = JOptionPane.showInputDialog(null, "Skriv ett heltal!");
    
    int answer = Integer.parseInt(s);
    int sum = 0;
    int k = 1;
    
    while(k <= answer) {
      sum = sum + k * k;
      k++;
    }
    
    JOptionPane.showMessageDialog(null, "Summan blir: " + sum);
  
  
  }
}