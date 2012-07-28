import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Test
    public void testPrintAllBooksInLibrary(){
        //given
        ArrayList<Book> books = new ArrayList<Book>();
        Book aBook = new Book("The Secret History");
        Book an0therBook = new Book("The Colour of Magic");
        books.add(aBook);
        books.add(an0therBook) ;
        Library library = new Library(books);
        System.setOut(new PrintStream(outputReader));

        //when
        library.returnAllBooksInLibrary();
        final String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("The Secret History\nThe Colour of Magic"));
    }

    @Test
    public void testReserveBook() throws Exception {
        //given
        ArrayList<Book> books = new ArrayList<Book>();
        Book aBook = new Book("Harry Potter");
        books.add(aBook);
        Library library = new Library(books);
        //when
        library.reserveBook("Harry Potter");
        //then
        assertThat(aBook.statusOfBook(), is("Reserved"));
    }

    @Test
    public void testRetrieveBook() {
        //given
        ArrayList<Book> books = new ArrayList<Book>();
        Book aBook = new Book("Harry Potter");
        books.add(aBook);
        Library library = new Library(books);

        //when
        Book retrievedBook = library.retrieveBook("Harry Potter");

        //then
        assertThat(aBook, is(retrievedBook));
    }
}
