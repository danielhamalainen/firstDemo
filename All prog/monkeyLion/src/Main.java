public class Main {

    public static void main(String[] args) {
	// write your code here
        Monkey m = new Monkey();
        Lion lion = new Lion();
        System.out.println(lion.method3(m.method2(42,2)));
    }
}
