package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDiceGame {

    static ArrayList<Player> players = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        players = initialize();

        for (int i = 0; i < 5; i++) {
            System.out.println("Runda " + (i + 1));

            takeTurn(players);
        }
        getWinners(players);
    }

    private static ArrayList<Player> initialize() {
        ArrayList<Player> players = new ArrayList<>();

        System.out.println("Antal spelare: ");
        int numberOfPlayers = sc.nextInt();
        System.out.println(numberOfPlayers + " spelare är med i spelet");

        System.out.println("Hur många tärningar? ");
        int numberOfDices = sc.nextInt();
        System.out.println(numberOfDices + " tärningar");

        System.out.println("Antal sidor på tärningen?");
        int numberOfDieSides = sc.nextInt();
        System.out.println(numberOfDieSides + " sidor på tärningen");

        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player());

            for (int j = 0; j < numberOfDices; j++) {
                players.get(i).addDie(numberOfDieSides);
            }
        }
        return players;
    }

    private static void takeTurn(ArrayList<Player> players) {

        for (int i = 0; i < players.size(); i++) {
            System.out.println("Gissa ett nummer: ");
            int guessedNumber = sc.nextInt();

            System.out.println(players.get(i).getName() + " gissade på " + guessedNumber);
            players.get(i).rollDices();

            System.out.println("Summan av de " + players.get(i).getDieListSize() + " tärningarna blev " + players.get(i).getDieValue());

            if (guessedNumber == players.get(i).getDieValue()) {
                players.get(i).increaseScore();

                System.out.println(players.get(i).getName() + " du gissade rätt och får 1 poäng!");
            }
        }
    }

    private static ArrayList<Player> getWinners(ArrayList<Player> players) {
        ArrayList<Player> winners = new ArrayList<>();

        int maxPoints = 0;

        for (int i = 0; i < players.size(); i++) {
            int points = players.get(i).getScore();

            if (points >= maxPoints) {
                if (points > maxPoints) {
                    winners.clear();
                }
                maxPoints = points;
                winners.add(players.get(i));
            }
        }
        for (int j = 0; j < winners.size(); j++) {
            System.out.println(winners.get(j).getName() + " vann på " + maxPoints + " poäng");
        }
        return winners;
    }
}