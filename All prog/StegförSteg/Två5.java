import javax.swing.*;
import java.awt.*;

public class Två5 {
  public static void main(String[] args) {
    
    String first; //Här skriver användaren in sitt namn
    String last;  //Här skriver användaren in sitt efternamn
    String greeting;
    
    first = JOptionPane.showInputDialog("What is your firstname?");
    last = JOptionPane.showInputDialog("What is your lastname?");
    
    greeting = "Welcome " + first + " " + last;
    
    /** HÄR EMELLAN LÄGGER JAG
    EN ONÖDIG KOMMENTAR
    SOM BARA ÄR TILL FÖR UPPGIFTEN!
    */
  
    JOptionPane.showMessageDialog(null, greeting);
  
  }
  
}