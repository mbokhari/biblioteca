import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    @Test
    public void testViewAllBooks() throws Exception {
        //given
        ArrayList<String> books = new ArrayList<String>();
        books.add("The Secret History");
        books.add("The Colour of Magic");
        Library library = new Library(books);

        //when
        ArrayList<String> allBooksInLibrary = library.returnAllBooksInLibrary();

        //then
        assertThat(allBooksInLibrary.size(), is(2));
    }

//    @Test
//    public void testReserveBook() throws Exception {
//
//    }
}
