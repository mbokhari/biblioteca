import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Test
    public void testSelectMenuOption() throws Exception {
        //given
        Library library = new Library();
        library.addBookToLibrary("The Secret History");
        Menu menu = new Menu(library);
        System.setOut(new PrintStream(outputReader));

        //when
        menu.menuSelection(1);
        final String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("Printing all books in Library\nThe Secret History"));
    }
//
}
