import java.util.Scanner;

public class   Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        tuna tunaObject = new tuna();
        salmon salmonObject = new salmon();

        System.out.println("Enter first gf name: ");
        String tempName = sc.nextLine();

        System.out.println("Enter her age: ");
        int tempAge = sc.nextInt();

        tunaObject.setName(tempName);
        salmonObject.setAge(tempAge);


        tunaObject.saying();
        System.out.println(" ");
        salmonObject.sayAge();



    }

}


