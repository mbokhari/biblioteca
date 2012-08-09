import java.io.IOException;

public class Main {

    //maybe use event objects and listeners to make things happen. May have to implement new interface or something along those lines.


    public static void main(String [ ] args) throws IOException {
        Library library = new Library();
        LibraryNumberGenerator libNumGen = new LibraryNumberGenerator();
        Menu menu = new Menu(library, libNumGen);
        Notificator message = new Notificator();
        InputReader inputReader = new InputReader();

        library.addBookToLibrary("The Hunger Games");
        library.addBookToLibrary("Hello");
        library.addMovieToLibrary("Avatar", "James Cameron", "8.0");

        message.displayWelcomeMessage();

        while(true) {
        message.displayMenu();
        int selection = inputReader.readUserInputInt();
        menu.menuSelection(selection);

        inputReader.backToMainMenu();
        }
    }
}
