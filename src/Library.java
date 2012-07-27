import java.util.ArrayList;

public class Library {

    private ArrayList<String> books = new ArrayList<String>();

    public Library(ArrayList<String> books) {
        this.books = books;
    }

    public ArrayList<String> returnAllBooksInLibrary() {
        return books;
    }


}
