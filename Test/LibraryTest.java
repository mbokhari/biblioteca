import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();





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
