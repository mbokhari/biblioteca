import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BookReserverTest {

    private Notificator notificator = new Notificator();
    private BookReserver bookReserver;
    private Library library;
    private ArrayList<Book> books = new ArrayList<Book>();
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Before
    public void setUp() {

        library = new Library();
        this.bookReserver = new BookReserver(library);

    }

    @Test
    public void testReserveBook() throws Exception {
        //given

        Book aBook = library.addBookToLibrary("Harry Potter");

        //when
        bookReserver.reserveBook("Harry Potter");

        //then
        assertThat(aBook.statusOfBook(), is("Reserved"));
    }

    @Test
    public void testCanOnlyReserveABookThatIsAvailable() throws Exception {
        //given
        library.addBookToLibrary("Harry Potter");
        bookReserver.reserveBook("Harry Potter");
        System.setOut(new PrintStream(outputReader));

        //when
        bookReserver.reserveBook("Harry Potter");
        String standardOutput = outputReader.toString().trim() ;

        //then
        assertThat(standardOutput,is("The book is currently not available")) ;


    }
}
