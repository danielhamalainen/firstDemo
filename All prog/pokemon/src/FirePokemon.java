public class FirePokemon extends AbstractPokemon {

    public FirePokemon() {
        super(5);
    }

    @Override
    public void hug(Trainer t) {
        if(getHugs() > 0) {
            decreaseHugs(1);
            System.out.println(Trainer.getName() + " got a hug!" + Trainer.getName() + " is now happier but also warmer!");
        }
        else {
            System.out.println("Too tired, can´t hug no more!");
        }

    }
}
