import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        boolean klart = false;

        do {

            System.out.println("Vad vill du göra?");
            System.out.println("1. Addera två tal");
            System.out.println("2. Räkna bokstäver i en sträng");
            System.out.println("3. Spegelvänd en sträng");
            System.out.println("4. Summera alla tal i en sträng");
            System.out.println("e. Avsluta");

            char choise = sc.next().charAt(0);

            switch (choise) {

                case '1':
                    number1();
                    break;

                case '2':
                    number2();
                    break;

                case '3':
                    number3();
                    break;

                case '4':
                    number4();
                    break;

                case 'e':
                    klart = true;
                    break;



            }


        }while(!klart);




    }

    public static void number1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv två tal!");
        double number1 = sc.nextInt();
        double number2 = sc.nextInt();
        double numberAnswer = number1 + number2;
        System.out.println(numberAnswer);


    }

    public static void number2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange ordet du vill leta: ");
        String stringAnswer = sc.nextLine();

        System.out.println("Ange bokstaven du vill leta efter: ");
        char letterAnswer = sc.nextLine().charAt(0);

        int counter = 0;

        for(int i = 0; i < stringAnswer.length(); i++) {
            if(stringAnswer.charAt(i) == letterAnswer) {
                counter++;
            }
        }

        System.out.println("Det finns " + counter + " " + letterAnswer + " i ordet " + stringAnswer);


    }

    public static void number3() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in en sträng");
        String answer = sc.nextLine();

        String reverse = new StringBuffer(answer).reverse().toString();

        System.out.println(reverse);

    }

    public static void number4() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv en sträng");

        String answer = sc.nextLine();
        int siffror = 0;

        for (int i = 0; i < answer.length(); i++) {

            if(Character.isDigit(answer.charAt(i))) {
                siffror += answer.charAt(i) - 48;
            }
            else {
                System.out.println(answer.charAt(i) + " är ingen siffra");
            }
        }

        System.out.println(siffror);

    }



}





