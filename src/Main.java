import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String [ ] args) throws IOException {
        Library library = new Library(new ArrayList<Book>());
        Notificator message = new Notificator();
        Scanner input = new Scanner(System.in);

        message.displayWelcomeMessage();

        message.displayMenu();
        int selection = input.nextInt();
        input.nextLine();

        Menu menu = new Menu(library, message);
        menu.menuSelection(selection);



    }
}
