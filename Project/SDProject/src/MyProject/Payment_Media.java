/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

import javax.swing.JOptionPane;

/**
 *
 * @author USER C
 */
public class Payment_Media extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Payment
     */
    String Medium = null;
    
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
    int Passenger_Number = 0;
    String User = null;
    String AccountNo = null;
    
    public Payment_Media() {
        initComponents();
    }
    
    /**
     *
     * @param Pass_Name
     * @param Age
     * @param MobileNo
     * @param Gender
     * @param TrainName
     * @param Departure
     * @param Arrival
     * @param BogieNo
     * @param Class
     * @param Fare
     * @param JourneyDate
     * @param Time
     * @param Keyword
     */
    public Payment_Media(String User , String AccountNo , String Pass_Name , String Age , String MobileNo , String Gender , String TrainName , String Departure , String Arrival , String BogieNo , String Class , String Fare , String JourneyDate , String Time , String Keyword  , String SeatNo , String Temp_SeatNo , int Passenger_Number) {
        initComponents();
        
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
        Date = JourneyDate;
        this.Time = Time;
        this.Keyword = Keyword;
        this.SeatNo = SeatNo;
        this.Temp_SeatNo = Temp_SeatNo;
        this.Passenger_Number = Passenger_Number;
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

        BKash = new javax.swing.JButton();
        Nogad = new javax.swing.JButton();
        Rocket = new javax.swing.JButton();
        SureCash = new javax.swing.JButton();
        Payment_Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fare = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Payment_Icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BKash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BKash.jpg"))); // NOI18N
        BKash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKashActionPerformed(evt);
            }
        });
        getContentPane().add(BKash, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 290, -1));

        Nogad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nogad.png"))); // NOI18N
        Nogad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NogadActionPerformed(evt);
            }
        });
        getContentPane().add(Nogad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 290, -1));

        Rocket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rocket.png"))); // NOI18N
        Rocket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RocketActionPerformed(evt);
            }
        });
        getContentPane().add(Rocket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 290, 160));

        SureCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SureCash.jpg"))); // NOI18N
        SureCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureCashActionPerformed(evt);
            }
        });
        getContentPane().add(SureCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 290, 160));

        Payment_Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        Payment_Title.setText("Select for the Payment ");
        getContentPane().add(Payment_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 30, 300, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("You have to pay");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("/= taka for the ticket");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, 40));

        Fare.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Fare.setEnabled(false);
        Fare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FareActionPerformed(evt);
            }
        });
        getContentPane().add(Fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 80, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lebel.JPG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        Payment_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        getContentPane().add(Payment_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BKashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKashActionPerformed
        // TODO add your handling code here:
        
        Medium = "BKash";       
        new Payment(User , AccountNo , Medium , Pass_Name , Age , MobileNo , Gender , TrainName , Departure , Arrival , BogieNo , Class , Fare.getText() , Date , Time , Keyword , SeatNo , Temp_SeatNo , Passenger_Number).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_BKashActionPerformed

    private void NogadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NogadActionPerformed
        // TODO add your handling code here:
        
        Medium = "Nogad";      
        new Payment(User , AccountNo , Medium , Pass_Name , Age , MobileNo , Gender , TrainName , Departure , Arrival , BogieNo , Class , Fare.getText() , Date , Time , Keyword , SeatNo , Temp_SeatNo , Passenger_Number).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_NogadActionPerformed

    private void RocketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RocketActionPerformed
        // TODO add your handling code here:
        
        Medium = "Rocket";       
        new Payment(User , AccountNo , Medium , Pass_Name , Age , MobileNo , Gender , TrainName , Departure , Arrival , BogieNo , Class , Fare.getText() , Date , Time , Keyword , SeatNo , Temp_SeatNo , Passenger_Number).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_RocketActionPerformed

    private void SureCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureCashActionPerformed
        // TODO add your handling code here:
        
        Medium = "SureCash";      
        new Payment(User , AccountNo , Medium , Pass_Name , Age , MobileNo , Gender , TrainName , Departure , Arrival , BogieNo , Class , Fare.getText() , Date , Time , Keyword , SeatNo , Temp_SeatNo , Passenger_Number).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_SureCashActionPerformed

    private void FareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FareActionPerformed

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
            java.util.logging.Logger.getLogger(Payment_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_Media.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_Media().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKash;
    private javax.swing.JTextField Fare;
    private javax.swing.JButton Nogad;
    private javax.swing.JLabel Payment_Icon;
    private javax.swing.JLabel Payment_Title;
    private javax.swing.JButton Rocket;
    private javax.swing.JButton SureCash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}