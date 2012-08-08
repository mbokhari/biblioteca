import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MemberTest {
    private LibraryNumberGenerator libNum;
    private Member member;

    @Before
    public void setUp() throws Exception {
        libNum = new LibraryNumberGenerator();
        member = new Member(libNum, "password");
    }


    //test to show everytime you add a new member, the library number increments by 1
    @Test
    public void testReturnLibraryNumber() throws Exception {
        String libraryNumber1 = member.getLibraryNumber();
        Member anotherMember = new Member(libNum, "cheekycheeky");
        String libraryNumber2 = anotherMember.getLibraryNumber();

        assertThat(libraryNumber1, is("111-1112"));
        assertThat(libraryNumber2, is("111-1113"));
    }

    @Test
    public void testReturnPassword() throws Exception {
        String returnedPassword = member.getPassword();
        assertThat(returnedPassword, is("password") );
    }
}
