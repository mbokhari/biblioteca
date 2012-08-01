import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BookReserverTest {

    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Test
    public void testReserveBook() throws Exception {
        //given
        ArrayList<Book> books = new ArrayList<Book>();
        Book aBook = new Book("Harry Potter");
        books.add(aBook);
        Library library = new Library(books);
        BookReserver bookReserver= new BookReserver(library,  new Notificator());
        //when
        bookReserver.reserveBook("Harry Potter");
        //then
        assertThat(aBook.statusOfBook(), is("Reserved"));
    }

    @Test
    public void testRunItem() throws Exception {

        //given
        InputReader inputReader = new InputReader();
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("The Secret History"));
        BookReserver bookReserver = new BookReserver(new Library(books), new Notificator());
        System.setOut(new PrintStream(outputReader));

        //when
        bookReserver.runItems();

        final String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is(""));
    }
}
