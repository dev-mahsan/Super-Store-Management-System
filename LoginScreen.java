package SSMSystem;

import DataBaseWork.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LoginScreen extends javax.swing.JFrame {

    static String email = "";

    public LoginScreen() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogin = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login");
        getContentPane().add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Email");
        getContentPane().add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password");
        getContentPane().add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        EmailTextField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        EmailTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 313, -1));

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        PasswordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 313, -1));

        LoginButton.setBackground(new java.awt.Color(0, 204, 51));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Login.png"))); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 130, -1));

        ExitButton.setBackground(new java.awt.Color(204, 0, 0));
        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit.png"))); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 130, -1));

        ShowPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login-BG-SSMS.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed

    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        boolean cond = true;
        email = EmailTextField.getText();
        String password = PasswordField.getText();

        if (EmailTextField.getText().equals("") || PasswordField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Either email or password field is empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (email.equals("admin@gmail.com") && password.equals("admin")) {
            EmailTextField.setText(null);
            PasswordField.setText(null);
            AdminOptionsScreen move1 = new AdminOptionsScreen();
            move1.setVisible(true);
        } else {
            String emp_email = "";
            String emp_pwd = "";
            try {
                Connection con = MySqlConnection.getCon();
                String query = "SELECT emp_email, emp_password FROM addemployee WHERE emp_email='" + email + "' AND emp_password='" + password + "'";
                Statement ps = con.createStatement();

                ResultSet rs = ps.executeQuery(query);
                if (rs.next()) {
                    PlaceCustomerOrderEmployee pco_move = new PlaceCustomerOrderEmployee();
//                    System.out.println("Check 1");
                    cond = false;
                    pco_move.setVisible(true);
//                        break;
                }
                if (cond) {
                    JOptionPane.showMessageDialog(null, "Either email or Password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
                    EmailTextField.setText("");
                    PasswordField.setText("");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Connection Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        int num;
        num = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit from application?", "Select", JOptionPane.YES_NO_OPTION);
        if (num == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        // TODO add your handling code here:
        if (ShowPassword.isSelected()) {
            PasswordField.setEchoChar((char) 0);
        } else {
            PasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}
