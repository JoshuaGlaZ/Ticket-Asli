/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package acara;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author louis
 */
public class FormProcess extends javax.swing.JFrame {

    /**
     * Creates new form FormProcess
     */
    public FormProcess(String eventId, String userId, Date startDate, Date endDate) {
       initComponents();
       labelEvent.setText(eventId);
       labelUser.setText(userId);
        Date currentDate = new Date();
        long currentMillis = currentDate.getTime();
        if(startDate.before(currentDate)){
            startDate.setTime(currentMillis+86400000);
            if(endDate.before(startDate)){
                endDate.setTime(currentMillis-86400000);
            }
        }
        jDateReservasi.setMinSelectableDate(startDate);
        jDateReservasi.setMaxSelectableDate(endDate);
        jDateReservasi.setDate(null);
        
        comboBoxJenisTicket.setSelectedIndex(0);
        labelHarga.setText("15000");
    }

    private FormProcess() {
        initComponents();
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
        jLabelPilihTiketDisini = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabelPilihTiketDisini2 = new javax.swing.JLabel();
        jLabelPilihTiketDisini3 = new javax.swing.JLabel();
        jLabelPilihTiketDisini4 = new javax.swing.JLabel();
        jLabelPilihTiketDisini5 = new javax.swing.JLabel();
        jDateReservasi = new com.toedter.calendar.JDateChooser();
        comboBoxJenisTicket = new javax.swing.JComboBox<>();
        labelUser = new javax.swing.JLabel();
        labelEvent = new javax.swing.JLabel();
        jLabelPilihTiketDisini10 = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabelPilihTiketDisini.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPilihTiketDisini.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabelPilihTiketDisini.setText("Event Ticket Reservation - Process");

        button1.setBackground(new java.awt.Color(153, 204, 255));
        button1.setLabel("Exit");

        jLabelPilihTiketDisini2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPilihTiketDisini2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabelPilihTiketDisini2.setText("ID User : ");

        jLabelPilihTiketDisini3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPilihTiketDisini3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabelPilihTiketDisini3.setText("ID Event : ");

        jLabelPilihTiketDisini4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPilihTiketDisini4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabelPilihTiketDisini4.setText("Tanggal Reservasi : ");

        jLabelPilihTiketDisini5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPilihTiketDisini5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabelPilihTiketDisini5.setText("Jenis Ticket : ");

        jDateReservasi.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateReservasiPropertyChange(evt);
            }
        });

        comboBoxJenisTicket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic", "Premium", "VIP" }));

        labelUser.setBackground(new java.awt.Color(0, 0, 0));
        labelUser.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        labelUser.setText("Query ID User ");

        labelEvent.setBackground(new java.awt.Color(0, 0, 0));
        labelEvent.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        labelEvent.setText("Query ID Event");

        jLabelPilihTiketDisini10.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPilihTiketDisini10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabelPilihTiketDisini10.setText("Harga : ");

        labelHarga.setBackground(new java.awt.Color(0, 0, 0));
        labelHarga.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        labelHarga.setText("Query Harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPilihTiketDisini2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPilihTiketDisini4)
                                    .addComponent(jLabelPilihTiketDisini5)
                                    .addComponent(jLabelPilihTiketDisini10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelHarga)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboBoxJenisTicket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(15, 15, 15))
                                    .addComponent(jDateReservasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(210, 210, 210))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPilihTiketDisini3)
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEvent)
                                    .addComponent(labelUser)))
                            .addComponent(jLabelPilihTiketDisini))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelPilihTiketDisini)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPilihTiketDisini3)
                    .addComponent(labelEvent))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPilihTiketDisini2)
                    .addComponent(labelUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPilihTiketDisini4)
                    .addComponent(jDateReservasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPilihTiketDisini5)
                    .addComponent(comboBoxJenisTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPilihTiketDisini10)
                    .addComponent(labelHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateReservasiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateReservasiPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateReservasiPropertyChange

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
            java.util.logging.Logger.getLogger(FormProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JComboBox<String> comboBoxJenisTicket;
    private com.toedter.calendar.JDateChooser jDateReservasi;
    private javax.swing.JLabel jLabelPilihTiketDisini;
    private javax.swing.JLabel jLabelPilihTiketDisini10;
    private javax.swing.JLabel jLabelPilihTiketDisini2;
    private javax.swing.JLabel jLabelPilihTiketDisini3;
    private javax.swing.JLabel jLabelPilihTiketDisini4;
    private javax.swing.JLabel jLabelPilihTiketDisini5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEvent;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelUser;
    // End of variables declaration//GEN-END:variables
}
