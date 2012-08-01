import java.util.ArrayList;

public class Library  {

    Notificator message = new Notificator();
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> returnAllBooksInLibrary() {
        return books;
    }

    public Book retrieveBook(String title) {
        for (Book book : books) {
            return book.retrieveBookByTitle(title);
        }

        return null;
    }
}
