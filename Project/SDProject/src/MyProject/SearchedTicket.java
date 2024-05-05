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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER C
 */
public class SearchedTicket extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form TicketGenerate
     */
    String MobileNo = null;
    String SecretKeyword = null;
    ResultSet res = null;
    String User_Name = null;
    String AccountNo = null;
    
    public SearchedTicket() {
        initComponents();
    }

    SearchedTicket(String MobileNo , String SecretKeyword , String User_Name , String AccountNo) {
        initComponents();
        
        this.MobileNo = MobileNo;
        this.SecretKeyword = SecretKeyword;
        this.User_Name = User_Name;
        this.AccountNo = AccountNo;
        
        String url="jdbc:mysql://127.0.0.1/ticket";
        String user="root";
        String pass="";
        PreparedStatement ps = null;

        try{

           Connection conn= DriverManager.getConnection(url, user, pass);
           Statement stmt=conn.createStatement();
           String sql = null;

           sql = "select * from ticket_list where Mobile_Number = '"+MobileNo+"' and Keyword = '"+SecretKeyword+"'";
           res= stmt.executeQuery(sql); 

           while(res.next()){
                             TicketNo.setText(res.getString("Ticket_No."));
                             Train_Name.setText(res.getString("Train_Name"));
                             Bogie_No.setText(res.getString("Bogie_No."));            
                             Departure.setText(res.getString("Departure_Station"));
                             Arrival.setText(res.getString("Arrival_Station"));            
                             Journey_Date.setText(res.getString("Date"));            
                             Journey_Time.setText(res.getString("Time"));            
                             Class.setText(res.getString("Class"));
                             Fare.setText(res.getString("Fare"));
                             Pass_Number.setText(res.getString("Number_of_Tickets"));
                             Seat_No.setText(res.getString("Seat_No."));
                             
           }

        }catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
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

        Train_Name = new javax.swing.JTextField();
        Departure = new javax.swing.JTextField();
        Journey_Date = new javax.swing.JTextField();
        Class = new javax.swing.JTextField();
        Fare = new javax.swing.JTextField();
        Bogie_No = new javax.swing.JTextField();
        Arrival = new javax.swing.JTextField();
        Pass_Number = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Journey_Time = new javax.swing.JTextField();
        Seat_No = new javax.swing.JTextField();
        TicketNo = new javax.swing.JTextField();
        TicketIcon = new javax.swing.JLabel();
        Request = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TicketGenerate_icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Train_Name.setBackground(new java.awt.Color(239, 227, 175));
        Train_Name.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Train_Name.setEnabled(false);
        getContentPane().add(Train_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 160, 40));

        Departure.setBackground(new java.awt.Color(239, 227, 175));
        Departure.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Departure.setEnabled(false);
        getContentPane().add(Departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 160, 40));

        Journey_Date.setBackground(new java.awt.Color(239, 227, 175));
        Journey_Date.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Journey_Date.setEnabled(false);
        getContentPane().add(Journey_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 160, 40));

        Class.setBackground(new java.awt.Color(239, 227, 175));
        Class.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Class.setEnabled(false);
        getContentPane().add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 160, 40));

        Fare.setBackground(new java.awt.Color(239, 227, 175));
        Fare.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Fare.setEnabled(false);
        getContentPane().add(Fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 100, 40));

        Bogie_No.setBackground(new java.awt.Color(239, 227, 175));
        Bogie_No.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Bogie_No.setEnabled(false);
        getContentPane().add(Bogie_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 150, 40));

        Arrival.setBackground(new java.awt.Color(239, 227, 175));
        Arrival.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Arrival.setEnabled(false);
        Arrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrivalActionPerformed(evt);
            }
        });
        getContentPane().add(Arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 150, 40));

        Pass_Number.setBackground(new java.awt.Color(239, 227, 175));
        Pass_Number.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Pass_Number.setEnabled(false);
        getContentPane().add(Pass_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 160, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Taka");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 50, 40));

        Journey_Time.setBackground(new java.awt.Color(239, 227, 175));
        Journey_Time.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Journey_Time.setEnabled(false);
        getContentPane().add(Journey_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 150, 40));

        Seat_No.setBackground(new java.awt.Color(239, 227, 175));
        Seat_No.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Seat_No.setEnabled(false);
        getContentPane().add(Seat_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 150, 40));

        TicketNo.setBackground(new java.awt.Color(239, 227, 175));
        TicketNo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TicketNo.setEnabled(false);
        getContentPane().add(TicketNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 160, 40));

        TicketIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ticket.JPG"))); // NOI18N
        getContentPane().add(TicketIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 720, 390));

        Request.setBackground(new java.awt.Color(255, 255, 255));
        Request.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Request.setText("Request");
        Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestActionPerformed(evt);
            }
        });
        getContentPane().add(Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 190, 50));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jTextField1.setText("Request for Cancellation");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 640, -1));

        TicketGenerate_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(TicketGenerate_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestActionPerformed
        new GetMoneyAmount(MobileNo , Fare.getText() , SecretKeyword , User_Name , AccountNo).setVisible(true);
        dispose();
    }//GEN-LAST:event_RequestActionPerformed

    private void ArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrivalActionPerformed

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
            java.util.logging.Logger.getLogger(SearchedTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchedTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchedTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchedTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchedTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arrival;
    private javax.swing.JTextField Bogie_No;
    private javax.swing.JTextField Class;
    private javax.swing.JTextField Departure;
    private javax.swing.JTextField Fare;
    private javax.swing.JTextField Journey_Date;
    private javax.swing.JTextField Journey_Time;
    private javax.swing.JTextField Pass_Number;
    private javax.swing.JButton Request;
    private javax.swing.JTextField Seat_No;
    private javax.swing.JLabel TicketGenerate_icon;
    private javax.swing.JLabel TicketIcon;
    private javax.swing.JTextField TicketNo;
    private javax.swing.JTextField Train_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
