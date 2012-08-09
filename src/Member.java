public class Member {

    private LibraryNumberGenerator libNumGen;
    private String password;
    private long newLibNum;
    private boolean loggedIn = false;


    public Member(LibraryNumberGenerator libNumGen, String password) {
        this.libNumGen = libNumGen;
        newLibNum = libNumGen.generateNewLibraryNumber();
        this.password = password;
        }

    public String getPassword() {
        return password;
    }

    public String getLibraryNumber() {
        return libNumGen.formatLibraryNumber(newLibNum);
    }

    public boolean memberLogIn(){
        return loggedIn = true;
    }

    public boolean checkIfLoggedIn() {
        return loggedIn;
    }
}
