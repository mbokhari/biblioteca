import sun.rmi.log.LogInputStream;

import java.io.IOException;
import java.util.*;

public class Menu {

    private ArrayList<String> menuOptions = new ArrayList();
    private static Scanner input = new Scanner(System.in);
    private Notificator screenMessage = new Notificator();
    private Library library;
    private LibraryNumberGenerator libraryNumberGenerator;

    public Menu(Library library, LibraryNumberGenerator libNumGen){
        this.library = library;
        this.libraryNumberGenerator = libNumGen;

        menuOptions.add("View books");
        menuOptions.add("Reserve books");
        menuOptions.add("Get book");
        menuOptions.add("Quit");
    }

    public MenuInterface menuSelection(int selection) throws IOException {

        MenuInterface menuInterface = null;

        switch (selection) {
            case 1:
                menuInterface = new BookLister(library);
                menuInterface.runItems();
                break;
            case 2:
                menuInterface = new MovieLister(library);
                menuInterface.runItems();
                break;
            case 3:
                System.out.println("You have chosen to reserve a book");
                menuInterface = new BookReserver(library);
                menuInterface.runItems();
                break;
            case 4:
                System.out.println("You have chosen to retrieve a book");
                menuInterface = new BookRetriever(library);
                menuInterface.runItems();
                break;
            case 5:
                menuInterface = new LibraryNumberChecker();
                menuInterface.runItems();
                break;
            case 6:
                menuInterface = new LogIn(library, libraryNumberGenerator);
                menuInterface.runItems();
                break;
            case 7:
                System.out.println("Quitting...");
                System.exit(1);
                break;
            default:
                screenMessage.displayErrorMessageWhenSelectingNonValidOption();
        }

        return menuInterface;
    }
}

