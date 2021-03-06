import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class NotificatorTest {

    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();
    private Notificator message;
    private Library library;

    @Before
    public void setUp() throws Exception {
        message = new Notificator();
        library = new Library();

    }

    @Test
    public void testWelcomeScreen() throws Exception {
        //given
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayWelcomeMessage();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput,is("Welcome to Biblioteca!"));
    }

    @Test
    public void testNotifyWhenSelectingNonValidOption() throws Exception {
        //given
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayErrorMessageWhenSelectingNonValidOption();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Select a valid option!!"));

    }

    @Test
    public void testNotificationForSuccessfullyReservingBook() throws Exception {
        //given
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayReservationConfirmationMessage();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Thank You! Enjoy the book"));
    }

    @Test
    public void testNotificationForBookNotAvailable() throws Exception {
        //given
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayBookNotAvailableMessage();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput,is("Sorry we don't have that book yet."));
    }

    @Test
    public void testSeeListOnMenu() throws Exception {
        //given
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayMenu();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Please choose an option from the following\n[1] View all books\n[2] View all movies\n[3] Reserve book\n[4]" +
                " Retrieve a book\n[5] Check library number\n[6] Log In\n[7] Quit\n\n>>"));

    }

    @Test
    public void testDisplayAllBooks() throws Exception {
        //given
        library.addBookToLibrary("The Secret History");
        ArrayList<Book> books = library.returnAllBooksInLibrary();
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayAllBooksInLibrary(books);
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Printing all books in Library\n* The Secret History"));

    }

    @Test
    public void testDisplayAllMovies() throws Exception {
        //given
        library.addMovieToLibrary("The Matrix", "Andy Wachowski", "8.7");
        ArrayList<Movie> movies = library.returnAllMoviesInLibrary();
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayAllMoviesInLibrary(movies);
        String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Printing all movies in Library\n\n * Title: The Matrix   Director: Andy Wachowski    Rating: 8.7"));

    }
}

