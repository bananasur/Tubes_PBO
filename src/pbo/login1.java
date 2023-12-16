/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class login1 extends javax.swing.JFrame {

    /**
     * Creates new form login1
     */
    public login1() {
        initComponents();
        
        Dimension windows = Toolkit.getDefaultToolkit().getScreenSize();
        int x = windows.width / 2 - this.getSize().width / 2;
        int y = windows.width / 3 - this.getSize().width / 2;
        this.setLocation(x,y);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Usernamelabel = new javax.swing.JLabel();
        Passwordlabel = new javax.swing.JLabel();
        Loginbutton = new javax.swing.JButton();
        Resetbutton = new javax.swing.JButton();
        Closebutton = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Header1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Header.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setText("Welcome To Banana Shop");

        Usernamelabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Usernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        Usernamelabel.setText("Username");

        Passwordlabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Passwordlabel.setForeground(new java.awt.Color(255, 255, 255));
        Passwordlabel.setText("Password");

        Loginbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Loginbutton.setText("Login");
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });

        Resetbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Resetbutton.setText("Reset");
        Resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbuttonActionPerformed(evt);
            }
        });

        Closebutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Closebutton.setText("Close");
        Closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClosebuttonActionPerformed(evt);
            }
        });

        Header1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Header1.setForeground(new java.awt.Color(255, 255, 255));
        Header1.setText("Please Enter Your Login Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Loginbutton)
                .addGap(64, 64, 64)
                .addComponent(Resetbutton)
                .addGap(64, 64, 64)
                .addComponent(Closebutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usernamelabel)
                    .addComponent(Passwordlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Password))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Header)
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(Header1)
                    .addGap(80, 80, 80)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Header)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usernamelabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passwordlabel)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loginbutton)
                    .addComponent(Resetbutton)
                    .addComponent(Closebutton))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(Header1)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/WelcomeImage.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 0, 1350, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int loginAttempts = 0;
    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
        String username = Username.getText();
        String password = new String(Password.getPassword());
            boolean loginSuccess = false;

        while (loginAttempts < 3) {
            if (isValidUser(username, password)) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                loginSuccess = true;
                break;
            } else {
                loginAttempts++;
                JOptionPane.showMessageDialog(this, "Invalid username or password. Attempt " + loginAttempts + "/3");
                Username.setText("");
                Password.setText("");
                return;
            }
        }
        if (loginSuccess) {
            Rent rentFrame = new Rent();
            rentFrame.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(this, "Maximum login attempts reached. Exiting...");
            System.exit(0);
        }
    }//GEN-LAST:event_LoginbuttonActionPerformed

    private boolean isValidUser(String username, String password) {
        return username.equals("surya") && password.equals("banana");
    }
    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbuttonActionPerformed
        Username.setText("");
        Password.setText("");
    }//GEN-LAST:event_ResetbuttonActionPerformed

    private void ClosebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClosebuttonActionPerformed
      System.exit(0);
    }//GEN-LAST:event_ClosebuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new login1().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Closebutton;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Header1;
    private javax.swing.JButton Loginbutton;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JButton Resetbutton;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Usernamelabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
