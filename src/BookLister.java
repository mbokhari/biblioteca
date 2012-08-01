import java.util.ArrayList;
import java.util.Scanner;

public class BookLister implements MenuInterface {

    private Notificator screenMessage = new Notificator();
    private Library library;

    public BookLister(Library library) {
        this.library = library;
    }

    public void runItems() {

        ArrayList<Book> bookList = library.returnAllBooksInLibrary();
        screenMessage.displayAllBooksInLibrary(bookList);
    }
}
