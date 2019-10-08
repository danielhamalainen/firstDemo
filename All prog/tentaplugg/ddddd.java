public class ddddd {
public static void main(String[] args) {


}

public double divide(double a, double b) { 
  double c = 0;
  try {
    c = a / b; 
  }
  catch(Exception e) {  //Have to identify the error (Exception e)
       System.out.println("hej");
  }
  return c; 
  }
}