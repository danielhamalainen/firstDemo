import java.util.*;

public class exceptionHandling {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
  int x = 1;
  
  
  do {
    try {
    
        System.out.println("First nr?");
        int n1 = sc.nextInt();
        System.out.println("Second nr?");
        int n2 = sc.nextInt();
        int sum = n1/n2;
        System.out.println(sum);
        
        x = 2;
  
    }
    catch(Exception e) {
        System.out.println("You cant do that");
    }
    
    
  }while(x==1);  
  
  }
}