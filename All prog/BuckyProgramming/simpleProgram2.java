public class simpleProgram2 {
  public static void main(String[] args) {
  
     double amount; //Vet ej än
     double princible = 10000; //Startpunkten
     double rate = .01; //Takten subs ökar i 
     
     for(int day = 1; day <= 20; day++) {
       amount = princible * Math.pow(1 + rate, day);
       System.out.println("Day:" + day + "   " + amount);
     }
  
  }
}