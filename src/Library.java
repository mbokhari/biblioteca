import java.util.ArrayList;

public class Library  {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public ArrayList<Book> returnAllBooksInLibrary() {
        return books;
    }

    public Book addBookToLibrary(String title){
        Book aBook = new Book(title);
        books.add(aBook);
        return aBook;
    }
}
