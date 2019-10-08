public class compInterest {
  public static void main(String[] args) {
  
    double amount;
    double invest = 30000; //investering på 30k i aktier
    double rate = .01; //Ökar med 0.01/dag
    
    for(int day = 1; day <= 30; day++) {
      amount = invest * Math.pow(1 + rate, day);
      System.out.println(day + "   " + amount);
    }
    
  
  }
}