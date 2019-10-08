import java.util.Random;

public class Die {

    private int currentValue;
    private int numberOfSides;


    public Die(int numberOfSides) {

        this.numberOfSides = numberOfSides;
    }

    public void roll() {

        Random random = new Random();

        currentValue = random.nextInt(numberOfSides - 1) + 1;

    }

    public int getCurrentValue() {

        return currentValue;
    }

    public int getNumberOfSides() {

        return numberOfSides;
    }


}

