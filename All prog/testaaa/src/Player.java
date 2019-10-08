import java.util.ArrayList;


public class Player {

    private String name;
    private int points;

    private ArrayList<Die> dieList = new ArrayList<>();


    static int ID = 1;


    Player() {
        name = "Player " + ID;
        ID++;
    }


    public void rollDices() {
        for (int i = 0; i < dieList.size(); i++) {
            dieList.get(i).roll();
        }
    }


    public void addDie(int numberOfSides) {
        dieList.add(new Die(numberOfSides));
    }


    public void increasePoints() {
        points++;
    }


    public int getDieValue() {
        int value = 0;
        for (int i = 0; i < dieList.size(); i++) {
            value = value + dieList.get(i).getCurrentValue();
        }
        return value;
    }

    public int getDieListsize() {
        return dieList.size();
    }


    public String getName() {
        return name;
    }


    public int getPoints() {
        return points;
    }
}
