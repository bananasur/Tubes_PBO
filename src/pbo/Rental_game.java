package pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rental_game {

    private static final JFrame FRAME = new JFrame();

    public static JFrame getFrame() {
        return FRAME;
    }

    public Rental_game() {
        ImageIcon icon = new ImageIcon("WelcomeImage.jpg");
        JLabel L1 = new JLabel(icon);

        FRAME.setUndecorated(true);
        FRAME.setSize(new Dimension(1000, 550));
        FRAME.setLocationRelativeTo(null);
        FRAME.add(L1);
    }

    public void showLoginFrame() {
        LoginFrame loginFrame = new LoginFrame(this);
        loginFrame.setTitle("Login Form");
        loginFrame.setBounds(10, 10, 370, 600);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setResizable(false);
        loginFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Rental_game rental_game = new Rental_game();
        Rental_game.FRAME.setVisible(true);

        // Use Timer to delay showing the login screen
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rental_game.showLoginFrame();
                Rental_game.FRAME.dispose();
            }
        });
        timer.setRepeats(false); // Make the timer run only once
        timer.start();
    }
}
