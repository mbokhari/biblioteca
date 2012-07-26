public class Notificator {

    public void DisplayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!");
    }

    public void DisplayErrorMessageWhenSelectingNonValidOption() {
        System.out.println("The menu option you have selected is not valid");
    }

    public void displayReservationConfirmationMessage() {
        System.out.println("The reservation has been successful");
    }

    public void displayBookNotAvailableMessage() {
        System.out.println("The book is currently not available");
    }
}
