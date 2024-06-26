/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

import java.awt.Cursor;
import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER C
 */
public class AdminMenu extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Menu
     */    
    public AdminMenu() {
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

        root_info = new javax.swing.JButton();
        User_Account = new javax.swing.JButton();
        menu_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TicketList = new javax.swing.JButton();
        CommentSection = new javax.swing.JButton();
        Menu_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        root_info.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        root_info.setText("Root Information");
        root_info.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                root_infoMouseMoved(evt);
            }
        });
        root_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                root_infoActionPerformed(evt);
            }
        });
        getContentPane().add(root_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 230, 50));

        User_Account.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        User_Account.setText("User Accounts");
        User_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_AccountActionPerformed(evt);
            }
        });
        getContentPane().add(User_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 230, 50));

        menu_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        getContentPane().add(menu_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BR Logo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 220, 300));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setText("Welcome to BR Admin Panel");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 640, -1));

        TicketList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TicketList.setText("Ticket List");
        TicketList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketListActionPerformed(evt);
            }
        });
        getContentPane().add(TicketList, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 230, 50));

        CommentSection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CommentSection.setText("User Comments");
        CommentSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommentSectionActionPerformed(evt);
            }
        });
        getContentPane().add(CommentSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 230, 50));

        Menu_icon.setBackground(new java.awt.Color(255, 255, 255));
        Menu_icon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Menu_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Menu_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void root_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_root_infoActionPerformed
        
        new Root_Info().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_root_infoActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        
        int result = JOptionPane.showConfirmDialog(this,"Do you want to close ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
        if(result == JOptionPane.YES_OPTION){
           
              System.exit(0);              
        }   
    }//GEN-LAST:event_menu_exitActionPerformed

    private void root_infoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_root_infoMouseMoved
        
        Cursor cursor;
        cursor = new Cursor(Cursor.HAND_CURSOR);
        User_Account.setCursor(cursor);
        root_info.setCursor(cursor);
        TicketList.setCursor(cursor);
        CommentSection.setCursor(cursor);
        menu_exit.setCursor(cursor);
    }//GEN-LAST:event_root_infoMouseMoved

    private void User_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_AccountActionPerformed
        // TODO add your handling code here:
        new User_Accounts().setVisible(true);
        dispose();
    }//GEN-LAST:event_User_AccountActionPerformed

    private void TicketListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketListActionPerformed
        // TODO add your handling code here:
        new Ticket_List().setVisible(true);
        dispose();
    }//GEN-LAST:event_TicketListActionPerformed

    private void CommentSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommentSectionActionPerformed
        // TODO add your handling code here:
        new User_Comment().setVisible(true);
        dispose();
    }//GEN-LAST:event_CommentSectionActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommentSection;
    private javax.swing.JLabel Menu_icon;
    private javax.swing.JButton TicketList;
    private javax.swing.JButton User_Account;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton menu_exit;
    private javax.swing.JButton root_info;
    // End of variables declaration//GEN-END:variables
}
