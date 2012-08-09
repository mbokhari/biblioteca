import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class LibraryNumberChecker implements MenuInterface {
    private Notificator screenMessage = new Notificator();
    private Library library = new Library();
//    private LibraryNumberGenerator libNumGen = new LibraryNumberGenerator();
//    private LogIn logIn = new LogIn(library,libNumGen);

    public LibraryNumberChecker(Library library) {
        this.library = library;
//        this.libNumGen = libNumGen;
//        this.logIn = logIn;
    }

    @Override
    public void runItems() throws IOException {
        for (Member member : library.returnAllMembers()) {
            if
        }


        screenMessage.LibraryCheckerMessage();
    }



}
