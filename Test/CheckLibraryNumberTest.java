import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckLibraryNumberTest {
    @Test
    public void testCheckLibraryNumber() throws Exception {
        //given
        final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();
        LibraryNumberChecker libraryNumberChecker = new LibraryNumberChecker();
        System.setOut(new PrintStream(outputReader));

        //when
        libraryNumberChecker.runItems();
        String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("Please talk to Librarian. Thank you."));
    }

    @Test
    public void testFormatLibNum() throws Exception {
        //given
        LibraryNumberGenerator libraryNumberGenerator = new LibraryNumberGenerator();

        //when
        String s = libraryNumberGenerator.formatLibraryNumber(1112345);

        //then
        assertThat(s, is("111-2345"));

    }
}
