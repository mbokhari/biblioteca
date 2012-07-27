import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
I know that there is much more to do for these tests, I think I have to use the input/output
Class thingy in java, but I'm not sure how to use it. Also this being a console application,
would it be helpful to use the java.io.Console class? Hmm.
 */

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

}
