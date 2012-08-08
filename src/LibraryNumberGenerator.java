import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class LibraryNumberGenerator {

    private long libraryNumber = 1111111;

    public static String formatLibraryNumber(long number) {

            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator('-');


            String template = "###,####";
            DecimalFormat formatter = new DecimalFormat(template, decimalFormatSymbols);
            formatter.setGroupingSize(4);
            String formattedLibraryNumber = formatter.format(number);
            return formattedLibraryNumber;
        }

    public void generateNewLibraryNumber(){
        libraryNumber = libraryNumber++;
    }
}
