

import java.util.*;

public class Menu {

    private ArrayList<String> menuOptions = new ArrayList();
    private static Scanner input = new Scanner(System.in);
    private Notificator screenMessage;
    private Library library;


    public Menu() {
        menuOptions.add("View books");
        menuOptions.add("Reserve books");
        menuOptions.add("Get book");
        menuOptions.add("Quit");
    }

    public Menu(Library library, Notificator screenMessage){
        this.library = library;
        this.screenMessage = screenMessage;
    }



    public MenuInterface menuSelection(int selection) {

        MenuInterface menuInterface = null;

            switch (selection){
                case 1: menuInterface = new BookLister(screenMessage, library);
                    menuInterface.runItems();

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
                default: screenMessage.displayErrorMessageWhenSelectingNonValidOption();
            }

        return menuInterface;

    }
}

