import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        System.out.println("Vilket heltal ska vi börja med?");
        int first = sc.nextInt();
        System.out.println("Vilket ska vi avsluta med?");
        int second = sc.nextInt();

        int firstMax = first * 10;
        int secondMax = second * 10;

        do {

            for (int j = first; j <= firstMax; j = j + first) {
                System.out.print(j);
                System.out.print(" ");

            }

            System.out.println(" ");
            first++;
            firstMax = firstMax + 10;



        }while(first != second + 1 && firstMax != secondMax + 10);





    }
}
