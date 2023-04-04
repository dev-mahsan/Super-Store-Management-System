package SSMSystem;

import DataBaseWork.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class PlaceCustomerOrderEmployee extends javax.swing.JFrame {

    String email = LoginScreen.email;

    public PlaceCustomerOrderEmployee() {
        initComponents();
//        String email = LoginScreen.email;
        LoginNameTF.setText(email);
        ReceiptPanel.setVisible(false);
        fillComboBox();
        int i = 0;
        try {
            Connection con = MySqlConnection.getCon();
            String query = "SELECT * from storerecord";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                i = rs.getInt(1);
            }
            BillLabel.setText("" + ++i);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Exception 1: Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReceiptPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ReceiptArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BillLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CategoryComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        PrNameTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        QuantitySpinner = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        PrPriceTxtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TotalTxtField = new javax.swing.JTextField();
        CartButton = new javax.swing.JButton();
        ClearChoiceButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CartTable = new javax.swing.JTable();
        TotalBillTxtField = new javax.swing.JTextField();
        ReceiptButton = new javax.swing.JButton();
        TotalBillButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        LoginNameTF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReceiptPanel.setBackground(new java.awt.Color(0, 0, 0));
        ReceiptPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        ReceiptPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ReceiptPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        ReceiptArea.setColumns(20);
        ReceiptArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ReceiptArea.setRows(5);
        jScrollPane3.setViewportView(ReceiptArea);

        ReceiptPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 480));

        getContentPane().add(ReceiptPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 470, 570));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 87, -1, -1));

        BillLabel.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        BillLabel.setForeground(new java.awt.Color(255, 255, 255));
        BillLabel.setText("--");
        getContentPane().add(BillLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 87, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 153, -1, -1));

        CategoryComboBox.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        CategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CategoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 239, -1));

        CategoryTable.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Products In this Category ", "Products Price"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 299, 403, 343));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 87, -1, -1));

        PrNameTxtField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        getContentPane().add(PrNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 84, 239, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 153, -1, -1));

        QuantitySpinner.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        QuantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantitySpinnerStateChanged(evt);
            }
        });
        getContentPane().add(QuantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 150, 239, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price Of Product");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 87, -1, -1));

        PrPriceTxtField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        getContentPane().add(PrPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1101, 84, 239, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 153, -1, -1));

        TotalTxtField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        getContentPane().add(TotalTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1101, 150, 239, -1));

        CartButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        CartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-to-cart.png"))); // NOI18N
        CartButton.setText("Add to Cart");
        CartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 216, -1, -1));

        ClearChoiceButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ClearChoiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove-from-cart.png"))); // NOI18N
        ClearChoiceButton.setText("Remove From Cart");
        ClearChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearChoiceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearChoiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 220, -1, -1));

        CartTable.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        CartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane2.setViewportView(CartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 299, 833, 343));

        TotalBillTxtField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TotalBillTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBillTxtFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TotalBillTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 684, 106, 30));

        ReceiptButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        ReceiptButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/receipt.png"))); // NOI18N
        ReceiptButton.setText("Receipt");
        ReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReceiptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 683, -1, -1));

        TotalBillButton.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        TotalBillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/total.png"))); // NOI18N
        TotalBillButton.setText("Total Bill");
        TotalBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBillButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TotalBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 680, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit (1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LoginNameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginNameTF.setForeground(new java.awt.Color(255, 255, 255));
        LoginNameTF.setText("--");
        getContentPane().add(LoginNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 30, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/placeOrder.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalBillTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBillTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalBillTxtFieldActionPerformed


    private void CategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryComboBoxActionPerformed
        // TODO add your handling code here:
        String Category = CategoryComboBox.getSelectedItem().toString();
        DefaultTableModel CategoryModel = (DefaultTableModel) CategoryTable.getModel();
        CategoryModel.setRowCount(0);
        try {
            Connection con = MySqlConnection.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + Category + " WHERE ProductStatus='Active';");
            while (rs.next()) {
                String ProductName = rs.getString("ProductName");
                String ProductPrice = rs.getString("ProductPrice");
                String categoryData[] = {ProductName, ProductPrice};
                CategoryModel.addRow(categoryData);

            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Exception 2: Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CategoryComboBoxActionPerformed

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
        // TODO add your handling code here:
        int i = CategoryTable.getSelectedRow();
        String ProductName = CategoryTable.getModel().getValueAt(i, 0).toString();
        String ProductPrice = CategoryTable.getModel().getValueAt(i, 1).toString();
        PrNameTxtField.setText(ProductName);
        PrPriceTxtField.setText(ProductPrice);
        QuantitySpinner.setValue(1);
        TotalTxtField.setText(ProductPrice);
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void QuantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantitySpinnerStateChanged
        // TODO add your handling code here:
        int quantity = Integer.parseInt(QuantitySpinner.getValue().toString());
        int price = Integer.parseInt(PrPriceTxtField.getText());
        String total = Integer.toString(quantity * price);
        TotalTxtField.setText(total);
    }//GEN-LAST:event_QuantitySpinnerStateChanged

    private void CartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartButtonActionPerformed
        // TODO add your handling code here:
        if (PrNameTxtField.getText().equals("") && PrPriceTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please select product!");
        } else {
            try {
                DefaultTableModel CartModel = (DefaultTableModel) CartTable.getModel();
                String PrName = PrNameTxtField.getText();
                String PrPrice = PrPriceTxtField.getText();
                String PrQuantity = QuantitySpinner.getValue().toString();
                String PrTotal = TotalTxtField.getText();
                String cartData[] = {PrName, PrQuantity, PrPrice, PrTotal};
                CartModel.addRow(cartData);

                QuantitySpinner.setValue(0);
                PrNameTxtField.setText("");
                PrPriceTxtField.setText("");
                TotalTxtField.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Exception 3: Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_CartButtonActionPerformed

    private void ClearChoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearChoiceButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel CartModel = (DefaultTableModel) CartTable.getModel();
        if (CartTable.getSelectedRowCount() == 1) {
            CartModel.removeRow(CartTable.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Product removed successfully from Cart!");
        } else {
            JOptionPane.showMessageDialog(null, "Please Select Row!");
        }
    }//GEN-LAST:event_ClearChoiceButtonActionPerformed

    private void TotalBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBillButtonActionPerformed
        // TODO add your handling code here:
        int total = 0;
        for (int i = 0; i < CartTable.getRowCount(); i++) {
            total = total + Integer.parseInt(CartTable.getValueAt(i, 3).toString());
        }
        String T = Integer.toString(total);
        TotalBillTxtField.setText(T);
    }//GEN-LAST:event_TotalBillButtonActionPerformed

    private void ReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptButtonActionPerformed
        // TODO add your handling code here:
        if (CartTable.getRowCount() == 0 || TotalBillTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Either Cart  is empty!");
        } else {

            DefaultTableModel CartModel = (DefaultTableModel) CartTable.getModel();
            ReceiptPanel.setVisible(true);
            ReceiptArea.setText("************************************************\n");
            ReceiptArea.setText(ReceiptArea.getText() + "\t  Super Store Management System\n");
            ReceiptArea.setText(ReceiptArea.getText() + "************************************************\n");
            Date date = new Date();
            ReceiptArea.setText(ReceiptArea.getText() + "Date: " + date + "\n");
            ReceiptArea.setText(ReceiptArea.getText() + "Seller Name: " + email + "\n");
            for (int i = 0; i < CartTable.getRowCount(); i++) {
                ReceiptArea.setText(ReceiptArea.getText() + "Product Name= " + CartTable.getValueAt(i, 0).toString() + " Quantity= " + CartTable.getValueAt(i, 1).toString() + "\nPrice= " + CartTable.getValueAt(i, 2).toString() + "\n");
            }
            ReceiptArea.setText(ReceiptArea.getText() + "\nTotal = " + TotalBillTxtField.getText() + "\n");
            ReceiptArea.setText(ReceiptArea.getText() + "************************************************\n");
            ReceiptArea.setText(ReceiptArea.getText() + "\t  Thank You For Visiting Our Store\n");
            ReceiptArea.setEditable(false);

            try {
                Connection con = MySqlConnection.getCon();

                String query = "ALTER TABLE storerecord AUTO_INCREMENT=1;";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();

                query = "Insert into storerecord value(?,?,?,?)";
                ps = con.prepareStatement(query);
                ps.setString(1, null);
                ps.setString(2, email);
//                java.sql.Date sqlDate = new java.sql.Date(date.getDate());
                long millis = System.currentTimeMillis();

                // creating a new object of the class Date  
                java.sql.Date date2 = new java.sql.Date(millis);
                ps.setDate(3, date2);
                ps.setInt(4, Integer.parseInt(TotalBillTxtField.getText()));
                ps.executeUpdate();
                con.close();
                int BillNo = Integer.parseInt(BillLabel.getText());
                BillNo++;
                BillLabel.setText(Integer.toString(BillNo));
                CartModel.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Bill Added to Store Record!");
                TotalBillTxtField.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Exception 4: Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ReceiptButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        CustomerName.setText("");
        ReceiptArea.setText("");
        ReceiptPanel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        int num;
        num = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (num == 0) {
            setVisible(false);
            LoginScreen move2 = new LoginScreen();
            move2.setVisible(true);
        }

    }//GEN-LAST:event_jLabel10MouseClicked

    public void fillComboBox() {
        try {
            Connection con = MySqlConnection.getCon();
            String query = "select * from categroyinfo;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CategoryComboBox.addItem(rs.getString("category_name"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Exception 5: Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceCustomerOrderEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillLabel;
    private javax.swing.JButton CartButton;
    private javax.swing.JTable CartTable;
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton ClearChoiceButton;
    private javax.swing.JLabel LoginNameTF;
    private javax.swing.JTextField PrNameTxtField;
    private javax.swing.JTextField PrPriceTxtField;
    private javax.swing.JSpinner QuantitySpinner;
    private javax.swing.JTextArea ReceiptArea;
    private javax.swing.JButton ReceiptButton;
    private javax.swing.JPanel ReceiptPanel;
    private javax.swing.JButton TotalBillButton;
    private javax.swing.JTextField TotalBillTxtField;
    private javax.swing.JTextField TotalTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
