import java.util.ArrayList;

public class LogIn {
private ArrayList<LibraryNumberGenerator> libraryNumbers;
private ArrayList<Member> members;

    public LogIn() {
        this.libraryNumbers = new ArrayList<LibraryNumberGenerator>();
        this.members = new ArrayList<Member>();
    }

    public void librarianLogIn(long number) {
        String libraryNumberToBeChecked = LibraryNumberGenerator.formatLibraryNumber(number);

        if (number == 1111111) {
            System.out.println("You are the librarian!");
        }
        else if (libraryNumbers.contains(libraryNumberToBeChecked)) {

        }
    }
}
