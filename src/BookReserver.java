import java.util.ArrayList;
import java.util.Scanner;

public class BookReserver implements MenuInterface {

    private Library library;
    private static Scanner input = new Scanner(System.in);
    private Notificator screenMessage;

    public BookReserver(Library library, Notificator screenMessage) {
        this.library = library;
        this.screenMessage = screenMessage;
    }

    public void runItems() {
        screenMessage.printMessage("Please enter the title of the book you would like to reserve : \n>>");
        String reservingTitle = input.next();
        library.reserveBook(reservingTitle);
    }
}
