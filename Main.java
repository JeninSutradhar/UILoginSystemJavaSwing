public class Main {
    /**
     * The entry point of the program.
     * This method creates an instance of IDandPasswords,
     * which stores the login information,
     * and uses it to create a LoginPage.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords(); // Create an instance of IDandPasswords
        LoginPage loginPage = new LoginPage(idandPasswords.getLogininfo()); // Create a LoginPage using the login information
    }

}
