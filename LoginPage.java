import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.HashMap;

/**
 * This class creates a login page and allows the user to enter their user ID
 * and password to login. The login information is stored in a hash map
 * provided by the constructor. If the login is successful, the user is taken
 * to a welcome page.
 * 
 * @author Apoorva Lal
 */
public class LoginPage implements ActionListener {

    private JFrame frame;
    private JButton loginButton;
    private JButton resetButton;
    private JTextField userIDField;
    private JPasswordField userPasswordField;
    private JLabel userIDLabel;
    private JLabel userPasswordLabel;
    private JLabel messageLabel;

    /**
     * A hash map storing the login information. The keys are user IDs and
     * the values are the corresponding passwords.
     */
    private HashMap<String, String> logininfo;

    /**
     * Constructor for LoginPage.
     * 
     * @param loginInfoOriginal a hash map containing the login information. The
     * keys should be user IDs and the values should be the corresponding
     * passwords.
     */
    public LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;

        // Set the look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        userIDLabel = new JLabel("User id:");
        userIDLabel.setForeground(Color.WHITE);
        userIDLabel.setBounds(50, 100, 75, 25);
        frame.add(userIDLabel);

        userPasswordLabel = new JLabel("Password:");
        userPasswordLabel.setForeground(Color.WHITE);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        frame.add(userPasswordLabel);

        userIDField = new JTextField();
        userIDField.setBounds(125, 100, 200, 25);
        frame.add(userIDField);

        userPasswordField = new JPasswordField();
        userPasswordField.setBounds(125, 150, 200, 25);
        frame.add(userPasswordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        frame.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        frame.add(resetButton);

        messageLabel = new JLabel();
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setBounds(50, 250, 300, 25);
        frame.add(messageLabel);

        frame.setVisible(true);
    }

    /**
     * This method is called whenever the user clicks on a button,
     * checkbox, or other UI element that can generate an ActionEvent.
     * @param e the ActionEvent that occurred
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the user clicked the "Reset" button
        if (e.getSource() == resetButton) {
            // Clear the text fields
            userIDField.setText("");
            userPasswordField.setText("");
            // Clear the message label
            messageLabel.setText("");
        }

        // If the user clicked the "Login" button
        if (e.getSource() == loginButton) {
            // Get the user's input from the text fields
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            // If the login information is in the hash map
            if (logininfo.containsKey(userID)) {
                // If the password is correct
                if (logininfo.get(userID).equals(password)) {
                    // Set the message label to green text and display "Login Successful"
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful");

                    // Create a new WelcomePage and make it visible
                    new WelcomePage();

                    // Close the LoginPage
                    frame.dispose();
                } else {
                    // Set the message label to red text and display "Invalid Password"
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Invalid Password");
                }
            } else {
                // Set the message label to red text and display "Invalid User ID"
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Invalid User ID");
            }
        }
    }
}

