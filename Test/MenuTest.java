import com.sun.xml.internal.bind.v2.model.core.ID;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();
    private Library library;
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        library = new Library();
        menu = new Menu(library);
    }

    @Test
    public void testSelectMenuOption() throws Exception {
        //given
        library.addBookToLibrary("The Secret History");
        System.setOut(new PrintStream(outputReader));

        //when
        menu.menuSelection(1);
        final String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("Printing all books in Library\nThe Secret History"));
    }

    @Test
    public void testNonValidOption() throws Exception {
        //given
        Notificator screenMessage = new Notificator();
        System.setOut(new PrintStream(outputReader));

        //when
        menu.menuSelection(23);
        String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("The menu option you have selected is not valid"));
    }
}
