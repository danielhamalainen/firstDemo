import java.util.ArrayList;
import java.util.Collections;

public class arrayListNumbers {
  public static void main(String[] args) {
  
  ArrayList<Integer> numbers = new ArrayList<>();
  
  numbers.add(5);
  numbers.add(86);
  numbers.add(24);
  numbers.add(62);
  numbers.add(1337);
  
  Collections.sort(numbers);
  
  for(int i : numbers) {
    System.out.println(i);
  }
  
  }
}