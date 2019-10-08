public class Main {

    public static void main(String[] args) {
	// write your code here

        AbstractPokemon charizard = new FirePokemon();
        AbstractPokemon Articuno = new IcePokemon();

        charizard.hug(new Trainer("Ash"));
        Articuno.hug(new Trainer("Misty"));

    }
}
