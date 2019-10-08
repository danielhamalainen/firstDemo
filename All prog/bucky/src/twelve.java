import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv ett nummer från 1-5");

        int number = sc.nextInt();

        switch(number) {
            case 1:
                System.out.println("Ett");
                break;
            case 2:
                System.out.println("Två");
                break;
            case 3:
                System.out.println("Tre");
                break;
            case 4:
                System.out.println("Fyra");
                break;
            case 5:
                System.out.println("Fem");
                break;
            default:
                System.out.println("Gör om gör rätt!");
        }
    }
}
