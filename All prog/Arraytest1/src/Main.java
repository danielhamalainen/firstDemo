import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv ett heltal > 1");

        int x = sc.nextInt();

        createArray(x);

        int[] firstList = createArray2(numberOfValues: 10);
        createArray2(firstList)



    }

    public static int[] createArray(int x) {

        int[] list = new int[x];

        for(int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }

        return list;

    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }


    }



}
