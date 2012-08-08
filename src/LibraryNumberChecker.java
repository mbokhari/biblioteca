import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class LibraryNumberChecker implements MenuInterface {
    private Notificator screenMessage = new Notificator();

    @Override
    public void runItems() throws IOException {

        screenMessage.LibraryCheckerMessage();
    }

}
