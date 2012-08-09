import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckLibraryNumberTest {
    @Test
    public void testCheckLibraryNumber() throws Exception {
        //given
        Library library = new Library();
        library.addMember("whatever");
        final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();
        LibraryNumberChecker libraryNumberChecker = new LibraryNumberChecker(library);
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

    @Test
    public void testLoggedInMember() throws Exception {
        //given
        Library library = new Library();
        LibraryNumberGenerator libNumGen = new LibraryNumberGenerator();
        LogIn logInPage = new LogIn(library, libNumGen);
        LibraryNumberChecker libraryNumberChecker = new LibraryNumberChecker(library);
        final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

        //when
        library.addMember("whatever");
        logInPage.login(1111112, "whatever");
        System.setOut(new PrintStream(outputReader));
        libraryNumberChecker.runItems();
        String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("111-1112"));

    }
}
