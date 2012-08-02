import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();
    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
    }

    @Test
    public void testReturnsAllItemsInLibrary() throws Exception {
        //given
        library.addBookToLibrary("The Secret History");
        library.addBookToLibrary("The Night Circus");
        library.addBookToLibrary("50 Shades of Grey Bleuuurgh");

        //when
        ArrayList<Book> bookList = library.returnAllBooksInLibrary();

        //then
        assertThat(bookList.size(), is(3));

    }
}
