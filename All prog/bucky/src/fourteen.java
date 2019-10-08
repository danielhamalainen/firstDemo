import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Namn?");
        String name = sc.nextLine();

        two(name);


    }

    static void two(String name) {
        System.out.println("Hej " + name);
    }



}
