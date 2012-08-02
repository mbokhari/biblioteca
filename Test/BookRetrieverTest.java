import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookRetrieverTest {
    private Library library;
    private BookRetriever bookRetriever ;

    @Before
    public void setUp() throws Exception {
        library = new Library();
        bookRetriever = new BookRetriever(library);

    }

    @Test
    public void testBookRetriever() throws Exception {
        //Given
        Book aBook = library.addBookToLibrary("Harry Potter");

        //When
        Book retrievedBook = bookRetriever.retrieveBooks("Harry Potter");

        //Then
        assertThat(aBook, is(retrievedBook));
    }

    @Test
    public void testCannotRetrieveBookThatIsNotInLibrary() throws Exception {
        //When
        final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputReader));
        bookRetriever.retrieveBooks("The Game Of Thrones");
        String standardOutput = outputReader.toString().trim() ;


        //Then
        assertThat(standardOutput, is("Sorry we don't have that book yet."));

    }
}
