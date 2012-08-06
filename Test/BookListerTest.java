import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookListerTest {

    private BookLister bookLister;
    private Library library;
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Before
    public void setUp() {

        library = new Library();
        this.bookLister = new BookLister(library);

    }

    @Test
    public void testRunItem() throws Exception {

        //Given
        library.addBookToLibrary("The Secret History");
        System.setOut(new PrintStream(outputReader));

        //When
        bookLister.runItems();
        final String standardOutput = outputReader.toString().trim();

        //Then
        assertThat(standardOutput, is("Printing all books in Library\nThe Secret History"));
    }
}
