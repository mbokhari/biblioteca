import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    private Movie aMovie;


    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    @Test
    public void testPrintMovie() throws Exception {
        aMovie = new Movie("The Matrix", "Andy Wachowski", "8.7");
        System.setOut(new PrintStream(byteArrayOutputStream));
        aMovie.printMovie();
        String standardOutput = byteArrayOutputStream.toString().trim();
        assertThat(standardOutput, is("Title: The Matrix   Director: Andy Wachowski    Rating: 8.7"));

    }

    @Test
    public void testDefaultRating() throws Exception {
        aMovie = new Movie("The Lord of the Rings", "Christopher Nolan", "");
        System.setOut(new PrintStream(byteArrayOutputStream));
        aMovie.printMovie();
        String standardOutput = byteArrayOutputStream.toString().trim();
        assertThat(standardOutput, is("Title: The Lord of the Rings   Director: Christopher Nolan    Rating: N/A"));
    }

    @Test
    public void testSetRating() throws Exception {
        aMovie = new Movie("The Lord of the Rings", "Christopher Nolan", "");
        aMovie.setRating(8.7);
        System.setOut(new PrintStream(byteArrayOutputStream));
        aMovie.printMovie();
        String standardOutput = byteArrayOutputStream.toString().trim();
        assertThat(standardOutput, is("Title: The Lord of the Rings   Director: Christopher Nolan    Rating: 8.7"));


    }
}
