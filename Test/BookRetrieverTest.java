import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookRetrieverTest {
    @Test
    public void testBookRetriever() throws Exception {
        //Given
        ArrayList<Book> books = new ArrayList<Book>();
        Book aBook = new Book("Harry Potter");
        books.add(aBook);
        Library library = new Library(books);
        BookRetriever bookRetriever= new BookRetriever(library);

        //When
        Book retrievedBook = bookRetriever.retrieveBooks("Harry Potter");

        //Then
        assertThat(aBook, is(retrievedBook));
    }

}
