/**
 * contains the players attributes
 */
public class Player extends Main {

    static int currentLevel;
    static int hp;
    static int exp;
    static int maxHp;
    static int maxExp;
    static String name;
    static int currentGold;
    static int potions;


    /**
     *
     * @param currentLevel contains the players level
     * @param hp  contains the hp
     * @param exp contains the exp
     * @param maxHp contains the max hp
     * @param maxExp contains the max exp
     * @param name contains the players name
     */
    public Player(int currentLevel, int hp, int exp, int maxHp, int maxExp, String name, int currentGold, int potions) {
        this.currentLevel = currentLevel;
        this.hp = hp;
        this.exp = exp;
        this.maxHp = maxHp;
        this.maxExp = maxExp;
        this.name = name;
        this.currentGold = currentGold;
        this.potions = potions;

    }

    /**
     * Displays the players current stats!
     */
    public void printPlayer(String playerName) {
        System.out.println("*******************************");
        System.out.println("* Name: " + playerName + "");
        System.out.println("* Level: " + currentLevel );
        System.out.println("* Hp: " + hp + "/" + maxHp);
        System.out.println("* Exp: " + exp + "/" + maxExp);
        System.out.println("* Gold: " + currentGold);
        System.out.println("* Potions: " + potions);
        System.out.println("*******************************");
    }


    /**
     * Corrects the current level and exp when the player gains exp.
     */
    public void levelUp() {
        if (exp >= maxExp) {
            currentLevel++;
            exp = exp - 100;
            maxHp = maxHp + 20;
            maxExp = maxExp + 20;
            hp = maxHp;

            if(currentLevel >= 10) {
                System.out.println("Congratualtions! You´ve won the game!");
                System.exit(0);
            }
            else {
                System.out.println("You are now level: " + currentLevel);
                System.out.println("Random bystander: GZ dude!");
            }

        }


    }

    public void addPotions() {

    }

    public void drinkPotions() {

    }

}
