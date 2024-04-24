
# Modern Desktop UI Login System in Java Swing
This Modern Login System is a Java Swing-based graphical user interface (GUI) application that provides a simple and user-friendly login system. Users can easily log in with their predefined usernames and passwords. This project aims to offer a modern and sleek login experience for users while maintaining simplicity and ease of use.

## How it Works
The ModernLoginSystem consists of several Java classes:

- **Main.java:** The main class to start the application. It initializes the login page.
- **IDandPasswords.java:** Stores predefined usernames and passwords in a HashMap.
- **LoginPage.java:** Creates the login page with text fields for username and password, along with login and reset buttons. It validates user input and displays appropriate messages.
- **WelcomePage.java:** Displays a welcome message upon successful login and provides a clickable link to redirect users to a custom domain.

## Adding ID and Passwords
To add new ID and passwords, users can directly modify the `IDandPasswords.java` file. Simply add new entries to the logininfo HashMap with the desired username-password pairs.

```java
public IDandPasswords() {
    logininfo.put("username1", "password1");
    logininfo.put("username2", "password2");
    // Add more username-password pairs as needed
}
```

## Features
- **User-Friendly Interface:** The application provides a modern and sleek login interface with text fields and buttons for easy interaction.
- **Validation:** It validates user input for both username and password fields and displays appropriate messages for invalid input.
- **Reset Functionality:** Users can reset the input fields with the click of a button for convenience.
- **Welcome Message:** Upon successful login, users are greeted with a welcome message and provided with a clickable link to navigate to a custom domain.

## Usage
[Insert video sample of the working application here]

