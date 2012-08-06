import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String [ ] args) throws IOException {
        Library library = new Library();
        Notificator message = new Notificator();
        Scanner input = new Scanner(System.in);

        message.displayWelcomeMessage();

        message.displayMenu();
        int selection = input.nextInt();
        input.nextLine();

        Menu menu = new Menu(library);
        menu.menuSelection(selection);
    }

    //create a runner method so that my main method isn't soo long and tedious.
    //perhaps make another method which the main method calls to run all the other stuff
}
