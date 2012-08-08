public class Member {

    private LibraryNumberGenerator libNum = new LibraryNumberGenerator();
    private String password;
    private long newLibNum;

    public Member(LibraryNumberGenerator libNum, String password) {
        newLibNum = libNum.generateNewLibraryNumber();
        this.password = password;
        }

    public String getPassword() {
        return password;
    }

    public String getLibraryNumber() {
        return libNum.formatLibraryNumber(newLibNum);
    }
}
