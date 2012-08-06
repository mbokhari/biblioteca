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

//    @Test
//    public void testCreateLibraryNumbers() throws Exception {
//        User user = new User();
//        User anotherUser = new User();
//        String returnedLibNum = user.returnLibraryNumber();
//        String anotherReturnedLibNum = anotherUser.returnLibraryNumber();
//        assertThat(returnedLibNum, is("11111x11"));
//        assertThat(anotherReturnedLibNum, is("11111x12"));
//    }
}
