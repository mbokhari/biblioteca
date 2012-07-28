import java.util.ArrayList;

public class Library  {

    Notificator message = new Notificator();
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void displayAllBooksInLibrary() {
        for (Book book : books) {
            book.printBook();
        }
    }


    public void reserveBook(String title) {
        for (Book book : books) {
            book.reserveBook(title);
        }
    }

    public void retrieveBook(String title) {
        for (Book book : books) {
            Book retrievedBook = book.retrieveBookByTitle(title);
        }
    }
}
