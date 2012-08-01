import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookListerTest {

    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Test
    public void testRunItem() throws Exception {

        //Given

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The Secret History"));
        BookLister bookLister = new BookLister(new Notificator(),new Library(books));
        System.setOut(new PrintStream(outputReader));

        //When
        bookLister.runItems();
        final String standardOutput = outputReader.toString().trim();

        //Then
        assertThat(standardOutput, is("Printing all books in Library\nThe Secret History"));
    }
}
