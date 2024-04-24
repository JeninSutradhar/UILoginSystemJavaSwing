import java.util.HashMap;

/**
 * This class is used to store login information for a hypothetical program.
 * It has a HashMap field that stores the login information. The HashMap has
 * usernames as keys and passwords as values. The constructor initializes the
 * HashMap with some sample login information. The getLogininfo method returns
 * a copy of the HashMap.
 */
public class IDandPasswords {
    private HashMap<String, String> logininfo = new HashMap<>();

    /**
     * Constructor that initializes the HashMap with some sample login information.
     */
    public IDandPasswords() {
        logininfo.put("username", "password");
        logininfo.put("username2", "password2");
        logininfo.put("username3", "password3");
        logininfo.put("username4", "password4");
    }

    /**
     * Returns a copy of the HashMap that stores the login information.
     */
    public HashMap<String, String> getLogininfo() {
        return new HashMap<>(logininfo);
    }
}

