import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class BookReserver implements MenuInterface {

    private Library library = new Library(new ArrayList<Book>());
    private Notificator screenMessage = new Notificator();

    public BookReserver(Library library) {
        this.library = library;
        this.screenMessage = screenMessage;
    }

    public void runItems() throws IOException {
        screenMessage.printMessage("Please enter the title of the book you would like to reserve : \n>>");

        InputReader inputReader = new InputReader();
        String reservingTitle = inputReader.readUserInput();

        reserveBook(reservingTitle);
    }

    public void reserveBook(String title) {
        for (Book book : library.returnAllBooksInLibrary()) {
            if ((book.getTitle().equals(title)) && (book.statusOfBook().equals("Available"))) {
                book.reserveBook();
            }
            else {
                screenMessage.displayBookNotAvailableMessage();
            }
        }
    }
}
