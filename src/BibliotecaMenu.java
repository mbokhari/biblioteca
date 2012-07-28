

import java.util.*;

public class BibliotecaMenu {

    private ArrayList<String> menuOptions = new ArrayList();
    private static Scanner input = new Scanner(System.in);
    private Notificator notifier = new Notificator();



    public BibliotecaMenu() {
        menuOptions.add("View books");
        menuOptions.add("Reserve books");
        menuOptions.add("Get book");
        menuOptions.add("Quit");
    }


    public ArrayList<String> returnAllMenuItems() {
        return menuOptions;
    }


    public void menuSelection(Library library, int selection) {

            switch (selection){
                case 1: System.out.println("You have chosen to view all the books in the library");
                    library.displayAllBooksInLibrary();
                    break;
                case 2: System.out.println("You have chosen to reserve a book\n Enter the title of the book you want to reserve:");
                    String reservingTitle = input.next();
                    library.reserveBook(reservingTitle);
                    break;
                case 3: System.out.println("You have chosen to retrieve a book");
                    String retrievingTitle = input.next();
                    library.retrieveBook(retrievingTitle);
                    break;
                case 4: System.out.println("Quitting...");
                    System.exit(1);
                    break;
                default: notifier.displayErrorMessageWhenSelectingNonValidOption();
            }
    }


}

