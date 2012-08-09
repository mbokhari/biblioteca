import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private ArrayList<Member> members;
    private LibraryNumberGenerator libNumGen;

    public Library() {
        books = new ArrayList<Book>();
        movies = new ArrayList<Movie>();
        members = new ArrayList<Member>();
        libNumGen = new LibraryNumberGenerator();
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

    public Member addMember(String password) {
        Member aMember = new Member(libNumGen, password);
        members.add(aMember);
        return aMember;
    }

    public ArrayList<Movie> returnAllMoviesInLibrary() {
        return movies;
    }

    public ArrayList<Member> returnAllMembers() {
        return members;
    }

}
