import java.io.IOException;

public class BookRetriever implements MenuInterface {

    private Library library = new Library();
    private Notificator screenMessage = new Notificator();

    public BookRetriever(Library library) {
        this.library = library;
    }

    public Book retrieveBooks(String title) {
        for (Book book : library.returnAllBooksInLibrary()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        screenMessage.displayBookNotAvailableMessage();
        return null;
    }

    @Override
    public void runItems() throws IOException {

        screenMessage.printMessage("Please enter the title of the book you're trying to retrieve : ");

        InputReader inputReader = new InputReader();
        String titleOfBookYouWantToRetrieve = inputReader.readUserInputString();

        retrieveBooks(titleOfBookYouWantToRetrieve);
    }
}
