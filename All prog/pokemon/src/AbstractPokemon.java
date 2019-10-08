abstract class AbstractPokemon {

    private int hugs;
    private int maxHugs;

    public AbstractPokemon(int maxHugs) {
        this.maxHugs = maxHugs;
        hugs = maxHugs;
    }



public int getHugs() {
  return hugs;
}

public void addHugs(int amount) {
  hugs += amount;
}

public void decreaseHugs(int amount) {
  hugs -= amount;
}

public void visitPokeCenter() {
  hugs = maxHugs;
}

public abstract void hug(Trainer);

}