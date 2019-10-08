public class Pokemon {

    private String name;
    private String type;
    private int hp;
    private int level;
    private boolean isFainted = false;

    public Pokemon(String name, String type, int hp, int level) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.level = level;
    }

    public int attack() {
        return 10;
    }

    public void takeDamage(int damage) {
        this.hp = this.hp - damage;
        if(this.hp <= 0) {
            this.isFainted = true;
        }
    }

    public String toString() {
        return "Name: " + this.name + " Level: " + this.level + " Type: " + this.type + " Hp left: " + this.hp;

    }

    public boolean isFainted() {
        return isFainted;
    }


}
