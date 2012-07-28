import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String [ ] args)
    {
        Library library = new Library(new ArrayList<Book>());
        Notificator message = new Notificator();
        Scanner input = new Scanner(System.in);

        message.displayWelcomeMessage();

        message.displayMenu();
        int selection = input.nextInt();
        input.nextLine();

        BibliotecaMenu menu = new BibliotecaMenu();
        menu.menuSelection(library,selection);



    }
}
