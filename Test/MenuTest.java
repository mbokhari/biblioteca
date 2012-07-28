import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {
    final ByteArrayOutputStream outputReader = new ByteArrayOutputStream();

    @Test
    public void testSelectMenuOption() throws Exception {
        //given
        Library library = new Library(new ArrayList<Book>());
        BibliotecaMenu menu = new BibliotecaMenu();
        System.setOut(new PrintStream(outputReader));

        //when
        menu.menuSelection(library,1);
        final String standardOutput = outputReader.toString().trim();

        //then
        assertThat(standardOutput, is("You have chosen to view all the books in the library"));
    }
}
