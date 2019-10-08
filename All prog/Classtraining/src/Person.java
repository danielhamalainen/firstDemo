public class Person {

    public String firstName = "Daniel";
    public String lastName = "Hämäläinen";
    public int age = 24;
    public boolean hungry = true;

    public Person(String n, String lastN, int a) {
        firstName = n;
        lastName = lastN;
        age = a;
        System.out.println("New person created");
    }

}
