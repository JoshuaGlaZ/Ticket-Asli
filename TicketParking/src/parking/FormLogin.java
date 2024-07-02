/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parking;

import java.awt.Color;
import com.ticket.services.TicketWebService;
import com.ticket.services.TicketWebService_Service;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class FormLogin extends javax.swing.JFrame implements Runnable {

    Socket clientSocket;
    Thread t;
    String username;
    String password;

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        textfield_LoginUsername = new javax.swing.JTextField();
        textfield_LoginPassword = new javax.swing.JPasswordField();
        button_Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        linkRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Password :");

        textfield_LoginUsername.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        textfield_LoginPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        button_Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Login.setText("LOG IN");
        button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_LoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Don't have account yet?");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Please Login First");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Username :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Parking System 2077");

        linkRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        linkRegister.setText("Create now");
        linkRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkRegisterMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfield_LoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfield_LoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(linkRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel5)))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textfield_LoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textfield_LoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_Login)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(linkRegister))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkRegisterMouseClicked
        this.setVisible(false);
        new FormRegister().setVisible(true);
    }//GEN-LAST:event_linkRegisterMouseClicked

    private void linkRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkRegisterMouseEntered
        linkRegister.setForeground(Color.BLUE);
        linkRegister.setText("<html><u>Create now</u></html>");
    }//GEN-LAST:event_linkRegisterMouseEntered

    private void linkRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkRegisterMouseExited
        linkRegister.setForeground(new Color(60, 63, 65));
        linkRegister.setText("Create now");
    }//GEN-LAST:event_linkRegisterMouseExited

    private void button_LoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button_LoginActionPerformed
        username = textfield_LoginUsername.getText();
        password = new String(textfield_LoginPassword.getPassword());
        try {
            DataOutputStream sendToServer = new DataOutputStream(clientSocket.getOutputStream());
            sendToServer.writeBytes("LOGIN~" + username + "~" + password + "\n");
        } catch (IOException ex) {
            Logger.getLogger(FormRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel linkRegister;
    private javax.swing.JPasswordField textfield_LoginPassword;
    private javax.swing.JTextField textfield_LoginUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            while (true) {
                getMessage();
            }
        } catch (Exception e) {
            System.out.println("Error di Login > \"Run\" methods : " + e);
        }
    }

    public void getMessage() {
        try {
            String chatServer = "";
            BufferedReader chatFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            chatServer = chatFromServer.readLine();
            if (chatServer.equals("SUCCESS")) {
                JOptionPane.showMessageDialog(this, "Login success.");
                FormReserve parkReservation = new FormReserve();
                parkReservation.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Register failed. Please try again.");
            }
        } catch (IOException ex) {
            System.out.println("Error di Register > \"GetMessage\" methods : " + ex);
        }
    }
}
