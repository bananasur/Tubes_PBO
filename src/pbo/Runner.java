//package pbo;
//
//import java.awt.Dimension;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.Timer;
//import pbo.login1; // Import the correct login form class
//
//public class Runner {
//
//    private static final JFrame FRAME = new JFrame();
//    private final ImageIcon icon;
//    private final JLabel L1;
//
//    public static JFrame getFrame() {
//        return FRAME;
//    }
//
//    public Runner() {
//        icon = new ImageIcon("WelcomeImage.jpg");
//        L1 = new JLabel(icon);
//        FRAME.setUndecorated(true);
//        FRAME.setSize(new Dimension(1000, 534));
//        FRAME.setLocationRelativeTo(null);
//        FRAME.add(L1);
//    }
//
//    public void showLoginForm() {
//        try {
//            Thread.sleep(1500);
//            login1 loginObject = new login1();
//            FRAME.getContentPane().removeAll();
//            FRAME.add(loginObject.getContentPane());
//            FRAME.getContentPane().revalidate();
//
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        Runner runner = new Runner();
//        Runner.FRAME.setVisible(true);
//
//        // Schedule a task to show the login form after 1.5 seconds
//        Timer timer = new Timer(1500, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                runner.showLoginForm();
//            }
//        });
//        timer.setRepeats(false); // Set to false to execute only once
//        timer.start();
//    }
//}
