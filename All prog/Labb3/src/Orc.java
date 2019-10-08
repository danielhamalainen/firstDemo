/**
 * this is the Orc class which extends from monster
 */
public class Orc extends Monster {


    static int maxExpDrop;
    static int hp;
    static int maxGoldDrop;


    /**
     *
     * @param name the name that orc gets from monster
     * @param hp the orcs hp
     * @param maxExpDrop the orcs max exp drop
     */
    public Orc(String name, int hp, int maxExpDrop, int maxGoldDrop) {
        super(name);
        this.hp = hp;
        this.maxExpDrop = maxExpDrop;
        this.maxGoldDrop = maxGoldDrop;
    }


}
