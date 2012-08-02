import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookRetrieverTest {
    private Library library;

    @Before
    public void setUp() throws Exception {
        library = new Library();
    }

    @Test
    public void testBookRetriever() throws Exception {
        //Given
        Book aBook = library.addBookToLibrary("Harry Potter");
        BookRetriever bookRetriever= new BookRetriever(library);

        //When
        Book retrievedBook = bookRetriever.retrieveBooks("Harry Potter");

        //Then
        assertThat(aBook, is(retrievedBook));
    }

}
