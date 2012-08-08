import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LogInTest {
    private LogIn logIn;
    private LibraryNumberGenerator libraryNumberGenerator;
    @Before
    public void setUp() throws Exception {
        libraryNumberGenerator = new LibraryNumberGenerator();
        logIn =  new LogIn();
    }

    @Test
    public void testloggingIn() throws Exception {
        boolean attemptedLogIn = logIn.login(1111112, "superjunior");
        new Member(libraryNumberGenerator, "superjunior");
        assertThat(attemptedLogIn, is(true));
    }

}
