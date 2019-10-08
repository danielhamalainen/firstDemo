import java.util.Scanner;

public class test2 {
  public static void main(String[] arg) {
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Månadslön?");
  double cash = sc.nextDouble();
  
  calculateTax(cash);
  
  
  }
  
  public static void calculateTax(double cash) {
  
  if(cash > 100000) {
    System.out.println(cash * 0.4 + " kr skatt/mån");
  }
  else {
    System.out.println(cash * 0.3  + " kr skatt/mån");
  }
  
}

}