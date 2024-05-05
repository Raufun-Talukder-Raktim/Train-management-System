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
public class SureCash_PaymentConfirmation extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Payment
     */
    int PresentAmount = 0;
    int Cost = 0;
    String Rest_Amount = null;
    String user="root";
    String pass="";
    
    String PaymentMedium = null;
    String Pass_Name = null;
    String Age = null;
    String MobileNo = null;
    String Gender = null;
    String TrainName = null;
    String Departure = null;
    String Arrival = null;
    String BogieNo = null;
    String Class = null; 
    String Date = null;
    String Time = null;
    String Keyword = null;
    String SeatNo = null;
    String Temp_SeatNo = null;
    String Passenger_Number = null;
    String User = null;
    String AccountNo = null;
        
    int Value = 100001;
    String TicketNo = null;
    
    String Account_MobileNumber = null;
    
    public SureCash_PaymentConfirmation() {
        initComponents();
    }
    
    public SureCash_PaymentConfirmation(String User , String AccountNo , String Amount , String Account_MobileNumber , String Medium , String Pass_Name , String Age , String MobileNo , String Gender , String TrainName , String Departure , String Arrival , String BogieNo , String Class , String Fare , String Date , String Time , String Keyword  , String SeatNo , String Temp_SeatNo , int Passenger_Number) {
        initComponents();
        
        CurrentAmount.setText(Amount);
        PaymentMedium = Medium;
        this.Account_MobileNumber = Account_MobileNumber;
        this.Pass_Name = Pass_Name;
        this.Age = Age;
        this.MobileNo = MobileNo;
        this.Gender = Gender;
        this.TrainName = TrainName;
        this.Departure = Departure;
        this.Arrival = Arrival;
        this.BogieNo = BogieNo;
        this.Class = Class;
        this.Fare.setText(Fare);
        this.Date = Date;
        this.Time = Time;
        this.Keyword = Keyword;
        this.SeatNo = SeatNo;
        this.Temp_SeatNo = Temp_SeatNo;
        this.Passenger_Number = String.valueOf(Passenger_Number);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pay = new javax.swing.JButton();
        CurrentAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Fare = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PaymentConfirmation_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Payment Confirmation");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel_mini.JPG"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setText("Present Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 50));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setText("Ticket Prize");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 130, 50));

        Pay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pay.setText("Pay");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });
        getContentPane().add(Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 150, 40));

        CurrentAmount.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        CurrentAmount.setEnabled(false);
        CurrentAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentAmountActionPerformed(evt);
            }
        });
        getContentPane().add(CurrentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 200, 50));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setText("Taka");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, 50));

        Fare.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        Fare.setEnabled(false);
        Fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FareActionPerformed(evt);
            }
        });
        getContentPane().add(Fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 200, 50));

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, 40));

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel1.setText("Taka");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 40, 50));

        PaymentConfirmation_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(PaymentConfirmation_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CurrentAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrentAmountActionPerformed

    private void FareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FareActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        
        PresentAmount = Integer.parseInt(CurrentAmount.getText());
        Cost = Integer.parseInt(Fare.getText());
        
        if(PresentAmount >= Cost){
        
            int result = JOptionPane.showConfirmDialog(this,"Do you want to Buy the Ticket ?","Confirm",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                
            if(result == JOptionPane.OK_OPTION){
                
                String url="jdbc:mysql://127.0.0.1/ticket";
                String user="root";
                String pass="";

                try{

                    Connection conn= DriverManager.getConnection(url, user, pass);
                    Statement stmt=conn.createStatement();
                    String sql;
                    sql = "select * from all_tickets";
                    ResultSet res = stmt.executeQuery(sql);

                    while(res.next()){
                        TicketNo = res.getString("Serial_No");
                        Value = 0;
                    }

                    if(Value == 100001)
                    {
                        TicketNo = "BR" + " " + String.valueOf(Value);
                    }
                    else
                    {
                        Value = Integer.parseInt(TicketNo);   
                        TicketNo = "BR" + " " + String.valueOf(Value + 100001);
                    }

                    System.out.println(TicketNo);


                }catch(SQLException e){

                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Error !!!");
                 }
                

                
                PreparedStatement ps = null;

                try{

                    Connection conn= DriverManager.getConnection(url, user, pass);

                    String sql;
                    
                    sql = "insert into ticket_list values (null, '"+TicketNo+"' , '"+User+"' , '"+AccountNo+"' , '"+Passenger_Number+"' , '"+Pass_Name+"' ,'"+Age+"' ,'"+MobileNo+"' ,'"+Gender+"' ,'"+TrainName+"' ,'"+Departure+"' ,'"+Arrival+"' ,'"+BogieNo+"' , '"+SeatNo+"' ,'"+Class+"' ,'"+Fare.getText()+"' ,'"+Date+"' ,'"+Time+"' ,'"+Keyword+"' , '"+Temp_SeatNo+"')";
                    
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                        
                    int x = pstmt.executeUpdate(sql);
                    
                    sql = "insert into all_tickets values (null, '"+TicketNo+"' , '"+User+"' , '"+AccountNo+"' , 'Not Visited' , '"+Passenger_Number+"' , '"+Pass_Name+"' ,'"+Age+"' ,'"+MobileNo+"' ,'"+Gender+"' ,'"+TrainName+"' ,'"+Departure+"' ,'"+Arrival+"' ,'"+BogieNo+"' , '"+SeatNo+"' ,'"+Class+"' ,'"+Fare.getText()+"' ,'"+Date+"' ,'"+Time+"' ,'"+Keyword+"')";
            
                    pstmt = conn.prepareStatement(sql);
                        
                    x = pstmt.executeUpdate(sql);

                        PresentAmount = PresentAmount - Cost;
                        Rest_Amount = String.valueOf(PresentAmount);
                        
           
                    url="jdbc:mysql://127.0.0.1/payment";
                    try{
                        Connection con= DriverManager.getConnection(url, user, pass);
                        Statement stmt;
                        stmt = con.createStatement();
                        
                        sql = "update payment_account set Amount = '"+Rest_Amount+"' where Account_Type = 'SureCash'";

                        stmt.executeUpdate(sql);

                   }catch(SQLException e){

                         System.out.println(e);
                         JOptionPane.showMessageDialog(null, "Error !!!!");
                   }
                

                   JOptionPane.showMessageDialog(null, "Your Ticket has been Booked !");
                   new PresentAmount(MobileNo , TicketNo, Rest_Amount , Keyword).setVisible(true);
                   dispose();
                                
                        

                }catch(SQLException e){

                    JOptionPane.showMessageDialog(null, e);
                    System.out.println(e);

                }   
            }else{
                  new Menu().setVisible(true);
            }
        }  
        else{
            JOptionPane.showMessageDialog(null, "Sorry ! You have Insufficient Amount");
        }
        
    }//GEN-LAST:event_PayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SureCash_PaymentConfirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField CurrentAmount;
    private javax.swing.JTextField Fare;
    private javax.swing.JButton Pay;
    private javax.swing.JLabel PaymentConfirmation_Icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}