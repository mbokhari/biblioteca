public class Book {

    private String title;
    private Boolean availability;
    private Notificator message = new Notificator();

    public Book(String title) {
        this.title = title;
        availability = true;
    }

    public void reserveBook(String title) {
        if ((this.title.equals(title)) && (availability)) {
            availability = false;
            message.displayReservationConfirmationMessage();
        }
        else {
            message.displayBookNotAvailableMessage();
        }
    }

    public void printBook(){
        System.out.println(title);
    }

    public String statusOfBook(){
        if (availability) {
            return "Available";
        } else {
            return "Reserved";
        }
    }

    public Book retrieveBookByTitle(String title) {
        if (this.title.equals(title));{
            return this;
        }
    }

    public String getTitle() {
        return title;
    }
}
