import java.io.IOException;
import java.util.ArrayList;

public class BookRetriever implements MenuInterface {

    private Library library = new Library(new ArrayList<Book>());

    public BookRetriever(Library library) {
        this.library = library;
    }

    public Book retrieveBooks(String title) {
        for (Book book : library.returnAllBooksInLibrary()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void runItems() throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
