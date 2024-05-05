/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER C
 */
public class User_Comment extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Comment
     */
    
    int Serial_No = 0;
    int Check = 0;

    public User_Comment() {
        initComponents();
        
        String url="jdbc:mysql://127.0.0.1/comment";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from public";
            
            ResultSet res = stmt.executeQuery(sql); 
            Public_Comment.setModel(DbUtils.resultSetToTableModel(res));
            
            sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from private";
            
            res = stmt.executeQuery(sql); 
            Private_Comment.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comment = new javax.swing.JTextArea();
        Send = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Private_Comment = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Public_Comment = new javax.swing.JTable();
        Experience = new javax.swing.JTextField();
        Topic = new javax.swing.JTextField();
        Type = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Reply = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CommentIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 20));

        Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Name.setEnabled(false);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Comment");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 70, 20));

        Comment.setColumns(20);
        Comment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Comment.setRows(5);
        Comment.setToolTipText("Write your comment");
        Comment.setEnabled(false);
        jScrollPane1.setViewportView(Comment);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 170, 160));

        Send.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Send.setText("Send");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        getContentPane().add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, 140, 40));

        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 140, 40));

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 140, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Welcome to The Comment Section");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Topic of Comment");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Experience");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 100, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comm1.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1200, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ticket_logo.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Reply the Comment");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Comment Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 100, 20));

        Private_Comment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Topic", "Feelings", "Comment", "Reply"
            }
        ));
        Private_Comment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Private_CommentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Private_Comment);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 740, 120));

        Public_Comment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Topic", "Feelings", "Comment", "Reply"
            }
        ));
        Public_Comment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Public_CommentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Public_Comment);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 740, 130));

        Experience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Experience.setEnabled(false);
        getContentPane().add(Experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 170, 30));

        Topic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Topic.setEnabled(false);
        getContentPane().add(Topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 170, 30));

        Type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Type.setEnabled(false);
        getContentPane().add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 170, 30));

        Reply.setColumns(20);
        Reply.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Reply.setRows(5);
        jScrollPane4.setViewportView(Reply);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, 160));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Public Comments");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Private Comments");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Reply");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 60, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin_Logo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comm2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        CommentIcon.setBackground(new java.awt.Color(255, 255, 255));
        CommentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(CommentIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new AdminMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        
        if(Check == 0){
            JOptionPane.showMessageDialog(null, "Select a commnet !");
        }else{
            
        String url="jdbc:mysql://127.0.0.1/comment";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            if(Type.getText().equals("Public")){
                sql = "update public set Reply = '"+Reply.getText()+"' where Serial_No = '"+Serial_No+"'";
                stmt.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "The reply has been sent !");
                
            }else if(Type.getText().equals("Private")){
                sql = "update private set Reply = '"+Reply.getText()+"' where Serial_No = '"+Serial_No+"'";
                stmt.executeUpdate(sql);
            
                JOptionPane.showMessageDialog(null, "The reply has been sent !");
            }
            //stmt.executeUpdate(sql);
            
            //JOptionPane.showMessageDialog(null, "The reply has been sent !");
            
            sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from public";
            
            ResultSet res = stmt.executeQuery(sql); 
            Public_Comment.setModel(DbUtils.resultSetToTableModel(res));
            
            sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from private";
            
            res = stmt.executeQuery(sql); 
            Private_Comment.setModel(DbUtils.resultSetToTableModel(res));
            
            Check = 0;
            Serial_No = 0;
            Name.setText("");
            Experience.setText("");
            Topic.setText("");
            Type.setText("");
            Comment.setText("");
            Reply.setText("");
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
      }
    }//GEN-LAST:event_SendActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void Public_CommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Public_CommentMouseClicked
        // TODO add your handling code here:
        Type.setText("Pubic");
        Check = 1;
        int i = Public_Comment.getSelectedRow();
        TableModel model = Public_Comment.getModel();
        Serial_No = (int) model.getValueAt(i, 0);
        Name.setText((String) model.getValueAt(i, 1));
        Topic.setText((String) model.getValueAt(i, 2));
        Experience.setText((String) model.getValueAt(i, 3));
        Comment.setText((String) model.getValueAt(i, 4));
        Reply.setText((String) model.getValueAt(i, 5));
        
        String url="jdbc:mysql://127.0.0.1/comment";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from private";
            
            ResultSet res = stmt.executeQuery(sql); 
            Private_Comment.setModel(DbUtils.resultSetToTableModel(res));
            
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
    }//GEN-LAST:event_Public_CommentMouseClicked

    private void Private_CommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Private_CommentMouseClicked
        // TODO add your handling code here:
        Type.setText("Private");
        Check = 1;
        int i = Private_Comment.getSelectedRow();
        TableModel model = Private_Comment.getModel();
        Serial_No = (int) model.getValueAt(i, 0);
        Name.setText((String) model.getValueAt(i, 1));
        Topic.setText((String) model.getValueAt(i, 2));
        Experience.setText((String) model.getValueAt(i, 3));
        Comment.setText((String) model.getValueAt(i, 4));
        Reply.setText((String) model.getValueAt(i, 5));
        
        String url="jdbc:mysql://127.0.0.1/comment";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            
            sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from public";
            
            ResultSet res = stmt.executeQuery(sql); 
            Public_Comment.setModel(DbUtils.resultSetToTableModel(res));
            
        }catch(SQLException e){
        
            System.out.println(e);
        }
        
    }//GEN-LAST:event_Private_CommentMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        if(Check == 0){
            JOptionPane.showMessageDialog(null, "Select a comment to delete !");
            
        }else{
            
            String url="jdbc:mysql://127.0.0.1/comment";
            String user="root";
            String pass="";
            PreparedStatement ps = null;

            try{
                Connection conn= DriverManager.getConnection(url, user, pass);
                Statement stmt=conn.createStatement();
                String sql = null;
                
                if(Type.getText().equals("Public"))
                    sql = "delete from Public where Serial_No = '"+Serial_No+"'";
                else
                    sql = "delete from Private where Serial_No = '"+Serial_No+"'";
                
                int result = JOptionPane.showConfirmDialog(this,"Do you want to delete ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                if(result == JOptionPane.YES_OPTION){

                      PreparedStatement pstmt = conn.prepareStatement(sql);
                      pstmt.executeUpdate(sql); 
                      JOptionPane.showMessageDialog(null, "The comment has been deleted !");
                }
                
                sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from public";
            
                ResultSet res = stmt.executeQuery(sql); 
                Public_Comment.setModel(DbUtils.resultSetToTableModel(res));

                sql = "select Serial_No , Name , Topic , Experience , Comment , Reply from private";

                res = stmt.executeQuery(sql); 
                Private_Comment.setModel(DbUtils.resultSetToTableModel(res));

                Check = 0;
                Serial_No = 0;
                Name.setText("");
                Experience.setText("");
                Topic.setText("");
                Type.setText("");
                Comment.setText("");
                Reply.setText("");
            
             }catch(Exception e){}
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(User_Comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Comment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Comment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextArea Comment;
    private javax.swing.JLabel CommentIcon;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Experience;
    private javax.swing.JTextField Name;
    private javax.swing.JTable Private_Comment;
    private javax.swing.JTable Public_Comment;
    private javax.swing.JTextArea Reply;
    private javax.swing.JButton Send;
    private javax.swing.JTextField Topic;
    private javax.swing.JTextField Type;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
