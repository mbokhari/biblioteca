import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
I know that there is much more to do for these tests, I think I have to use the input/output
Class thingy in java, but I'm not sure how to use it. Also this being a console application,
would it be helpful to use the java.io.Console class? Hmm.
 */

public class NotificatorTest {

    @Test
    public void testWelcomeScreen() throws Exception {
        //given
        Notificator message = new Notificator();
        //when
        String welcomeMessage = message.DisplayWelcomeMessage();
        //then
        assertThat(welcomeMessage,is("Welcome to Biblioteca!"));
    }

    @Test
    public void testNotifyWhenSelectingNonValidOption() throws Exception {
        //given
        Notificator message = new Notificator();
        //when
        String notAValidMenuOptionMessage = message.DisplayErrorMessageWhenSelectingNonValidOption();
        //then
        assertThat(notAValidMenuOptionMessage, is("The menu option you have selected is not valid"));

    }

    @Test
    public void testNotificationForSuccessfullyReservingBook() throws Exception {
        //given
        Notificator message = new Notificator();
        //when
        String reservationConfirmationMessage = message.displayReservationConfirmationMessage();
        //then
        assertThat(reservationConfirmationMessage, is("The reservation has been successful"));
    }

    @Test
    public void testNotificationForBookNotAvailable() throws Exception {
        //given
        Notificator message = new Notificator();
        //when
        String bookNotAvailableMessage = message.displayBookNotAvailableMessage();
        //then
        assertThat(bookNotAvailableMessage,is("The book is currently not available"));
    }

}
