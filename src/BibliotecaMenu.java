

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
//       System.out.println(menuOptions);
    }


    public void menuSelection(int selection) {
//            selection = input.nextInt();
//            input.nextLine();

            switch (selection){
                case 1: System.out.println("You have chosen to view all the books in the library");
                    this.returnAllMenuItems();
                    break;
                case 2: System.out.println("You have chosen to reserve a book");
                    this.reserveBook();
                    break;
                case 3: System.out.println("You have chosen to retrieve a book");
                    this.retrieveBook();
                    break;
                case 4: System.out.println("Quitting...");
                    System.exit(1);
                    break;
                default: notifier.displayErrorMessageWhenSelectingNonValidOption();
            }
    }

    public void reserveBook() {

    }

    public void retrieveBook() {

    }
}

