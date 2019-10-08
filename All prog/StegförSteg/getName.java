import java.util.Scanner;

public class getName {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    String name;
    
    do {
      System.out.println("Skriv ditt namn (Mer än 3 bokstäver)");
      name = sc.nextLine();
    
    } while(name.length() < 4);
    
    System.out.println("Gött");
    
  }
}