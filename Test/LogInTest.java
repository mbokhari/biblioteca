import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LogInTest {
    private LogIn logInPage;
    private Library library;
    private LibraryNumberGenerator libraryNumberGenerator;
    @Before
    public void setUp() throws Exception {
        libraryNumberGenerator = new LibraryNumberGenerator();
        library = new Library();
        logInPage =  new LogIn(library, libraryNumberGenerator);

    }

    @Test
    public void testLoggingIn() throws Exception {
        Member aMember = library.addMember("superjunior");
        logInPage.login(1111112, "superjunior");

        assertThat(aMember.checkIfLoggedIn(), is(true));
    }

}
