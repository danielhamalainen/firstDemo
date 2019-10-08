public class Array {
  public static void main(String[] args) {
  
  String[] names = new String[3];
  
  names[0] = "Daniel";
  
  names[1] = "Mamma";
  
  names[2] = "Catharina";
  
  System.out.println(names[0]);
  
  
  String[] names2 = {"Daniel", "Mamma", "Catti"};
  
  System.out.println(names2[0]);
  
  //Printar samma sak, exempel names2 är enklare om man har flera element!
  
  for(int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
  }
  
  }
}