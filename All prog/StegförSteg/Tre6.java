import javax.swing.*;

public class Tre6 {
  public static void main (String[] arg) {
    
    String s = JOptionPane.showInputDialog("Tid (i sekunder)?");
    int tid = Integer.parseInt(s);
    
    int tim, min, sek;
    
    tim = tid / 3600; //500sek = 0.13 = 0
    tid = tid % 3600; //0 då 3600 får plats 0ggr i 500tex
    min = tid / 60;   //8.3
    tid = tid % 60;   //60 får plats 8ggr i 500 (480) så blir 20 över
    sek = tid;        //20
    
    JOptionPane.showMessageDialog(null, tim + ":" + min + ":" + sek);
 
  }
}