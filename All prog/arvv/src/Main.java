public class Main {

    public static void main(String[] args) {
	// write your code here
        Computer c1 = new Computer();
        Computer c2 = new PC();
        Computer c3 = new Macintosh();
        Macintosh macintosh = new Macintosh();
        c1.printYourInventor();
        c2.printYourInventor();
        c3.printYourInventor();
        System.out.println(macintosh.yearsOld());




    }
}
