import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookListerTest {

    private BookLister bookLister;
    private Library library;
    private ArrayList<Book> books = new ArrayList<Book>();
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Before
    public void setUp() {

        library = new Library(books);
        this.bookLister = new BookLister(library);

    }

    @Test
    public void testRunItem() throws Exception {

        //Given
        books.add(new Book("The Secret History"));
        System.setOut(new PrintStream(outputReader));

        //When
        bookLister.runItems();
        final String standardOutput = outputReader.toString().trim();

        //Then
        assertThat(standardOutput, is("Printing all books in Library\nThe Secret History"));
    }
}
