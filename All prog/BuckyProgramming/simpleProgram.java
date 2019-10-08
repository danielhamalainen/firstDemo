import java.util.Scanner;

public class simpleProgram {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    int total = 0;
    int grade;
    int average;
    int counter = 0;
    
    System.out.println("Skriv in din 10 senaste betygs poäng!");
    
    while(counter < 10) { //Gör så man får skriva in "grade" 10ggr.
      grade = sc.nextInt(); //Här tar programmet emot grade.
      total = total + grade; //Här adderar programmet alla grades man skriver in.
      counter++;  //Här lägger loopen på 1 efter varje input så man kan skriva nya grades!
    }
    
    average = total/10; //Här delar programmet det totala gradet på 10 (genomsnittet).
    
    System.out.println("Genomsnittet är: " + average);
  
  }
}