import javax.swing.*; 

public class Tre7 {
  public static void main (String[] arg) {
    
    int i;
    double d;
    byte b;
    
    i = 500; 
    d = 500;  
    b = (byte) 500;    // värdet förvanskas
    JOptionPane.showMessageDialog(null, "i=" + i + " d=" + d + " b=" + b);
    
    i = (int) 500.7;   // i får värdet 500
    d = 500.7; 
    b = (byte) 500.7;  // värdet förvanskas
    JOptionPane.showMessageDialog(null, "i=" + i + " d=" + d + " b=" + b);
  
  }
}