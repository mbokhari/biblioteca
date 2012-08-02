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
}
