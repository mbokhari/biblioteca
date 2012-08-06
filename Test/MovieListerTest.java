import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieListerTest {

        private MovieLister movieLister;
        private Library library;
        final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

        @Before
        public void setUp() {

            library = new Library();
            this.movieLister = new MovieLister(library);

        }

        @Test
        public void testRunItem() throws Exception {

            //Given
            library.addMovieToLibrary("Romeo & Juliet", "Baz Luhrmann", "7.3");
            System.setOut(new PrintStream(outputReader));

            //When
            movieLister.runItems();
            final String standardOutput = outputReader.toString().trim();

            //Then
            assertThat(standardOutput, is("Printing all movies in Library\nTitle: Romeo & Juliet   Director: Baz Luhrmann    Rating: 7.3"));
        }
    }
