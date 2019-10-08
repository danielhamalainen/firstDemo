public abstract class AbstractFighter implements Theme{

    private int hp;

    public AbstractFighter(int health) {
        this.hp = health;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public int getHp() {
        return this.hp;
    }

    public void punch() {
        System.out.println("sicken jävla smäll");
    }




}
