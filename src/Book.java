public class Book {

    private String title;
    private Boolean availability;
    private Notificator message = new Notificator();

    public Book(String title) {
        this.title = title;
        availability = true;
    }

    public void reserveBook() {
        if (availability) {
            availability = false;
            message.displayReservationConfirmationMessage();
        }
        else {
            message.displayBookNotAvailableMessage();
        }
    }

    public void printBook(){
        System.out.println("* " + title);
    }

    public String statusOfBook(){
        if (availability) {
            return "Available";
        } else {
            return "Reserved";
        }
    }

    public String getTitle() {
        return title;
    }
}
