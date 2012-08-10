public class Member {

    private LibraryNumberGenerator libNumGen;
    private String password;
    private long newLibNum;
    private boolean loggedIn = false;
    private Notificator screenMessage = new Notificator();


    public Member(LibraryNumberGenerator libNumGen, String password) {
        this.libNumGen = libNumGen;
        newLibNum = libNumGen.generateNewLibraryNumber();
        this.password = password;
        }

    public String getPassword() {
        return password;
    }

    public void printLibraryNumber() {
        screenMessage.printMessage(getLibraryNumber());
    }

    public String getLibraryNumber() {
        return libNumGen.formatLibraryNumber(newLibNum);

    }

    public boolean memberLogIn(String password){
        if (this.password.equals(password)) {
            screenMessage.printMessage("You are now logged in.");
            return loggedIn = true;
        }
        else {
            screenMessage.printMessage("Log in has been unsuccessful. The library number/password entered is incorrect.");
        }
        return loggedIn;
    }

    public boolean checkIfLoggedIn() {
        return loggedIn;
    }
}
