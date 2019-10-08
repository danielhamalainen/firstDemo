import javax.swing.*;

public class Fem4 {
  public static void main(String[] args) {
  
    while(true) {
    
      String s = JOptionPane.showInputDialog(null, "Hur högt släpper du bollen ifrån? (Räknat i meter)");
      
      if(s == null) {
        break;
      }
    
      double answer = Double.parseDouble(s);
      double answerInCentimeter = answer * 100;
      double bounces = 0;
      double k = 1;
    
      while(answerInCentimeter > 1) {
        bounces = bounces + 1;
        answerInCentimeter = answerInCentimeter * 0.7;
      }
    
      JOptionPane.showMessageDialog(null, "Antalet studsar: " + bounces);
   
    }
    
    
      JOptionPane.showMessageDialog(null, "Programmet avslutas!");
  
  }
}