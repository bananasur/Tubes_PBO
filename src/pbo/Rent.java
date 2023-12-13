/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Rent extends javax.swing.JFrame {

    /**
     * Creates new form Rent
     */
    
    
    public Rent() {
        initComponents();
        
    }
    
    @Override
    public String toString() {
        return "Customized toString: " + super.toString();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        gameoption = new javax.swing.JList<>();
        name = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chooselabel = new javax.swing.JLabel();
        Quantitybox = new javax.swing.JComboBox<>();
        quantitylabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Resetbutton = new javax.swing.JButton();
        quantitylabel1 = new javax.swing.JLabel();
        Durationbox = new javax.swing.JComboBox<>();
        Rent = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBackground(new java.awt.Color(209, 214, 216));
        container.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        gameoption.setFont(new java.awt.Font("Segoe UI Semibold", 1, 28)); // NOI18N
        gameoption.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Baldur Gate III", "Fifa 23", "Spiderman 2", "Cyberpunk", "God of War", "NBA2K24" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(gameoption);

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel1.setText("Please Enter Your Identity");

        jLabel2.setText("Name:");

        jLabel3.setText("Email");

        chooselabel.setText("Plese Choose Yourgame");

        Quantitybox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", " " }));

        quantitylabel.setText("Quantity");

        jLabel7.setText("Receipt");

        Resetbutton.setText("Reset");
        Resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbuttonActionPerformed(evt);
            }
        });

        quantitylabel1.setText("Duration (days)");

        Durationbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "4", "5", "6", "7", "8", "9", "10" }));

        Rent.setText("Rent");
        Rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(chooselabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(containerLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(containerLayout.createSequentialGroup()
                                                    .addComponent(Rent, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(containerLayout.createSequentialGroup()
                                            .addComponent(quantitylabel1)
                                            .addGap(26, 26, 26)
                                            .addComponent(Durationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(containerLayout.createSequentialGroup()
                                            .addComponent(quantitylabel)
                                            .addGap(61, 61, 61)
                                            .addComponent(Quantitybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chooselabel)
                    .addComponent(jLabel7))
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Resetbutton)
                            .addComponent(Rent))
                        .addGap(116, 116, 116))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Quantitybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitylabel))
                        .addGap(7, 7, 7)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitylabel1)
                            .addComponent(Durationbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 940, 490));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbo/mainmenu.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public int calculateTotalPrice(String selectedGame, int quantity, int duration) {
        if (selectedGame == null) {
        System.err.println("Error: Selected game is null");
        return -1; // or any other value indicating an error
    }
        // Define game prices
        int baldurPrice = 40000;
        int fifaPrice = 20000;
        int spidermanPrice = 40000;
        int cyberpunkPrice = 40000;
        int godOfWarPrice = 50000;
        int nba2k24Price = 20000;

        // Calculate total price based on the selected game
        switch (selectedGame) {
            case "Baldur Gate III":
                return baldurPrice * quantity * duration;
            case "Fifa 23":
                return fifaPrice * quantity * duration;
            case "Spiderman 2":
                return spidermanPrice * quantity * duration;
            case "Cyberpunk":
                return cyberpunkPrice * quantity * duration;
            case "God of War":
                return godOfWarPrice * quantity * duration;
            case "NBA2K24":
                return nba2k24Price * quantity * duration;
            default:
                return 0; // or any other value indicating an error
        }
    }
    
    //overloading
    private int calculateTotalPrice(String selectedGame, int quantity, int duration, double taxPercentage ) {
        int basePrice = calculateTotalPrice(selectedGame, quantity, duration);

        
        double tax = taxPercentage  / 100.0;
        double totalPriceWithTax = basePrice + (basePrice * tax);

        return (int) totalPriceWithTax;
}
    
    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed
    
    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // Reset the text area
    jTextArea1.setText("");
    
    // Reset other input fields if needed
    name.setText("");
    Email.setText("");
    gameoption.clearSelection();
    Quantitybox.setSelectedIndex(0);
    Durationbox.setSelectedIndex(0);
} 
    private void RentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentActionPerformed
        // Get selected game, quantity, and duration
    String selectedGame = gameoption.getSelectedValue();
    int quantity = Integer.parseInt(Quantitybox.getSelectedItem().toString());
    int duration = Integer.parseInt(Durationbox.getSelectedItem().toString());

    // Calculate total price based on the selected game
    double taxPercentage = 5.0;
    int totalPriceWithoutTax = calculateTotalPrice(selectedGame, quantity, duration);
    int totalPriceWithTax = calculateTotalPrice(selectedGame, quantity, duration, taxPercentage);

    // Get user information
    String enteredName = name.getText();
    String enteredEmail = Email.getText();
    
     // Validate user input
    if (enteredName.isEmpty() || enteredEmail.isEmpty() || selectedGame == null) {
        // Show JOptionPane pop-up for validation error
        JOptionPane.showMessageDialog(this, "Please enter your name, email, and select a game before renting.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if there is a validation error
    }

    // Get current date
    java.util.Date currentDate = new java.util.Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = sdf.format(currentDate);

    // Calculate expected return date
    Calendar cal = Calendar.getInstance();
    cal.setTime(currentDate);
    cal.add(Calendar.DAY_OF_MONTH, duration);
    String expectedReturnDate = sdf.format(cal.getTime());


    // Display information in the JTextArea
    jTextArea1.setText("Name\t\t: " + enteredName + "\n");
    jTextArea1.append("Email\t\t: " + enteredEmail + "\n");
    jTextArea1.append("Price without Tax\t: " + totalPriceWithoutTax + "\n");
    jTextArea1.append("Price with Tax\t\t: " + totalPriceWithTax + "\n");
    jTextArea1.append("Tax\t\t: " + taxPercentage + "%\n");
    jTextArea1.append("Expected Return\t: " + expectedReturnDate);
    }//GEN-LAST:event_RentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Durationbox;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Quantitybox;
    private javax.swing.JButton Rent;
    private javax.swing.JButton Resetbutton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel chooselabel;
    private javax.swing.JPanel container;
    private javax.swing.JList<String> gameoption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel quantitylabel;
    private javax.swing.JLabel quantitylabel1;
    // End of variables declaration//GEN-END:variables
}
