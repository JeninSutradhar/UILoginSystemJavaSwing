import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.awt.Desktop;

/**
 * WelcomePage.java
 * This class creates a welcome page that appears when the user logs in
 * successfully. The page displays a message and a link to our website.
 * 
 * @author jeninsutradhar@gmail.com
 */
public class WelcomePage {
    /**
     * Constructor to create a welcome page.
     */
    public WelcomePage() {
        // Create a new JFrame and set its title to "Welcome"
        JFrame welcomeFrame = new JFrame("Welcome");

        // Set the default operation for the window to DISPOSE_ON_CLOSE
        // When the user closes the window, the program will end
        welcomeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set the size of the window to 400x150
        welcomeFrame.setSize(400, 150);

        // Set the background color of the window to DARK_GRAY
        welcomeFrame.getContentPane().setBackground(Color.DARK_GRAY);

        // Set the layout of the window to null
        // This is because we will be setting the location of each component explicitly
        welcomeFrame.setLayout(null);

        // Create a new JLabel to display the greeting message
        JLabel greetingLabel = new JLabel("<html>Welcome! You have successfully logged in. Click <a href='http://www.example.com'>here</a> to visit our website.</html>");

        // Set the foreground color of the label to WHITE
        greetingLabel.setForeground(Color.WHITE);

        // Set the location and size of the label
        greetingLabel.setBounds(50, 50, 300, 25);

        // Set the cursor of the label to a hand cursor
        // This indicates that the link is clickable
        greetingLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Add an event listener to the label
        // When the user clicks on the label, open our website in their default browser
        greetingLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.example.com"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Add the label to the window
        welcomeFrame.add(greetingLabel);

        // Make the window visible
        welcomeFrame.setVisible(true);
    }
}


