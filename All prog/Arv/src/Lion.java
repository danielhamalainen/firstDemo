public class Lion extends Animal {

    public Lion(String name) {

        super(name);
        System.out.println(name);
        roar();
        eat(getFood());

    }

    public void roar() {

        System.out.println("Lion: roooar");
    }



}
