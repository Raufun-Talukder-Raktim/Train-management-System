package MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class SignIN extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form NewJFrame
     */
    int UserName_Match = 0;
    int Email_Match = 0;
    String FindDate = null;   
    
    public SignIN() {
        initComponents();
        
        String url="jdbc:mysql://127.0.0.1/ticket";
        String user="root";
        String pass="";
        PreparedStatement ps = null;
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql = null;
            sql = "select * from ticket_list";            
            ResultSet res = stmt.executeQuery(sql); 
            while(res.next()){
                FindDate = res.getString("Date");
                
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date CurrentDate = new Date();
                
                    Date GetDate = sdf.parse(FindDate);
                    
                    if(GetDate.compareTo(CurrentDate)<0){

                            try{
                                String sql2 =null;
                                sql2 = "delete from ticket_list where Date = '"+FindDate+"'";
                                
                                PreparedStatement pstmt = conn.prepareStatement(sql);

                                pstmt.executeUpdate(sql2);
                                
                                sql2 = "update all_tickets set Type = 'Visited' where Date = '"+FindDate+"'";

                                pstmt = conn.prepareStatement(sql);

                                pstmt.executeUpdate(sql2);

                            }catch(SQLException e){

                                JOptionPane.showMessageDialog(null, e);
                                System.out.println(e);

                            }
                        }
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
            }
            
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        SignIN = new javax.swing.JButton();
        SignUP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Bangladesh Railway Management System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 20, 660, 56));

        User.setFont(new java.awt.Font("DejaVu Serif", 0, 13)); // NOI18N
        User.setText("Username or Email Address");
        User.setBorder(null);
        User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserFocusGained(evt);
            }
        });
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 146, 215, 34));

        Password.setFont(new java.awt.Font("DejaVu Serif", 0, 13)); // NOI18N
        Password.setText("Password");
        Password.setBorder(null);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
        });
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 209, 215, 35));

        jSeparator1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 185, 215, 6));

        jSeparator2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 250, 215, 11));

        SignIN.setBackground(new java.awt.Color(204, 204, 204));
        SignIN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SignIN.setText("sign in");
        SignIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignINActionPerformed(evt);
            }
        });
        jPanel1.add(SignIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 311, 90, 33));

        SignUP.setBackground(new java.awt.Color(204, 204, 204));
        SignUP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SignUP.setText("sign up");
        SignUP.setPreferredSize(new java.awt.Dimension(73, 25));
        SignUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUPActionPerformed(evt);
            }
        });
        jPanel1.add(SignUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 311, 90, 33));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BR Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 85, 223, 309));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 146, -1, 34));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 209, -1, 35));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 85, -1, 0));

        ShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 263, 141, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserFocusGained
        User.setText("");
    }//GEN-LAST:event_UserFocusGained

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        Password.setText("");
    }//GEN-LAST:event_PasswordFocusGained

    private void SignUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUPActionPerformed
       new SignUP().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_SignUPActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    @SuppressWarnings("deprecation")
    private void SignINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignINActionPerformed
        // TODO add your handling code here:
        
        String AccountNo = null;
        String url="jdbc:mysql://127.0.0.1/useracconts";
        String user="root";
        String pass="";
        
        try{
            
            Connection conn= DriverManager.getConnection(url, user, pass);
            Statement stmt=conn.createStatement();
            String sql;
            sql = "select * from account where User_Name = '"+User.getText()+"' and Password = '"+Password.getText()+"'";
            ResultSet res = stmt.executeQuery(sql);
            UserName_Match = 0;
            Email_Match = 0;
            
            while(res.next()){
                AccountNo = res.getString("Account_No.");
                UserName_Match = 1;
            }        
  
        }catch(SQLException e){
        
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error !!!");
        }
        
        if(UserName_Match == 0)
            {
                try{
                    Connection conn= DriverManager.getConnection(url, user, pass);
                    Statement pstmt=conn.createStatement();
                    String sql1 = "select * from account where Email = '"+User.getText()+"' and Password = '"+Password.getText()+"'";
                    ResultSet res = pstmt.executeQuery(sql1);

                    while(res.next()){
                        AccountNo = res.getString("Account_No.");
                        Email_Match = 1;
                    }
                }catch(Exception e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Error !!!");
                }                
            }
        
        if(User.getText().isEmpty() || User.getText().equals("Username or Email Address")){
                JOptionPane.showMessageDialog(null, "Enter the Username or Email");
            }else if(Password.getText().isEmpty() || Password.getText().equals("Password")){
                JOptionPane.showMessageDialog(null, "Enter the Password");
            }else if(UserName_Match == 1 || Email_Match == 1){
                JOptionPane.showMessageDialog(null, "Sign in has been Successfully done");
                if(User.getText().equals("Admin")){
                    new AdminMenu().setVisible(true);
                }else{
                    new Menu(User.getText() , AccountNo).setVisible(true);
                }
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "The Username & Password do not matched");
            }
    }//GEN-LAST:event_SignINActionPerformed

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        // TODO add your handling code here:
        User.setText("");
    }//GEN-LAST:event_UserMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        // TODO add your handling code here:
        Password.setText("");
    }//GEN-LAST:event_PasswordMouseClicked

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if(ShowPassword.isSelected())
        {
            Password.setEchoChar((char) 0);
        }else{
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SignIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JButton SignIN;
    private javax.swing.JButton SignUP;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}