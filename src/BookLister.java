import java.util.ArrayList;
import java.util.Scanner;

public class BookLister implements MenuInterface {

    private Notificator screenMessage;
    private Library library;

    public BookLister(Notificator screenMessage, Library library) {
        this.screenMessage = screenMessage;
        this.library = library;
    }

    public void runItems() {

        ArrayList<Book> bookList = library.returnAllBooksInLibrary();
        screenMessage.displayAllBooksInLibrary(bookList);
    }
}
