package SSMSystem;

import DataBaseWork.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditOrDeleteProduct extends javax.swing.JFrame {

    public EditOrDeleteProduct() {
        initComponents();
        fillTable();
        fillComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ProducrNameTxtField = new javax.swing.JTextField();
        ProductCategoryComBox = new javax.swing.JComboBox<>();
        ProductPriceTxtField = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompleteProductInfoTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ProductIDTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PrStatusTF = new javax.swing.JTextField();
        PrSupplierTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 70, 0, 0));
        setMinimumSize(new java.awt.Dimension(708, 653));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 99, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Product Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 147, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 196, -1, -1));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updated.png"))); // NOI18N
        UpdateButton.setText("Update ");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 192, 130, -1));

        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setMaximumSize(new java.awt.Dimension(93, 33));
        DeleteButton.setMinimumSize(new java.awt.Dimension(93, 33));
        DeleteButton.setPreferredSize(new java.awt.Dimension(93, 33));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 241, 130, -1));

        ProducrNameTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(ProducrNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 96, 208, -1));

        ProductCategoryComBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProductCategoryComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        ProductCategoryComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductCategoryComBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ProductCategoryComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 144, 208, -1));

        ProductPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(ProductPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 193, 208, -1));

        ClearButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clear.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setMaximumSize(new java.awt.Dimension(93, 33));
        ClearButton.setMinimumSize(new java.awt.Dimension(93, 33));
        ClearButton.setPreferredSize(new java.awt.Dimension(93, 33));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 292, 130, -1));

        CompleteProductInfoTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CompleteProductInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Category", "Product Supplier", "Product Price", "Product Status"
            }
        ));
        CompleteProductInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompleteProductInfoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CompleteProductInfoTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 365, 608, 277));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 51, -1, -1));

        ProductIDTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(ProductIDTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 48, 208, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit (1).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Status");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 246, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Supplier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 297, -1, -1));

        PrStatusTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(PrStatusTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 243, 208, -1));

        PrSupplierTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrSupplierTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrSupplierTFActionPerformed(evt);
            }
        });
        getContentPane().add(PrSupplierTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 294, 208, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit-Product.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void fillTable() {
        DefaultTableModel ProductInfoModel = (DefaultTableModel) CompleteProductInfoTable.getModel();
        ProductInfoModel.setRowCount(0);
//        ViewTableButton.setEnabled(false);
        try {
            Connection con = MySqlConnection.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from completeinfo");
            while (rs.next()) {
                int ProductID = rs.getInt(1);
                String ProductName = rs.getString(2);
                String ProductCategory = rs.getString(3);
                String ProductSupplier = rs.getString(4);
                int ProductPrice = rs.getInt(5);
                String ProductStatus = rs.getString(6);
                String ProductData[] = {String.valueOf(ProductID), ProductName, ProductCategory, ProductSupplier, String.valueOf(ProductPrice), ProductStatus};
                ProductInfoModel.addRow(ProductData);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        boolean cond = true;
        int i = CompleteProductInfoTable.getSelectedRow();
        String PrNameJtable = CompleteProductInfoTable.getModel().getValueAt(i, 1).toString();
        String PrCategoryJtable = CompleteProductInfoTable.getModel().getValueAt(i, 2).toString();

        //for updation
        int PrID = Integer.parseInt(ProductIDTxtField.getText());
        String PrName = ProducrNameTxtField.getText();
        String PrCategory = ProductCategoryComBox.getSelectedItem().toString();
        int PrPrice = Integer.parseInt(ProductPriceTxtField.getText());
        String PrStatus = PrStatusTF.getText();
        String PrSupplier = PrSupplierTF.getText();

        try {

            if (ProductIDTxtField.getText().equals("") || ProducrNameTxtField.getText().equals("") || ProductCategoryComBox.getSelectedItem().toString().equals("") || ProductPriceTxtField.getText().equals("") || PrStatusTF.getText().equals("") || PrSupplierTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please provide complete information", "", JOptionPane.ERROR_MESSAGE);
            } else if (PrStatusTF.getText() != null) {

                Connection con = MySqlConnection.getCon();
                String query = "SELECT * FROM supplier";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                String suppliername = "";
                while (rs.next()) {
                    suppliername = rs.getString(2);
                    if (suppliername.equals(PrSupplierTF.getText())) {
                        con = MySqlConnection.getCon();
                        query = "UPDATE completeinfo SET prd_name='" + PrName + "' ,prd_category='" + PrCategory + "' ,prd_price=" + PrPrice + ", prd_status='" + PrStatus + "', prd_supplier='" + PrSupplier + "' WHERE prd_id=" + PrID + ";";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.execute();

                        if (PrCategoryJtable.equals(PrCategory)) {
                            query = "UPDATE " + PrCategory + " SET ProductName='" + PrName + "' ,ProductPrice=" + PrPrice + " WHERE ProductID=" + PrID + ";";
                            ps = con.prepareStatement(query);
                            ps.execute();
                        } else {
                            query = "DELETE FROM " + PrCategoryJtable + " WHERE ProductName='" + PrNameJtable + "';";
                            ps = con.prepareStatement(query);
                            ps.execute();

                            query = "ALTER TABLE " + PrCategory + " AUTO_INCREMENT=1;";
                            ps = con.prepareStatement(query);
                            ps.execute();

                            query = "insert into " + PrCategory + " value (?,?,?,?)";
                            ps = con.prepareStatement(query);
                            ps.setString(1, null);
                            ps.setString(2, PrName);
                            ps.setInt(3, PrPrice);
                            ps.setString(2, PrStatus);
                            ps.executeUpdate();
                        }

                        con.close();
                        cond = false;
                        JOptionPane.showMessageDialog(null, "Product UPDATED Successfully!!");
                        break;
                    }
                }
                if (cond) {
                    JOptionPane.showMessageDialog(this, "Please provide correct supplier name!");
                    ProductIDTxtField.setText("");
                    ProducrNameTxtField.setText("");
                    ProductCategoryComBox.setSelectedItem("Select");
                    ProductPriceTxtField.setText("");
                    PrStatusTF.setText("");
                    PrSupplierTF.setText("");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        DefaultTableModel ProductInfoModel = (DefaultTableModel) CompleteProductInfoTable.getModel();
        if (CompleteProductInfoTable.getSelectedRowCount() == 1) {
            ProductInfoModel.setValueAt(PrID, CompleteProductInfoTable.getSelectedRow(), 0);
            ProductInfoModel.setValueAt(PrName, CompleteProductInfoTable.getSelectedRow(), 1);
            ProductInfoModel.setValueAt(PrCategory, CompleteProductInfoTable.getSelectedRow(), 2);
            ProductInfoModel.setValueAt(PrSupplier, CompleteProductInfoTable.getSelectedRow(), 3);
            ProductInfoModel.setValueAt(PrPrice, CompleteProductInfoTable.getSelectedRow(), 4);
            ProductInfoModel.setValueAt(PrStatus, CompleteProductInfoTable.getSelectedRow(), 5);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select Single Row!");
        }
        ProductIDTxtField.setText("");
        ProducrNameTxtField.setText("");
        ProductCategoryComBox.setSelectedItem("Select");
        ProductPriceTxtField.setText("");
        PrStatusTF.setText("");
        PrSupplierTF.setText("");
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ProductInfoModel = (DefaultTableModel) CompleteProductInfoTable.getModel();
        int num;
        num = JOptionPane.showConfirmDialog(null, "Are you sure you want to DELETE product?", "Select", JOptionPane.YES_NO_OPTION);
        if (num == 0) {
            String PrID = ProductIDTxtField.getText();
            String PrName = ProducrNameTxtField.getText();
            String PrCategory = ProductCategoryComBox.getSelectedItem().toString();
            String PrPrice = ProductPriceTxtField.getText();
            String PrStatus = PrStatusTF.getText();
            String PrSupplier = PrSupplierTF.getText();
            try {
                Connection con = MySqlConnection.getCon();
                String query = "DELETE FROM " + PrCategory + " WHERE ProductName='" + PrName + "'";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();

                query = "update " + PrCategory + " prCat\n"
                        + "JOIN\n"
                        + "(\n"
                        + "SELECT ROW_NUMBER() OVER (\n"
                        + "        ORDER BY ProductID\n"
                        + "    ) row_num, ProductID\n"
                        + "    FROM " + PrCategory + "\n"
                        + ")AS rw_num \n"
                        + "ON prCat.ProductID = rw_num.ProductID\n"
                        + "set prCat.ProductID = rw_num.row_num";
                ps = con.prepareStatement(query);
                ps.execute();

                query = "DELETE FROM completeinfo WHERE prd_id='" + PrID + "'";
                ps = con.prepareStatement(query);
                ps.execute();

                query = "update completeinfo ci\n"
                        + "JOIN\n"
                        + "(\n"
                        + "SELECT ROW_NUMBER() OVER (\n"
                        + "        ORDER BY prd_id\n"
                        + "    ) row_num, prd_id\n"
                        + "    FROM completeinfo\n"
                        + ")AS rw_num \n"
                        + "ON ci.prd_id = rw_num.prd_id\n"
                        + "set ci.prd_id = rw_num.row_num";
                ps = con.prepareStatement(query);
                ps.execute();
                con.close();
//                if (CompleteProductInfoTable.getSelectedRowCount() == 1) {
//                    ProductInfoModel.removeRow(CompleteProductInfoTable.getSelectedRow());
//                } else {
//                    JOptionPane.showMessageDialog(null, "Please Select Single Row!");
//                }
                JOptionPane.showMessageDialog(null, "Product DELETED Successfully!!");
                ProductInfoModel.setRowCount(0);
                fillTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        ProductIDTxtField.setText("");
        ProducrNameTxtField.setText("");
        ProductCategoryComBox.setSelectedItem("Select");
        ProductPriceTxtField.setText("");
        PrStatusTF.setText("");
        PrSupplierTF.setText("");
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        ProductIDTxtField.setText("");
        ProducrNameTxtField.setText("");
        ProductCategoryComBox.setSelectedItem("Select");
        ProductPriceTxtField.setText("");
        PrStatusTF.setText("");
        PrSupplierTF.setText("");

    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ProductCategoryComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductCategoryComBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductCategoryComBoxActionPerformed

    private void CompleteProductInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompleteProductInfoTableMouseClicked
        // TODO add your handling code here:
        int i = CompleteProductInfoTable.getSelectedRow();

        String PrID = CompleteProductInfoTable.getModel().getValueAt(i, 0).toString();
        String PrName = CompleteProductInfoTable.getModel().getValueAt(i, 1).toString();
        String PrCategory = CompleteProductInfoTable.getModel().getValueAt(i, 2).toString();
        String PrSupplier = CompleteProductInfoTable.getModel().getValueAt(i, 3).toString();
        String PrPrice = CompleteProductInfoTable.getModel().getValueAt(i, 4).toString();
        String PrStatus = CompleteProductInfoTable.getModel().getValueAt(i, 5).toString();
        ProductIDTxtField.setText(PrID);
        ProducrNameTxtField.setText(PrName);
        ProductCategoryComBox.setSelectedItem(PrCategory);
        ProductPriceTxtField.setText(PrPrice);
        PrStatusTF.setText(PrStatus);
        PrSupplierTF.setText(PrSupplier);
    }//GEN-LAST:event_CompleteProductInfoTableMouseClicked

    private void PrSupplierTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrSupplierTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrSupplierTFActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new AdminOptionsScreen().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked
    public void fillComboBox() {
        try {
            Connection con = MySqlConnection.getCon();
            String query = "select * from categroyinfo;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProductCategoryComBox.addItem(rs.getString("category_name"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOrDeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JTable CompleteProductInfoTable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField PrStatusTF;
    private javax.swing.JTextField PrSupplierTF;
    private javax.swing.JTextField ProducrNameTxtField;
    private javax.swing.JComboBox<String> ProductCategoryComBox;
    private javax.swing.JTextField ProductIDTxtField;
    private javax.swing.JTextField ProductPriceTxtField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
