public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Berra", lastN "Jönsson");
        Person p2 = new Person();

        p1.firstName = "Berra";
        p1.lastName = "Jöns";
        p1.age = 24;

        p2.firstName = "Pelle";
        p2.lastName = "tönt";
        p2.age = 1337;

        System.out.println(p1.firstName);
        System.out.println(p1.hungry);
        System.out.println(p2.firstName);
        System.out.println(p2.hungry);

        korvmojj mojj = new korvmojj();

        System.out.println(mojj.korvar);

        mojj.feedHungryPerson(p1);

        System.out.println(p1.firstName);
        System.out.println(p1.hungry);
        System.out.println(p2.firstName);
        System.out.println(p2.hungry);

        System.out.println(mojj.korvar);





    }
}
