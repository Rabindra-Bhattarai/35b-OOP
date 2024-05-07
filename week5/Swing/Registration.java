import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame {
    private JTextField firstNameField, lastNameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public Registration() {
        setTitle("Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel firstNameLabel = new JLabel("First Name:");
        add(firstNameLabel);
        firstNameField = new JTextField();
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        add(lastNameLabel);
        lastNameField = new JTextField();
        add(lastNameField);

        JLabel emailLabel = new JLabel("Email:");
        add(emailLabel);
        emailField = new JTextField();
        add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel());
        registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
        add(registerButton);

        setVisible(true);
    }

    private void register() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Here you can add code to handle registration logic,
        // such as saving the data to a file or database.

        // For demonstration, let's just print the values.
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);

        // Optionally, you can show a dialog or message confirming registration.
        JOptionPane.showMessageDialog(this, "Registration Successful!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Registration();
            }
        });
    }
}
