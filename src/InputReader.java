import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader {

    private Scanner input = new Scanner(System.in);

    public String readUserInputString() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        return userInput;
    }

    public int readUserInputInt() throws IOException {
        int userInput = input.nextInt();
        return userInput;
    }

    public boolean backToMainMenu() {
        String enter = input.nextLine();
        if (enter.equals("")) {
            return true;
        } else {
            return false;

        }
    }


}

