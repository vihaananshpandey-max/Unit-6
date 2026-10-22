public class Account {
    public final String userName;
    public String displayName;
    private String password;
    private static int userNumber = 0;

    public Account(String userName, String displayName, String password) {
        this.userName = userName;
        this.displayName = displayName;
        this.password = password;
        userNumber++;
        System.out.println("User number: " + userNumber);
    }

}
