public class Notificator {

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!");
    }

    public void displayErrorMessageWhenSelectingNonValidOption() {
        System.out.println("The menu option you have selected is not valid");
    }

    public void displayReservationConfirmationMessage() {
        System.out.println("The reservation has been successful");
    }

    public void displayBookNotAvailableMessage() {
        System.out.println("The book is currently not available");
    }

    public void displayMenu(){
        System.out.println("Please choose an option from the following");
        System.out.println("[1] View all books");
        System.out.println("[2] Reserve book");
        System.out.println("[3] Retrieve a book");
        System.out.println("[4] Quit");

        System.out.println("\n>>");
    }
}
