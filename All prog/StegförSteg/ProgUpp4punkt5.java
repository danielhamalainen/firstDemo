import javax.swing.*;
import java.util.*;

public class ProgUpp4punkt5 {
  public static void main(String[] args) {
  
    String s = JOptionPane.showInputDialog(null, "Skriv ditt personnummer såhär: ååmmddxxxx");
    String m = s.substring(2, 4);
    String d = s.substring(4, 6); 
    
    String a = Calendar.getInstance().getTime().toString();
    a = a.trim();
    String calendarMonth = a.substring(4, 7);
    String calendarDay = a.substring(8, 10);
    
    switch(calendarMonth) {
      case "Jan":
        calendarMonth = "01";
        break;
      case "Feb":
        calendarMonth = "02";
        break;
      case "Mar":
        calendarMonth = "03";
        break;
      case "Apr":
        calendarMonth = "04";
        break;
      case "Maj":
        calendarMonth = "05";
        break;
      case "Jun":
        calendarMonth = "06";
        break;
      case "Jul":
        calendarMonth = "07";
        break;
      case "Aug":
        calendarMonth = "08";
        break;
      case "Sep":
        calendarMonth = "09";
        break;
      case "Okt":
        calendarMonth = "10";
        break;
      case "Nov":
        calendarMonth = "11";
        break;
      case "Dec":
        calendarMonth = "12";
        break;
    }
    
    if(calendarMonth.equals(m) && calendarDay.equals(d)) {
      JOptionPane.showMessageDialog(null, "Grattis på födelsedagen!");
    }
    else {
      JOptionPane.showMessageDialog(null, "Idag är inte din födelsedag :( ");
    }
    
    

  
  }
}