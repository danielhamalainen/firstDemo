import java.util.Random;

public class Dragon implements Flying, Mortal{

    int hp = 100;
    int currentHp;


    @Override
    public void fly() {

    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void die() {

    }

    public static int fight() {

        Random random = new Random();



    }

    public void roll() {

        Random random = new Random();

        currentHp = random.nextInt(numberOfSides - 1) + 1;

    }

}
