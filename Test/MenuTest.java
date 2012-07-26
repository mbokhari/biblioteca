import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {

    @Test
    public void testSeeListOnMenu() throws Exception {
        //given
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("View books");
        menuOptions.add("Reserve books");
        menuOptions.add("Get book");
        menuOptions.add("Quit");
        BibliotecaMenu menu = new BibliotecaMenu(menuOptions);
        //when
        ArrayList<String> allMenuItems = menu.returnAllMenuItems();
        //then
        assertThat(allMenuItems.size(), is(4));

    }

//    @Test
//    public void testSelectMenuOption() throws Exception {
//
//    }

}
