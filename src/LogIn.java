import java.io.IOException;
import java.util.ArrayList;

public class LogIn implements MenuInterface{
    private Library library = new Library();
    private LibraryNumberGenerator libraryNumberGenerator;
    private Notificator screenMessage = new Notificator();

    public LogIn(Library library, LibraryNumberGenerator libNumGen) {
        this.library = library;
        libraryNumberGenerator = libNumGen;
    }

    public void login(long number, String password) {
        String formattedNumber = libraryNumberGenerator.formatLibraryNumber(number);

        for (Member member : library.returnAllMembers()) {
            if (member.getLibraryNumber().equals(formattedNumber)) {
                member.memberLogIn(password);
            }
        }

    }

    @Override
    public void runItems() throws IOException {

        screenMessage.printMessage("Please enter your library number\n>>");

        InputReader inputReader = new InputReader();
        long libraryNumber = inputReader.readUserInputInt();

        screenMessage.printMessage("Please enter your password\n>>");
        String password = inputReader.readUserInputString();

        login(libraryNumber,password);
    }


}
