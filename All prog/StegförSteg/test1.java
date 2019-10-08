import java.util.Scanner;

public class test1 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Skriv en multiTabell");
    int answer = sc.nextInt();
    
    printMultiplicationTable(answer);
    
  }
  
  public static void printMultiplicationTable(int answer) {
  
     int sum = 0;
    
    for(int i = 0; i <= 10; i++) {
      sum = i * answer;
      System.out.println(sum);
    }
    
  }
  
}