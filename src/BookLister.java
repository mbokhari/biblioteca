import java.util.ArrayList;

public class BookLister implements MenuInterface {

    private Notificator screenMessage;
    private Library library;

    public BookLister(Notificator screenMessage, Library library) {
        this.screenMessage = screenMessage;
        this.library = library;
    }

    @Override
    public void runItems() {

        ArrayList<Book> bookList = library.returnAllBooksInLibrary();
        screenMessage.displayAllBooksInLibrary(bookList);

        //To change body of implemented methods use File | Settings | File Templates.
    }
}
