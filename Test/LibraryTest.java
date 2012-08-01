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
    private ArrayList<Book> books = new ArrayList<Book>();

    @Before
    public void setUp() throws Exception {
        library = new Library(books);
    }

    @Test
    public void testReturnsAllItemsInLibrary() throws Exception {
        //given
        books.add(new Book("The Secret History"));
        books.add(new Book("The Night Circus"));
        books.add(new Book("50 Shades of Grey Bleuuurgh"));

        //when
        ArrayList<Book> bookList = library.returnAllBooksInLibrary();

        //then
        assertThat(bookList.size(), is(3));


    }
}
