import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Spelarens namn: ");
        String playerName = sc.nextLine();


        Die d1 = new Die();
        Player p1 = new Player();

        p1.getName(playerName);
        p1.getScore();





    }
}
