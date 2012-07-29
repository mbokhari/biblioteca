import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class NotificatorTest {

    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Test
    public void testWelcomeScreen() throws Exception {
        //given
        Notificator message = new Notificator();
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
        Notificator message = new Notificator();
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayErrorMessageWhenSelectingNonValidOption();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("The menu option you have selected is not valid"));

    }

    @Test
    public void testNotificationForSuccessfullyReservingBook() throws Exception {
        //given
        Notificator message = new Notificator();
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayReservationConfirmationMessage();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("The reservation has been successful"));
    }

    @Test
    public void testNotificationForBookNotAvailable() throws Exception {
        //given
        Notificator message = new Notificator();
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayBookNotAvailableMessage();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput,is("The book is currently not available"));
    }

    @Test
    public void testSeeListOnMenu() throws Exception {
        //given
        Notificator message = new Notificator();
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayMenu();
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Please choose an option from the following\n[1] View all books\n[2] Reserve book\n[3] Retrieve a book\n[4] Quit"));

    }

    @Test
    public void testDisplayAllBooks() throws Exception {
        //given
        Notificator message = new Notificator();
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The Secret History"));
        System.setOut(new PrintStream(outputReader));
        //when
        message.displayAllBooksInLibrary(books);
        final String standardOutput = outputReader.toString().trim();
        //then
        assertThat(standardOutput, is("Printing all books in Library\nThe Secret History"));

    }


}
