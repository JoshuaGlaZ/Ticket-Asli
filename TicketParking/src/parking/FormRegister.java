/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parking;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class FormRegister extends javax.swing.JFrame implements Runnable {

    Socket clientSocket;
    Thread t;
    String email = "";
    String username = "";
    String password = "";
    String confirmPass = "";

    public FormRegister() {
        initComponents();
        try {
//            clientSocket = new Socket("kresnayangasli.my.id", 47780);
            clientSocket = new Socket("localhost", 6002);
        } catch (IOException ex) {
            Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (t == null) {
            t = new Thread(this, "Account Registration");
            t.start();
        }
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button_Register = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textfield_RegisterUsername = new javax.swing.JTextField();
        textfield_RegisterPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        textfield_RegisterConfirmPass = new javax.swing.JPasswordField();
        textfield_RegisterEmail = new javax.swing.JTextField();
        linkLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("If you don't have account yet,");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("E-mail :");

        button_Register.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Register.setText("REGISTER");
        button_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegisterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Already have an account?");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("please register first.");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Username :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Password :");

        textfield_RegisterUsername.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        textfield_RegisterPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Confirm Pass :");

        textfield_RegisterConfirmPass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        textfield_RegisterEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        linkLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        linkLogin.setText("Login here");
        linkLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkLoginMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkLoginMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(jLabel1)))
                                                .addGap(90, 90, 90))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel8))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(textfield_RegisterUsername,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(textfield_RegisterPassword,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(textfield_RegisterConfirmPass,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(button_Register,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(textfield_RegisterEmail,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                225,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(78, 78, 78)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(linkLogin)))
                                                .addGap(52, 52, 52)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(textfield_RegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textfield_RegisterUsername,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textfield_RegisterPassword,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(textfield_RegisterConfirmPass,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addComponent(button_Register)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(linkLogin))
                                .addContainerGap(24, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegisterActionPerformed(java.awt.event.ActionEvent evt) {
        email = textfield_RegisterEmail.getText();
        username = textfield_RegisterUsername.getText();
        password = new String(textfield_RegisterPassword.getPassword());
        confirmPass = new String(textfield_RegisterConfirmPass.getPassword());

        if (!password.equals(confirmPass)) {
            JOptionPane.showMessageDialog(this, "Gagal, Password tidak cocok !");
        } else if (password.equals(confirmPass)) {
            try {
                DataOutputStream sendToServer
                        = new DataOutputStream(clientSocket.getOutputStream());
                sendToServer.writeBytes("REGISTER~" + username + "~" + password + "~" + email + "\n");
            } catch (IOException ex) {
                Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void linkLoginMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        new FormLogin().setVisible(true);
    }// GEN-LAST:event_linkLoginMouseClicked

    private void linkLoginMouseEntered(java.awt.event.MouseEvent evt) {
        linkLogin.setForeground(Color.BLUE);
        linkLogin.setText("<html><u>Login here</u></html>");
    }// GEN-LAST:event_linkLoginMouseEntered

    private void linkLoginMouseExited(java.awt.event.MouseEvent evt) {
        linkLogin.setForeground(new Color(60, 63, 65));
        linkLogin.setText("Login here");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormRegister().setVisible(true);
        });
        try {

        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel linkLogin;
    private javax.swing.JPasswordField textfield_RegisterConfirmPass;
    private javax.swing.JTextField textfield_RegisterEmail;
    private javax.swing.JPasswordField textfield_RegisterPassword;
    private javax.swing.JTextField textfield_RegisterUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            while (true) {
                getMessage();
            }
        } catch (Exception e) {
            System.out.println("Error di Register > \"Run\" methods : " + e);
        }
    }

    public void getMessage() {
        try {
            String chatServer = "";
            BufferedReader chatFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            chatServer = chatFromServer.readLine();
            if (chatServer.equals("SUCCESS")) {
                JOptionPane.showMessageDialog(this, "Register success. You can login now.");
                FormLogin login = new FormLogin();
                login.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Register failed. Please try again.");
            }
        } catch (IOException ex) {
            System.out.println("Error di Register > \"GetMessage\" methods : " + ex);
        }
    }
}
