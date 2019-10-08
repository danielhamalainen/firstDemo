import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class arrayList {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
  ArrayList<String> cars = new ArrayList<>();
  
  cars.add("Volvo");
  cars.add("BMW");
  cars.add("Audi");
  cars.add("Ford");
  cars.add("Ferrari");
  
  String bestCar = cars.get(4); //attach Ferrari to bestCar
  
  cars.set(3, "Hummer");  //Change from Ford to Hummer
  
  // cars.remove(0); removes a car but the others are "pushed down one spot"
  
  
  System.out.println(cars);        //Print whole list
  System.out.println(cars.get(0)); //Print specific car
  System.out.println(bestCar);     //Print the best car :)
  System.out.println(cars.get(3)); //Print Hummer
  System.out.println(cars.size()); //Print the list size
  
  for(int i = 0; i < cars.size(); i++) {
    System.out.println(cars.get(i));
  }
  
  
  System.out.println(" ");
  
  
  Collections.sort(cars);   //Sorts the cars in alfabetical order
  
  for(String i : cars) {
    System.out.println(i);
  }
  
  
  
  }
}