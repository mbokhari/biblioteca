import java.util.ArrayList;

public class Library  {

    private ArrayList<Book> books;
    private ArrayList<Movie> movies;

    public Library() {
        books = new ArrayList<Book>();
        movies = new ArrayList<Movie>();
    }

    public ArrayList<Book> returnAllBooksInLibrary() {
        return books;
    }

    public Book addBookToLibrary(String title){
        Book aBook = new Book(title);
        books.add(aBook);
        return aBook;
    }

    public Movie addMovieToLibrary(String title, String director, String rating) {
        Movie aMovie = new Movie(title, director, rating);
        movies.add(aMovie);
        return aMovie;

    }

    public ArrayList<Movie> returnAllMoviesInLibrary() {
        return movies;
    }

}
