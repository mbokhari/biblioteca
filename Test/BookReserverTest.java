import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookReserverTest {


    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    //Need to simulate user input. Brain ache.

    @Test
    public void testrunItem() throws Exception {

        //given
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The Secret History"));
        BookReserver bookReserver = new BookReserver(new Library(books), new Notificator());
        System.setOut(new PrintStream(outputReader));

        //when
        bookReserver.runItems();
        final String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is(""));
    }
}
