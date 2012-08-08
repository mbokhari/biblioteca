public class Member {

    private LibraryNumberGenerator libNum = new LibraryNumberGenerator();
    private String password = "";

    public Member(String password) {
        libNum.generateNewLibraryNumber();
        this.password = password;
    }
}
