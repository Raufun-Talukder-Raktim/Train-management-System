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
public class Menu extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Menu
     */
    String User = null;
    String AccountNo = null;
    
    public Menu() {
        initComponents();
    }
    
    public Menu(String User , String AccountNo) {
        initComponents();
        
        this.User = User;
        this.AccountNo = AccountNo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_info = new javax.swing.JButton();
        menu_ticpur = new javax.swing.JButton();
        menu_ticcan = new javax.swing.JButton();
        menu_comm = new javax.swing.JButton();
        menu_prodetl = new javax.swing.JButton();
        menu_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Menu_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_info.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_info.setText("Information");
        menu_info.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menu_infoMouseMoved(evt);
            }
        });
        menu_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_infoActionPerformed(evt);
            }
        });
        getContentPane().add(menu_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 230, 50));

        menu_ticpur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_ticpur.setText("Ticket Purchase");
        menu_ticpur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ticpurActionPerformed(evt);
            }
        });
        getContentPane().add(menu_ticpur, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 230, 50));

        menu_ticcan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_ticcan.setText("Ticket Cancellation");
        menu_ticcan.setToolTipText("");
        menu_ticcan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ticcanActionPerformed(evt);
            }
        });
        getContentPane().add(menu_ticcan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 230, 50));

        menu_comm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_comm.setText("Comment");
        menu_comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_commActionPerformed(evt);
            }
        });
        getContentPane().add(menu_comm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 230, 50));

        menu_prodetl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_prodetl.setText("Project Details");
        menu_prodetl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_prodetlActionPerformed(evt);
            }
        });
        getContentPane().add(menu_prodetl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 230, 50));

        menu_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        getContentPane().add(menu_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BR Logo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 220, 300));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setText("Welcome to Bangladesh Railway");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 640, -1));

        Menu_icon.setBackground(new java.awt.Color(255, 255, 255));
        Menu_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Menu_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_commActionPerformed
        new Comment(User , AccountNo).setVisible(true);
        this.setVisible(false);   
        
        
    }//GEN-LAST:event_menu_commActionPerformed

    private void menu_prodetlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_prodetlActionPerformed
      
        new ProjectDetails(User , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_prodetlActionPerformed

    private void menu_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_infoActionPerformed
        
        new Information(User , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_infoActionPerformed

    private void menu_ticpurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ticpurActionPerformed
        
        new RootSelection(User , AccountNo).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_menu_ticpurActionPerformed

    private void menu_ticcanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ticcanActionPerformed
                
        new Cancelation_RootSelection(User , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_ticcanActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        
        int result = JOptionPane.showConfirmDialog(this,"Do you want to close ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
        if(result == JOptionPane.YES_OPTION){
           
              System.exit(0);              
        }   
    }//GEN-LAST:event_menu_exitActionPerformed

    private void menu_infoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_infoMouseMoved
        
        Cursor cursor;
        cursor = new Cursor(Cursor.HAND_CURSOR);
        menu_comm.setCursor(cursor);
        menu_prodetl.setCursor(cursor);
        menu_info.setCursor(cursor);
        menu_ticpur.setCursor(cursor);
        menu_ticcan.setCursor(cursor);
        menu_exit.setCursor(cursor);
    }//GEN-LAST:event_menu_infoMouseMoved

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton menu_comm;
    private javax.swing.JButton menu_exit;
    private javax.swing.JButton menu_info;
    private javax.swing.JButton menu_prodetl;
    private javax.swing.JButton menu_ticcan;
    private javax.swing.JButton menu_ticpur;
    // End of variables declaration//GEN-END:variables
}