public class Movie {

    private String title = "Unknown title";
    private double grades = 0.0;
    private int minutes = 0;
    boolean longMovie = true;

    public Movie(String title, int minutes) {
        this.title = title;
        this.minutes = minutes;
        grades = 0.0;

    }

    public String getTitle() {
        return title;
    }

    public void setGrades(double rating) {
        grades = rating;
    }


}
