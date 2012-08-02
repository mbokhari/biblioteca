import java.io.IOException;

public class LibraryNumberChecker implements MenuInterface {
    Notificator screenMessage = new Notificator();

    @Override
    public void runItems() throws IOException {

        screenMessage.LibraryCheckerMessage();
    }
}
