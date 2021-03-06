/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.gui;

/**
 *
 * @author Shahzeb Shah
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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
        exitButton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        orderIcon = new javax.swing.JLabel();
        ordersRecordicon = new javax.swing.JLabel();
        orderRecordsButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        producticon = new javax.swing.JLabel();
        productbutton = new javax.swing.JButton();
        expensesicon = new javax.swing.JLabel();
        expensebutton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        customericon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        mainmenubox = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        designeddeveloped.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        designeddeveloped.setForeground(new java.awt.Color(51, 51, 51));
        designeddeveloped.setText("designed and developed by LogicsEase.com");
        getContentPane().add(designeddeveloped);
        designeddeveloped.setBounds(450, 660, 420, 40);

        exitButton.setBackground(new java.awt.Color(204, 204, 204));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(51, 51, 51));
        exitButton.setText("EXIT");
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

        orderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/ordericon.png"))); // NOI18N
        getContentPane().add(orderIcon);
        orderIcon.setBounds(990, 240, 200, 200);

        ordersRecordicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/orderRecordIcon.png"))); // NOI18N
        ordersRecordicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersRecordiconMouseClicked(evt);
            }
        });
        getContentPane().add(ordersRecordicon);
        ordersRecordicon.setBounds(760, 240, 200, 200);

        orderRecordsButton.setBackground(new java.awt.Color(153, 153, 255));
        orderRecordsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orderRecordsButton.setForeground(new java.awt.Color(51, 51, 51));
        orderRecordsButton.setText("ORDER RECORDS");
        orderRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderRecordsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(orderRecordsButton);
        orderRecordsButton.setBounds(760, 440, 200, 40);

        orderButton.setBackground(new java.awt.Color(153, 153, 255));
        orderButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        orderButton.setForeground(new java.awt.Color(51, 51, 51));
        orderButton.setText("ORDER");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(orderButton);
        orderButton.setBounds(990, 440, 200, 40);

        producticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/producticon.png"))); // NOI18N
        producticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producticonMouseClicked(evt);
            }
        });
        getContentPane().add(producticon);
        producticon.setBounds(300, 240, 200, 200);

        productbutton.setBackground(new java.awt.Color(153, 153, 255));
        productbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productbutton.setForeground(new java.awt.Color(51, 51, 51));
        productbutton.setText("PRODUCTS");
        productbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(productbutton);
        productbutton.setBounds(300, 440, 200, 40);

        expensesicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/expenseicon.png"))); // NOI18N
        expensesicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expensesiconMouseClicked(evt);
            }
        });
        getContentPane().add(expensesicon);
        expensesicon.setBounds(530, 240, 200, 200);

        expensebutton.setBackground(new java.awt.Color(153, 153, 255));
        expensebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        expensebutton.setForeground(new java.awt.Color(51, 51, 51));
        expensebutton.setText("EXPENSES");
        expensebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(expensebutton);
        expensebutton.setBounds(530, 440, 200, 40);

        customerButton.setBackground(new java.awt.Color(153, 153, 255));
        customerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerButton.setForeground(new java.awt.Color(51, 51, 51));
        customerButton.setText("CUSTOMERS");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(customerButton);
        customerButton.setBounds(70, 440, 200, 40);

        customericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/customericon-mid.png"))); // NOI18N
        customericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customericonMouseClicked(evt);
            }
        });
        getContentPane().add(customericon);
        customericon.setBounds(70, 240, 200, 200);

        jLabel1.setFont(new java.awt.Font("Dotum", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("MAIN MENU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 140, 230, 90);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(550, 70, 220, 90);

        mainmenubox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/menu bg.png"))); // NOI18N
        getContentPane().add(mainmenubox);
        mainmenubox.setBounds(10, 10, 1320, 660);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/login background_2.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1440, 700);

        jMenu1.setText("File");

        jMenuItem1.setText("Log out");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        // TODO add your handling code here:
        new Customers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerButtonActionPerformed

    private void productbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productbuttonActionPerformed
        // TODO add your handling code here:
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productbuttonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        new Order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderButtonActionPerformed

    private void expensebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensebuttonActionPerformed
        // TODO add your handling code here:
        new Expenses().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_expensebuttonActionPerformed

    private void orderRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderRecordsButtonActionPerformed
        // TODO add your handling code here:
        new OrdersRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderRecordsButtonActionPerformed

    private void customericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customericonMouseClicked
        // TODO add your handling code here:
        new Customers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customericonMouseClicked

    private void producticonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producticonMouseClicked
        // TODO add your handling code here:
        new Order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_producticonMouseClicked

    private void expensesiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expensesiconMouseClicked
        // TODO add your handling code here:
        new OrdersRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_expensesiconMouseClicked

    private void ordersRecordiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersRecordiconMouseClicked
        // TODO add your handling code here:
        new Order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ordersRecordiconMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton customerButton;
    private javax.swing.JLabel customericon;
    private javax.swing.JLabel designeddeveloped;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton expensebutton;
    private javax.swing.JLabel expensesicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel mainmenubox;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel orderIcon;
    private javax.swing.JButton orderRecordsButton;
    private javax.swing.JLabel ordersRecordicon;
    private javax.swing.JButton productbutton;
    private javax.swing.JLabel producticon;
    // End of variables declaration//GEN-END:variables
}
