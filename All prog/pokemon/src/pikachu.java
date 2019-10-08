public class pikachu extends Pokemon{

    public pikachu(String type, int hp, int level) {
        super("Pikachu", "Electric", hp, level);
    }

    public void talk() {
        System.out.println("Pika pika");
    }

    @Override
    public int attack() {
        System.out.println("Blixtar och dunder, magiska under");
        return 20;
    }

}
