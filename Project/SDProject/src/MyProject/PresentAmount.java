/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER C
 */
public class PresentAmount extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Payment
     */
    String TicketNo = null;
    String MobileNumber = null;
    String Keyword = null;
    
    public PresentAmount() {
        initComponents();
                
    }
    
    public PresentAmount(String MobileNumber , String TicketNo, String PresentAmount , String Keyword) {
        initComponents();
        //this.TicketNo = TicketNo;
        this.Keyword = Keyword;
        this.MobileNumber = MobileNumber;
        this.TicketNo = TicketNo;
        Present_Amount.setText(PresentAmount);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        Present_Amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PaymentConfirmation_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setText("Present Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 50));

        OK.setBackground(new java.awt.Color(255, 255, 255));
        OK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 150, 40));

        Present_Amount.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Present_Amount.setEnabled(false);
        Present_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Present_AmountActionPerformed(evt);
            }
        });
        getContentPane().add(Present_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 200, 50));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel1.setText("Taka");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 40, 50));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        jLabel2.setText("Payment has been done");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 260, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel_mini.JPG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 30, 540, -1));

        PaymentConfirmation_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(PaymentConfirmation_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Present_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Present_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Present_AmountActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        
        JOptionPane.showMessageDialog(null, "Thanks for Your Payment");
        new TicketGenerate(TicketNo , Keyword , MobileNumber).setVisible(true);
        dispose();
    }//GEN-LAST:event_OKActionPerformed

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
            java.util.logging.Logger.getLogger(PresentAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentAmount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel PaymentConfirmation_Icon;
    private javax.swing.JTextField Present_Amount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
