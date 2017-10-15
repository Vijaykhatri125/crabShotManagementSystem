/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.gui;

import crabshot.management.system.DBA.DBManager;
import static crabshot.management.system.gui.Customers.buildTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shahzeb Shah
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    static String proName="";
    DefaultTableModel defaultTableModel;
    
    public Products() {
        initComponents();
        setBounds(0, 0, 1315, 735);
        fillProductTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productDataTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        namelSearchField = new javax.swing.JTextField();
        logoutbutton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        designeddeveloped = new javax.swing.JLabel();
        mainmenubox = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        mainmenubox1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(550, 70, 220, 90);

        jLabel2.setFont(new java.awt.Font("Dotum", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PRODUCTS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 140, 260, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SEARCH BY NAME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 200, 140, 30);

        productDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Cost", "Price", "Quantity", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productDataTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 240, 1090, 360);

        addButton.setBackground(new java.awt.Color(153, 153, 255));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 51, 51));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(400, 610, 160, 31);

        updateButton.setBackground(new java.awt.Color(153, 153, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 51, 51));
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(580, 610, 160, 31);

        deleteButton1.setBackground(new java.awt.Color(153, 153, 255));
        deleteButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton1.setForeground(new java.awt.Color(51, 51, 51));
        deleteButton1.setText("DELETE");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton1);
        deleteButton1.setBounds(760, 610, 160, 31);

        namelSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namelSearchFieldActionPerformed(evt);
            }
        });
        namelSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namelSearchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(namelSearchField);
        namelSearchField.setBounds(600, 200, 270, 30);

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

        designeddeveloped.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        designeddeveloped.setForeground(new java.awt.Color(51, 51, 51));
        designeddeveloped.setText("designed and developed by LogicsEase.com");
        getContentPane().add(designeddeveloped);
        designeddeveloped.setBounds(450, 660, 420, 40);

        mainmenubox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/menu bg.png"))); // NOI18N
        getContentPane().add(mainmenubox);
        mainmenubox.setBounds(10, 10, 1320, 660);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/login background_2.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1440, 700);

        mainmenubox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/menu bg.png"))); // NOI18N
        getContentPane().add(mainmenubox1);
        mainmenubox1.setBounds(10, 10, 1320, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void namelSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namelSearchFieldKeyReleased
        // TODO add your handling code here:
        String name = this.namelSearchField.getText();
        try {
            ResultSet result = DBManager.getSearchedProductRecord(name);
            //this.productDataTable.removeAll();
            DefaultTableModel  model=(DefaultTableModel)this.productDataTable.getModel();
            model.setRowCount(0);
            while(result.next()){
                int id= result.getInt("id");
                String proName = result.getString("name");
                Double cost = result.getDouble("cost");
                Double price = result.getDouble("price");
                Double quantity = result.getDouble("quantity");
                String unit = result.getString("unit");
                if(unit.equals("kg")) {
                    quantity /= 1000;
                }
                Object [] row = {id, proName, cost, price, quantity, unit};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_namelSearchFieldKeyReleased

    private void namelSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namelSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namelSearchFieldActionPerformed
    String name="";
    private void productDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDataTableMouseClicked
        // TODO add your handling code here:
             name = this.productDataTable.getValueAt(productDataTable.getSelectedRow(), 1).toString();
   
    }//GEN-LAST:event_productDataTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        new ProductsAdd().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int row=productDataTable.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"Please select the Record for Update..!");
        }
        else{
            proName=this.productDataTable.getValueAt(row, 1).toString();
          //  System.out.println("COntact number is : "+contactNo);
            ProductsUpdate producrUpdate=new ProductsUpdate();
            producrUpdate.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        try {
            if(name!=""){
                int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure? You want to delete the Record.!");
                if (dialogResult == JOptionPane.YES_OPTION) {
                    DBManager.deleteProduct(name);
                    fillProductTable();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Select Customer for Deleting the record");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteButton1ActionPerformed

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
    
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JLabel designeddeveloped;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel mainmenubox;
    private javax.swing.JLabel mainmenubox1;
    private javax.swing.JTextField namelSearchField;
    private javax.swing.JTable productDataTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void fillProductTable() {
        try {
            ResultSet result = DBManager.fatchAllProducts();
            //defaultTableModel = buildTableModel(result);
            DefaultTableModel  model=(DefaultTableModel)this.productDataTable.getModel();
            model.setRowCount(0);
            while(result.next()){
                int id= result.getInt("id");
                String name = result.getString("name");
                Double cost = result.getDouble("cost");
                Double price = result.getDouble("price");
                Double quantity = result.getDouble("quantity");
                String unit = result.getString("unit");
                if(unit.equals("kg")) {
                    quantity /= 1000;
                }
                Object [] row = {id, name, cost, price, quantity, unit};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //this.productDataTable.setModel(defaultTableModel);
    }
    
    
}