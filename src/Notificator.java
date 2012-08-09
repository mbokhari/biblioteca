import java.util.ArrayList;

public class Notificator {

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!");
    }

    public void displayErrorMessageWhenSelectingNonValidOption() {
        System.out.println("Select a valid option!!");
    }

    public void displayReservationConfirmationMessage() {
        System.out.println("Thank You! Enjoy the book");
    }

    public void displayBookNotAvailableMessage() {
        System.out.println("Sorry we don't have that book yet.");
    }

    public void displayMenu(){
        System.out.println("\n\n\nPlease choose an option from the following");
        System.out.println("[1] View all books");
        System.out.println("[2] View all movies");
        System.out.println("[3] Reserve book");
        System.out.println("[4] Retrieve a book");
        System.out.println("[5] Check library number");
        System.out.println("[6] Log In");
        System.out.println("[7] Quit");

        System.out.println("\n>>");
    }

    public void displayAllBooksInLibrary(ArrayList<Book> books) {
        System.out.println("Printing all books in Library");
        for (Book book : books) {
            book.printBook();
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void LibraryCheckerMessage() {
        System.out.println("Please talk to Librarian. Thank you.");
    }

    public void displayAllMoviesInLibrary(ArrayList<Movie> movies) {
        System.out.println("\nPrinting all movies in Library");
        for (Movie movie : movies) {
            movie.printMovie();
        }
    }
}
