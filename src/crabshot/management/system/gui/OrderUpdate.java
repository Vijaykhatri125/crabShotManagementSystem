/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabshot.management.system.gui;

import crabshot.management.system.DBA.DBConnection;
import crabshot.management.system.DBA.DBManager;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Shahzeb Shah
 */
public class OrderUpdate extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    DefaultTableModel defaultTableModel;
    String nameOfProduct="";
    HashMap<String, Double> productQuantityRecords = new HashMap<String, Double>();
    public OrderUpdate() {
        initComponents();
        setBounds(0, 0, 1315, 735);
        updateReceiptTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderDataTable = new javax.swing.JTable();
        removeitemButton = new javax.swing.JButton();
        saveOrderButton = new javax.swing.JButton();
        receiptButton = new javax.swing.JButton();
        searchByCell = new javax.swing.JRadioButton();
        searchByName = new javax.swing.JRadioButton();
        orderCommentField = new javax.swing.JTextField();
        orderComment = new javax.swing.JLabel();
        receiptLabel = new javax.swing.JLabel();
        productNameLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productDataTable = new javax.swing.JTable();
        deliveryField = new javax.swing.JTextField();
        deliveryLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        quantityNameLabel = new javax.swing.JLabel();
        nameSearchField = new javax.swing.JTextField();
        productButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        gTotalLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchName = new javax.swing.JTextField();
        unitOptions = new javax.swing.JComboBox();
        exitButton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        customerName = new javax.swing.JComboBox();
        designeddeveloped = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainmenubox = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        OrderDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.no", "Name", "Price", "Quantity Selected", "Unit", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderDataTableMouseClicked(evt);
            }
        });
        OrderDataTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                OrderDataTablePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(OrderDataTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(710, 360, 480, 220);

        removeitemButton.setText("Remove");
        removeitemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeitemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeitemButton);
        removeitemButton.setBounds(720, 620, 140, 30);

        saveOrderButton.setText("Save");
        saveOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveOrderButton);
        saveOrderButton.setBounds(870, 620, 120, 30);

        receiptButton.setText("Generate Updated Receipt");
        receiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(receiptButton);
        receiptButton.setBounds(1000, 620, 190, 30);

        buttonGroup1.add(searchByCell);
        searchByCell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchByCell.setText("Search by Cell");
        getContentPane().add(searchByCell);
        searchByCell.setBounds(340, 170, 160, 25);

        buttonGroup1.add(searchByName);
        searchByName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchByName.setText("Search by Name");
        getContentPane().add(searchByName);
        searchByName.setBounds(160, 170, 150, 25);

        orderCommentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderCommentFieldActionPerformed(evt);
            }
        });
        orderCommentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderCommentFieldKeyReleased(evt);
            }
        });
        getContentPane().add(orderCommentField);
        orderCommentField.setBounds(280, 320, 200, 30);

        orderComment.setFont(new java.awt.Font("Sertig", 1, 14)); // NOI18N
        orderComment.setText("Comment:");
        getContentPane().add(orderComment);
        orderComment.setBounds(160, 320, 120, 30);

        receiptLabel.setFont(new java.awt.Font("Sertig", 1, 14)); // NOI18N
        receiptLabel.setText("Receipt:");
        getContentPane().add(receiptLabel);
        receiptLabel.setBounds(710, 320, 70, 30);

        productNameLabel1.setFont(new java.awt.Font("Sertig", 1, 14)); // NOI18N
        productNameLabel1.setText("Customer Name");
        getContentPane().add(productNameLabel1);
        productNameLabel1.setBounds(160, 240, 120, 30);

        productDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Cost", "Price", "Quantity", "Unit"
            }
        ));
        productDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productDataTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 360, 480, 250);

        deliveryField.setText("20");
        deliveryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deliveryFieldKeyReleased(evt);
            }
        });
        getContentPane().add(deliveryField);
        deliveryField.setBounds(580, 320, 60, 30);

        deliveryLabel.setFont(new java.awt.Font("Sertig", 1, 14)); // NOI18N
        deliveryLabel.setText("Delivery:");
        getContentPane().add(deliveryLabel);
        deliveryLabel.setBounds(500, 320, 70, 30);

        productNameLabel.setFont(new java.awt.Font("Sertig", 1, 14)); // NOI18N
        productNameLabel.setText("Product:");
        getContentPane().add(productNameLabel);
        productNameLabel.setBounds(160, 280, 120, 30);

        quantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityFieldKeyReleased(evt);
            }
        });
        getContentPane().add(quantityField);
        quantityField.setBounds(580, 280, 60, 30);

        quantityNameLabel.setFont(new java.awt.Font("Sertig", 1, 14)); // NOI18N
        quantityNameLabel.setText("Quantity:");
        getContentPane().add(quantityNameLabel);
        quantityNameLabel.setBounds(500, 280, 70, 30);

        nameSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSearchFieldActionPerformed(evt);
            }
        });
        nameSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameSearchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(nameSearchField);
        nameSearchField.setBounds(280, 280, 200, 30);

        productButton.setText("Add Product");
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });
        getContentPane().add(productButton);
        productButton.setBounds(480, 620, 140, 30);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(550, 50, 220, 90);

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

        gTotalLabel.setText("TOTAL: Rs 20 /=");
        getContentPane().add(gTotalLabel);
        gTotalLabel.setBounds(1004, 590, 190, 14);

        jButton1.setText("Add New Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 240, 140, 30);

        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });
        searchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchNameKeyReleased(evt);
            }
        });
        getContentPane().add(searchName);
        searchName.setBounds(160, 200, 320, 30);

        unitOptions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg", "gram", "pcs" }));
        getContentPane().add(unitOptions);
        unitOptions.setBounds(640, 280, 70, 30);

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

        getContentPane().add(customerName);
        customerName.setBounds(280, 240, 200, 30);

        designeddeveloped.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        designeddeveloped.setForeground(new java.awt.Color(51, 51, 51));
        designeddeveloped.setText("designed and developed by LogicsEase.com");
        getContentPane().add(designeddeveloped);
        designeddeveloped.setBounds(450, 660, 420, 40);

        jLabel2.setFont(new java.awt.Font("Dotum", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("UPDATE ORDER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 120, 330, 70);

        mainmenubox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/menu bg.png"))); // NOI18N
        getContentPane().add(mainmenubox);
        mainmenubox.setBounds(10, 20, 1320, 660);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crabshot/management/system/Images/login background_2.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1440, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new OrdersRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutbuttonActionPerformed
    int count=0 , grandTotal=0;
    String date="";
    DefaultTableModel model;
    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        // TODO add your handling code here:
   
        try{
            String quentity=this.quantityField.getText();
            if(quentity.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the Quantity");
            }
            else if(this.customerName.getSelectedItem()==null){
                JOptionPane.showMessageDialog(null, "Please Select the customer");
            }
            else{
                Double quantityInsert=Double.parseDouble(this.quantityField.getText());
                String name=this.nameSearchField.getText();
                double storedQuantity = 0;
                if(productQuantityRecords.get(name) != null) {
                    storedQuantity = productQuantityRecords.get(name);
                }
                double quantityAvialable=DBManager.quantityAvailable(name);
                String unit = DBManager.getProductUnit(name);
                String selectedUnit = unitOptions.getSelectedItem().toString();
                if(!selectedUnit.equals(unit)) {
                    if(selectedUnit.equals("kg")) {
                        quantityInsert *= 1000;
                    }
                    else {
                        quantityInsert /= 1000;
                    }
                }
                if(unit.equals("kg")) {
                    quantityAvialable /= 1000;
                }
                quantityAvialable += storedQuantity;
                if(quantityInsert>quantityAvialable){
                    JOptionPane.showMessageDialog(null, "That Much Quantity not Available");
                }
                else{
                    model=(DefaultTableModel)this.OrderDataTable.getModel();
                    if(checkProductInTable(name)) {
                        JOptionPane.showMessageDialog(null, "Product already in the receipt.");
                    }
                    else {
                        double remaining=(quantityAvialable-quantityInsert);
                        double price=DBManager.getProductPrice(name);
                        double totalAmount=(price*quantityInsert);
                        totalAmount = Double.valueOf(df.format(totalAmount));
                        count++;
                        
                        Object[] row={count,name,price,quantityInsert,unit,totalAmount};
                        model.addRow(row); 
                    }        
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        setGrandTotal();
        resetIndex();
    }//GEN-LAST:event_productButtonActionPerformed

    private void nameSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSearchFieldActionPerformed

    private void nameSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameSearchFieldKeyReleased
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_R) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            receiptButton.doClick();
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        // Enter was pressed. Your code goes here.
            quantityField.requestFocus();
            
            String productName = this.productDataTable.getValueAt(0, 1).toString();
            nameSearchField.setText(productName);
            String unit = DBManager.getProductUnit(productName);
            unitOptions.setSelectedItem(unit);
        }
        nameOfProduct=this.nameSearchField.getText();
        searchRecordTable(nameOfProduct); 
    }//GEN-LAST:event_nameSearchFieldKeyReleased

    private void productDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDataTableMouseClicked
        // TODO add your handling code here:
        String name=this.productDataTable.getValueAt(this.productDataTable.getSelectedRow(), 1).toString();
        this.nameSearchField.setText(name);
        String unit = DBManager.getProductUnit(name);
        unitOptions.setSelectedItem(unit);
    }//GEN-LAST:event_productDataTableMouseClicked

    private void OrderDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderDataTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderDataTableMouseClicked
    
    private void receiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiptButtonActionPerformed
        // TODO add your handling code here:
        model=(DefaultTableModel)this.OrderDataTable.getModel();
        String customerName=this.customerName.getSelectedItem().toString();
        int custId=DBManager.getCustomersId(customerName);
        date=java.time.LocalDate.now().toString();
        String orderComment=this.orderCommentField.getText();
        int deliveryCharges = Integer.parseInt(this.deliveryField.getText().toString());
        DBManager.updateOrder(OrdersRecords.updateOrderId, date, custId,1002,orderComment, deliveryCharges);
        DBManager.deleteOrderDetails(OrdersRecords.updateOrderId);
        for(int i=0;i<model.getRowCount();i++){
            String name=model.getValueAt(i, 1).toString();
            //double rate=Double.parseDouble(model.getValueAt(i, 2).toString());
            double cost = DBManager.getProductCost(name);
            double price = DBManager.getProductPrice(name);
            double quantity=Double.parseDouble(model.getValueAt(i, 3).toString());
            double total=Double.parseDouble(model.getValueAt(i, 5).toString());
            int proId=DBManager.getProductId(name);
            DBManager.addOrderDetails(OrdersRecords.updateOrderId, proId, quantity, cost, price);
            double storedQuantity = 0;
            String unit = DBManager.getProductUnit(name);
            if(productQuantityRecords.get(name) != null) {
                storedQuantity = productQuantityRecords.get(name);
            }
            quantity = quantity - storedQuantity;
            if(unit.equals("kg")) {
                quantity *= 1000;
            }
            DBManager.updateQuantityOfProduct(name, quantity, DBManager.getProductId(name));
        }
        JOptionPane.showMessageDialog(null, "Record Updated Succefully.!");
        
        try {
            HashMap<String, Object> hm = new HashMap<String, Object>();
            hm.put("OrderId", OrdersRecords.updateOrderId);
            JasperPrint jasperPrint;
            Connection con = DBConnection.makeConnection();
            JasperReport jasperReport = JasperCompileManager.compileReport("./receipt1.jrxml");
            jasperPrint = JasperFillManager.fillReport(jasperReport, hm, con);
            //JasperViewer.viewReport(jasperPrint);
            JasperPrintManager.printReport(jasperPrint, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new OrdersRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_receiptButtonActionPerformed

    static String status="";
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        status="orderFrame";
        CustomersAdd customerAdd=new CustomersAdd();
        customerAdd.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchNameKeyReleased
        // TODO add your handling code here:
        String data=this.searchName.getText();
        if(data.equals("")){
            this.customerName.removeAllItems();
        }
        else{
            if(this.searchByName.isSelected()){
                GetCustomersByName(data);
            }
            else{
                GetCustomersByCell(data);
            }
        }
        
    }//GEN-LAST:event_searchNameKeyReleased

    private void orderCommentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderCommentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderCommentFieldActionPerformed

    private void orderCommentFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderCommentFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_orderCommentFieldKeyReleased

    DefaultTableModel receiptModel;
    private void removeitemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeitemButtonActionPerformed
        // TODO add your handling code here
        model = (DefaultTableModel) this.OrderDataTable.getModel();
        if(OrderDataTable.getSelectedRow() != -1) {
            count--;
            model.removeRow(OrderDataTable.getSelectedRow());
            setGrandTotal();
            resetIndex();
        }
    }//GEN-LAST:event_removeitemButtonActionPerformed

    private void OrderDataTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_OrderDataTablePropertyChange
        // TODO add your handling code here:
        if("tableCellEditor".equals(evt.getPropertyName())){
           // System.out.println("edit " +editingRow + ":" + editingColumn);
                int row = OrderDataTable.getSelectedRow();
                int column = OrderDataTable.getSelectedColumn();
                double quantity = Double.parseDouble(OrderDataTable.getValueAt(row, column).toString());
                String productName = OrderDataTable.getValueAt(row,1).toString();
                double storedQuantity = productQuantityRecords.get(productName);
                //System.out.println("old:" + storedQuantity + " new:" + quantity);
                String unit = DBManager.getProductUnit(productName);
                double availableQuantity = DBManager.getProductQuantity(productName);
                if(unit.equals("kg")) {
                    availableQuantity /= 1000;
                }
                availableQuantity += storedQuantity;
                if(availableQuantity>=quantity){    
                    double price = Double.parseDouble(OrderDataTable.getValueAt(row, column-1).toString());
                    double totalprice=Double.parseDouble(OrderDataTable.getValueAt(row, column+2).toString());
                    totalprice=price*quantity;
                    OrderDataTable.setValueAt(totalprice, row, column+1);
                }
                else{   
                    JOptionPane.showMessageDialog(null,"Quantity Is not Available and Its value set To be 1");
                    OrderDataTable.setValueAt(1, row, column);
                    Double price = Double.parseDouble(OrderDataTable.getValueAt(row, column-1).toString());
                    OrderDataTable.setValueAt(price, row, column+2);
                }
        }
        else{
            
        }
        setGrandTotal();
    }//GEN-LAST:event_OrderDataTablePropertyChange

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameActionPerformed

    private void quantityFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityFieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        // Enter was pressed. Your code goes here.
            nameSearchField.requestFocus();
            productButton.doClick();
            nameSearchField.setText("");
            quantityField.setText("");
        }

        if ((evt.getKeyCode() == KeyEvent.VK_R) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
            receiptButton.doClick();
        }
    }//GEN-LAST:event_quantityFieldKeyReleased

    private void saveOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOrderButtonActionPerformed
        // TODO add your handling code here:
        model=(DefaultTableModel)this.OrderDataTable.getModel();
        String customerName=this.customerName.getSelectedItem().toString();
        int custId=DBManager.getCustomersId(customerName);
        date=java.time.LocalDate.now().toString();
        String orderComment=this.orderCommentField.getText();
        int deliveryCharges = Integer.parseInt(this.deliveryField.getText().toString());
        DBManager.updateOrder(OrdersRecords.updateOrderId, date, custId,1002,orderComment, deliveryCharges);
        DBManager.deleteOrderDetails(OrdersRecords.updateOrderId);
        for(int i=0;i<model.getRowCount();i++){
            String name=model.getValueAt(i, 1).toString();
            //double rate=Double.parseDouble(model.getValueAt(i, 2).toString());
            double cost = DBManager.getProductCost(name);
            double price = DBManager.getProductPrice(name);
            double quantity=Double.parseDouble(model.getValueAt(i, 3).toString());
            double total=Double.parseDouble(model.getValueAt(i, 5).toString());
            int proId=DBManager.getProductId(name);
            DBManager.addOrderDetails(OrdersRecords.updateOrderId, proId, quantity, cost, price);
            double storedQuantity = 0;
            String unit = DBManager.getProductUnit(name);
            if(productQuantityRecords.get(name) != null) {
                storedQuantity = productQuantityRecords.get(name);
            }
            quantity = quantity - storedQuantity;
            if(unit.equals("kg")) {
                quantity *= 1000;
            }
            DBManager.updateQuantityOfProduct(name, quantity, DBManager.getProductId(name));
        }
        JOptionPane.showMessageDialog(null, "Record Updated Succefully.!");
        
        new OrdersRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saveOrderButtonActionPerformed

    private void deliveryFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deliveryFieldKeyReleased
        // TODO add your handling code here:
        setGrandTotal();        
    }//GEN-LAST:event_deliveryFieldKeyReleased

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
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderUpdate().setVisible(true);
            }
        });
    }

    HashMap<Integer, Object []> hmap = new HashMap<Integer, Object []>();
    DecimalFormat df = new DecimalFormat("#.##");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderDataTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox customerName;
    private javax.swing.JTextField deliveryField;
    private javax.swing.JLabel deliveryLabel;
    private javax.swing.JLabel designeddeveloped;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel gTotalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel mainmenubox;
    private javax.swing.JTextField nameSearchField;
    private javax.swing.JLabel orderComment;
    private javax.swing.JTextField orderCommentField;
    private javax.swing.JButton productButton;
    private javax.swing.JTable productDataTable;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productNameLabel1;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityNameLabel;
    private javax.swing.JButton receiptButton;
    private javax.swing.JLabel receiptLabel;
    private javax.swing.JButton removeitemButton;
    private javax.swing.JButton saveOrderButton;
    private javax.swing.JRadioButton searchByCell;
    private javax.swing.JRadioButton searchByName;
    private javax.swing.JTextField searchName;
    private javax.swing.JComboBox unitOptions;
    // End of variables declaration//GEN-END:variables

    private void searchRecordTable(String name) {
        try {
            ResultSet result = DBManager.getSearchedProductRecord(name);
            DefaultTableModel  model=(DefaultTableModel)this.productDataTable.getModel();
            model.setRowCount(0);
            double storedQuantity = 0;
            while(result.next()){
                int id= result.getInt("id");
                String proName = result.getString("name");
                Double cost = result.getDouble("cost");
                Double price = result.getDouble("price");
                Double quantity = result.getDouble("quantity");
                String unit = result.getString("unit");
                if(productQuantityRecords.get(proName) != null) {
                    storedQuantity = productQuantityRecords.get(proName);
                    System.out.println(storedQuantity);
                }
                if(unit.equals("kg")) {
                    quantity /= 1000;
                }
                
                quantity += storedQuantity;
                Object [] row = {id, proName, cost, price, quantity, unit};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void GetCustomersByName(String name) {
        
        try{
            ResultSet result=DBManager.getCustomerType(name);
            this.customerName.removeAllItems();
            while(result.next()){
                this.customerName.addItem(result.getString("name"));
                
            }
        }catch(Exception e){}
    }

    private void GetCustomersByCell(String cell) {
        try{
            ResultSet result=DBManager.getCustomerTypeByCell(cell);
            this.customerName.removeAllItems();
            while(result.next()){
                this.customerName.addItem(result.getString("name"));
            }
        }catch(Exception e){}
    }
    
    private boolean checkProductInTable(String productName) {
            for(int i=0;i<model.getRowCount();i++){
            String name=model.getValueAt(i, 1).toString();
            if(name.equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
    
    public void updateReceiptTable() {
        try{
            String customerName = DBManager.getCustomersName(OrdersRecords.updateCustomerId);
            this.customerName.removeAllItems();
            this.customerName.addItem(customerName);             
        }catch(Exception e){}
      
        try {
            ResultSet detailsResult=DBManager.getAllOrderDetails(OrdersRecords.updateOrderId);
            String comment = DBManager.getOrderComment(OrdersRecords.updateOrderId);
            orderCommentField.setText(comment);
            deliveryField.setText(OrdersRecords.deliveryCharges + "");
            String proName="", proUnit;
            int count = 0;
            double proPrice=0 ,quantity=0,totalP=0;
            DefaultTableModel  model=(DefaultTableModel)this.OrderDataTable.getModel();
            model.setRowCount(0);
            while(detailsResult.next()){
                count++;
                int proId=detailsResult.getInt("product_id");
                proName=DBManager.getProductName(proId);
                proUnit=DBManager.getProductUnit(proName);
                proPrice=DBManager.getProductPrice(proName);
                quantity=detailsResult.getDouble("quantity");
                //if(proUnit.equals("kg")) {
                //    quantity /= 1000;
                //}
                totalP=quantity*proPrice;
                totalP = Double.valueOf(df.format(totalP));
                grandTotal += totalP;
                Object [] row={count,proName, proPrice,quantity,proUnit,totalP};
                model.addRow(row);
                productQuantityRecords.put(proName, quantity);
            }
        } catch (Exception ex) {
            
        }
        gTotalLabel.setText("Total: Rs " + Double.valueOf(df.format(grandTotal)) + "/=");
    }
    
    private void setGrandTotal() {
        grandTotal = 0;
        if(model != null) {
            for(int i=0;i<model.getRowCount();i++){
                double total=Double.parseDouble(model.getValueAt(i, 5).toString());
                grandTotal+=total;
            }
        }      
        if(!deliveryField.getText().isEmpty())
            grandTotal += Double.parseDouble(deliveryField.getText());
        gTotalLabel.setText("Total: Rs " + Double.valueOf(df.format(grandTotal)) + "/=");
    }
    
    private void resetIndex() {
        count = 0;
        if(model != null) {
            for(int i=0;i<model.getRowCount();i++){
                count++;
                double total=Double.parseDouble(model.getValueAt(i, 5).toString());
                model.setValueAt(count, i, 0);
                grandTotal+=total;
            }
        }
    }
}
