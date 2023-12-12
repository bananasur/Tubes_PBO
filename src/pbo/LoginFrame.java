package pbo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    private final Rental_game rentalGame;

    // Use a JPanel for background image
    private final JPanel backgroundPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            // Load and draw the background image
            super.paintComponent(g);
            ImageIcon background = new ImageIcon("Welcomemage.jpg"); // Replace with your image file path
            g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
        }
    };

    // Use backgroundPanel as the content pane
    Container container = backgroundPanel;

    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");

    public LoginFrame(Rental_game rentalGame) {
        this.rentalGame = rentalGame;
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        // Set layout manager to FlowLayout
        backgroundPanel.setLayout(new FlowLayout());
    }

    public void setLocationAndSize() {
        // Adjust the position and size as needed
        userLabel.setPreferredSize(new Dimension(100, 20));
        passwordLabel.setPreferredSize(new Dimension(100, 20));
        userTextField.setPreferredSize(new Dimension(150, 20));
        passwordField.setPreferredSize(new Dimension(150, 20));
        showPassword.setPreferredSize(new Dimension(150, 20));
        loginButton.setPreferredSize(new Dimension(100, 20));
        resetButton.setPreferredSize(new Dimension(100, 20));
    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(userTextField);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText = userTextField.getText();
            String pwdText = new String(passwordField.getPassword());
            if (userText.trim().equalsIgnoreCase("admin") && pwdText.equals("123")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                this.setVisible(false);
                rentalGame.getFrame().dispose();
                // Handle the main frame creation here if needed
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }

        // Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }

        // Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}

