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
        System.out.println("Please choose an option from the following");
        System.out.println("[1] View all books");
        System.out.println("[2] Reserve book");
        System.out.println("[3] Retrieve a book");
        System.out.println("[4] Check library number");
        System.out.println("[5] Quit");

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
}
