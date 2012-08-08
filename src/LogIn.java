import java.util.ArrayList;

public class LogIn {
    private LibraryNumberGenerator libraryNumberGenerator = new LibraryNumberGenerator();
    private ArrayList<Member> members;
    private boolean loggedIn;

    public LogIn() {
        this.members = new ArrayList<Member>();
    }

    public boolean login(long number, String password) {
        Boolean valid;
        String formattedNumber = libraryNumberGenerator.formatLibraryNumber(number);

        for (Member member : members) {
            if ((formattedNumber.equals(member.getLibraryNumber())) && (member.getPassword().equals(password))) {
                return loggedIn = true;
            } else {
                return loggedIn = false;

            }
        }
        return loggedIn;
    }
}
