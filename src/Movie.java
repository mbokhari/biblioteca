import java.util.ArrayList;

public class Movie {

    private String title;
    private String director;
    private String rating;
    private Notificator notificator;

    public Movie(String title, String director, String inputRating) {
        this.title = title;
        this.director = director;
        if ((inputRating == null) || (inputRating.equals("")))  {
            this.rating = "N/A";
        }
        else {
            rating = inputRating;
        }

    }

    public void printMovie() {
        System.out.printf("Title: %s   Director: %s    Rating: %s", title, director, rating);
    }

    public void setRating(double newRating) {
        notificator.printMessage("Please rate the movie by entering a number from 0-10.");
        if (newRating <= 10.0) {
            String stringRating = "" + newRating;
            rating = stringRating;
        }
        else {
            notificator.printMessage("The number you entered is not valid. Please enter a number from 0-10.");

        }
    }
}
