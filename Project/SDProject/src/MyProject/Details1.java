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
public class Details1 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Menu
     */ 
    String User_Name = null;
    String AccountNo = null;
       
    public Details1() {
        initComponents();
    }
    
     public Details1(String User_Name , String AccountNo) {
        initComponents();
        
        this.User_Name = User_Name;
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

        Skip = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Menu_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skip.setBackground(new java.awt.Color(255, 255, 255));
        Skip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Skip.setText("Skip");
        Skip.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SkipMouseMoved(evt);
            }
        });
        Skip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SkipMouseClicked(evt);
            }
        });
        Skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipActionPerformed(evt);
            }
        });
        getContentPane().add(Skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 170, 40));

        Next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Next.setText("Next");
        Next.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NextMouseMoved(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 170, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setText("Project Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 180, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 640, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jEditorPane1.setText("This project is on about the Railway Management System of Bangladesh . The project is developed for the railway passengers of our country who can use it . By using the project, the passengers can easily learn about all the information of their journey in details sitting at home . The passengers can also learn about the list of the trains for their destination and the day of availability of those trains with necessary information in details . The passengers can see the time schedule, number of sits and class information of their expected train . The passengers will get the necessary suggestions and instructions for their safe and comfortable journey . Then the passengers can buy the ticket for their journey. To buy the ticket, they have to provide some information about themself . After providing the necessary information, they need to pay money and confirm for the ticket . The passengers can cancel the purchased ticket if they face any problem or any emergency situation to cancel the journey . They also can return their money after cancelling the ticket with a penalty of money . The reversed case is also applicable. The passengers can purchase an urgent or emergency ticket if they face any problem or any emergency situation. In that case, they have to give an extra payment with the regular ticket's price . The passengers can provide any suggestion about the Railway Management System of Bangladesh and also can provide any objection against the system or against any particular issue . ");
        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 650, 340));

        Menu_icon.setBackground(new java.awt.Color(255, 255, 255));
        Menu_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Menu_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipActionPerformed
        
        new ProjectDetails(User_Name , AccountNo).setVisible(true);
        this.setVisible(false);
                 
    }//GEN-LAST:event_SkipActionPerformed

    private void SkipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SkipMouseClicked

    private void SkipMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SkipMouseMoved
        
        Cursor cursor;
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Skip.setCursor(cursor);
    }//GEN-LAST:event_SkipMouseMoved

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        
        new Details2(User_Name , AccountNo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NextActionPerformed

    private void NextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseMoved
        Cursor cursor;
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Next.setCursor(cursor);
    }//GEN-LAST:event_NextMouseMoved

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
            java.util.logging.Logger.getLogger(Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details1().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu_icon;
    private javax.swing.JButton Next;
    private javax.swing.JButton Skip;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
