import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie movies = new Movie("The hobbit", 150);
        System.out.println("You have know seen the " + movies.getTitle() + "!");
        System.out.println("What rating will you give the movie?");
        double yourGrades = sc.nextDouble();

        movies.setGrades(0.0);

        System.out.println("You gave " + movies.getTitle() + " the grades of " + yourGrades);
        LengthMovies();
        GradesMovie(yourGrades);
    }

    private static void GradesMovie(double grades) {
        if(grades > 7.0){
            System.out.println("The Movie was awesome");
        } else {
            System.out.println("the movie sucked!");
        }
    }

    public static void LengthMovies(){
        int minutes = 0;
        boolean longMovie = true;
        if (minutes < 30) {
            longMovie = false;
            System.out.println("It's not a long movie!");
        } else {
            System.out.println("It's a long movie!");
        }

    }
}