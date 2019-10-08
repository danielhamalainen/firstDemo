import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDiceGame {

    static ArrayList<Player> players = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Player> winners = new ArrayList<>();

    public static void main(String[] args) {

        players = initialize();

        for(int i = 0; i < 5; i++) {

            System.out.println("Round " + (i + 1));
            takeTurn(players);
        }

        winners = getWinners(players);

        for(int i = 0; i < winners.size(); i++) {
            winners.get(i).getName();
            System.out.println(winners.get(i).getName() + " won!!!");
        }



    }

    private static ArrayList<Player> initialize() {

        ArrayList<Player> players = new ArrayList<>();

        System.out.println("Number of players??");
        int numberOfPlayers = sc.nextInt();
        System.out.println(numberOfPlayers + " players.");

        System.out.println("Number of dices?");
        int numberOfDices = sc.nextInt();
        System.out.println(numberOfDices + " dices");

        System.out.println("Number of sides?");
        int numberOfSides = sc.nextInt();
        System.out.println("Number of sides created: " + numberOfSides);


        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player());

            for (int j = 0; j < numberOfDices; j++) {
                players.get(i).addDie(numberOfSides);
            }
        }

        return players;

    }

    private static void takeTurn(ArrayList<Player> players) {


        for (int i = 0; i < players.size(); i++) {

            System.out.println("Guess the number!");
            int answer = sc.nextInt();

            System.out.println(players.get(i).getName() + " guessed " + answer);

            players.get(i).rollDices();

            System.out.println("The sum of the " + players.get(i).getDieListsize() + " dices are " + players.get(i).getDieValue());

            if(answer == players.get(i).getDieValue()) {
                players.get(i).increasePoints();

                System.out.println(players.get(i).getName() + " guessed right and got one point!");

            }
        }

    }

    private static ArrayList<Player> getWinners(ArrayList<Player> players){

        ArrayList<Player> winners = new ArrayList<>();

        for (int j = 0; j < 5; j++) {

            if(winners.size() > 0){
                break;
            }

            for (int i = 0; i < players.size(); i++) {
                if(players.get(i).getPoints() == (5 - j) && players.get(i).getPoints() > 0){
                    winners.add(players.get(i));
                }
            }
        }
        return winners;
    }

}
