/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.gui;

import com.sun.corba.se.impl.orbutil.ORBConstants;
import crabshot.management.system.DBA.DBManager;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Shahzeb Shah
 */
public class ExpensesAdd extends javax.swing.JFrame {

    /**
     * Creates new form ProductsAdd
     */
    public ExpensesAdd() {
        initComponents();
        setBounds(0, 0, 1315, 735);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        designeddeveloped = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contactLabel1 = new javax.swing.JLabel();
        discripitionField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        rateField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        contactLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        mainmenubox = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        designeddeveloped.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        designeddeveloped.setForeground(new java.awt.Color(51, 51, 51));
        designeddeveloped.setText("designed and developed by LogicsEase.com");
        getContentPane().add(designeddeveloped);
        designeddeveloped.setBounds(450, 660, 420, 40);

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(1060, 140, 200, 40);

        exitButton.setBackground(new java.awt.Color(204, 204, 204));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(51, 51, 51));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(1060, 90, 200, 40);

        logoutbutton.setBackground(new java.awt.Color(204, 204, 204));
        logoutbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(51, 51, 51));
        logoutbutton.setText("LOG OUT");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbutton);
        logoutbutton.setBounds(1060, 40, 200, 40);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(550, 70, 220, 90);

        jLabel1.setFont(new java.awt.Font("Dotum", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ADD EXPENSE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 190, 320, 40);

        contactLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        contactLabel1.setForeground(new java.awt.Color(51, 51, 51));
        contactLabel1.setText("DISCRIPTION:");
        getContentPane().add(contactLabel1);
        contactLabel1.setBounds(350, 360, 180, 40);

        discripitionField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(discripitionField);
        discripitionField.setBounds(550, 360, 330, 40);

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(nameField);
        nameField.setBounds(550, 260, 330, 40);

        rateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(rateField);
        rateField.setBounds(550, 310, 330, 40);

        cancelButton.setBackground(new java.awt.Color(153, 153, 255));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);
        cancelButton.setBounds(690, 420, 130, 40);

        submitButton.setBackground(new java.awt.Color(153, 153, 255));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton);
        submitButton.setBounds(550, 420, 130, 40);

        contactLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(51, 51, 51));
        contactLabel.setText("AMOUNT:");
        getContentPane().add(contactLabel);
        contactLabel.setBounds(412, 310, 120, 40);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("NAME:");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(450, 260, 80, 40);

        mainmenubox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/menu bg.png"))); // NOI18N
        getContentPane().add(mainmenubox);
        mainmenubox.setBounds(10, 10, 1320, 660);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/login background_2.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1440, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new Expenses().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        new Expenses().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        try{
            String date=java.time.LocalDate.now().toString();
            String name=this.nameField.getText();
            String price=this.rateField.getText();
            String discripition=this.discripitionField.getText();
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the name");
            }
            else if(price.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the price");
            }
            else if(discripition.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the discription");
            }
            else{
                if(price.matches("[0-9]*")){
                    int rate=Integer.parseInt(this.rateField.getText());
                    boolean status=DBManager.addExpenses(name, rate, discripition, date);
                    if(status==true){
                        Expenses ex=new Expenses();
                        ex.setVisible(true);
                        setVisible(false);
                    }
                }   
                else{
                    JOptionPane.showMessageDialog(null, "Please Enter the Number in Price Field");
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ExpensesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpensesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpensesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpensesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpensesAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel contactLabel1;
    private javax.swing.JLabel designeddeveloped;
    private javax.swing.JTextField discripitionField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel mainmenubox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField rateField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
