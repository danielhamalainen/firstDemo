public class Movie {

    private String title = "Unknown title";
    private double grade = 0.0;
    private int minutes = 0;
    boolean longMovie = true;

    public Movie(String title, double grade, int minutes, boolean longMovie) {
        this.title = title;
        this.grade = grade;
        this.minutes = minutes;
        longMovie = longMovie;
    }



    public boolean isLongMovie() {
        if(minutes > 30) {
            longMovie = false;
        }
        return longMovie;
    }


    public String getTitle() {
        return title;
    }
}
