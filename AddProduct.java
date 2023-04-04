package SSMSystem;

import DataBaseWork.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddProduct extends javax.swing.JFrame {

    public AddProduct() {
        initComponents();
        fillComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NameProductTxtField = new javax.swing.JTextField();
        PriceTxtField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        SupplierName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProductStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(550, 80, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Name Of Product");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Price ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        NameProductTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameProductTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameProductTxtFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameProductTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 240, -1));

        PriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(PriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 240, -1));

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.setMaximumSize(new java.awt.Dimension(103, 33));
        AddButton.setMinimumSize(new java.awt.Dimension(103, 33));
        AddButton.setPreferredSize(new java.awt.Dimension(103, 33));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        ClearButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clear.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox1.setMinimumSize(new java.awt.Dimension(6, 30));
        jComboBox1.setPreferredSize(new java.awt.Dimension(6, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 240, -1));

        SupplierName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierNameActionPerformed(evt);
            }
        });
        getContentPane().add(SupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Supplier Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Product Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        ProductStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProductStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductStatusActionPerformed(evt);
            }
        });
        getContentPane().add(ProductStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 240, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit (1).png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add-Prodcut--SSMS.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameProductTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameProductTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameProductTxtFieldActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        boolean cond = true;
        try {
            if (NameProductTxtField.getText().equals("") || jComboBox1.getSelectedItem().toString().equals("Select") || PriceTxtField.getText().equals("") || SupplierName.getText().equals("") || ProductStatus.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please provide complete information", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (SupplierName.getText() != null) {
                Connection con = MySqlConnection.getCon();
                String query = "SELECT * FROM supplier";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                String suppliername = "";
                while (rs.next()) {
                    suppliername = rs.getString(2);
                    if (suppliername.equals(SupplierName.getText())) {
                        String prdName = NameProductTxtField.getText();
                        String catName = jComboBox1.getSelectedItem().toString();
                        int prdPrice = Integer.parseInt(PriceTxtField.getText());
                        String supName = SupplierName.getText();
                        String prdStatus = ProductStatus.getText();

                        query = "ALTER TABLE " + catName + " AUTO_INCREMENT=1;";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.execute();

                        query = "insert into " + catName + " value (?,?,?,?)";
                        ps = con.prepareStatement(query);
                        ps.setString(1, null);
                        ps.setString(2, prdName);
                        ps.setInt(3, prdPrice);
                        ps.setString(4, prdStatus);
                        ps.executeUpdate();

                        query = "ALTER TABLE completeinfo AUTO_INCREMENT=1;";
                        ps = con.prepareStatement(query);
                        ps.execute();

                        query = "insert into completeinfo value (?,?,?,?,?,?)";
                        ps = con.prepareStatement(query);
                        ps.setString(1, null);
                        ps.setString(2, prdName);
                        ps.setString(3, catName);
                        ps.setString(4, supName);
                        ps.setInt(5, prdPrice);
                        ps.setString(6, prdStatus);
                        ps.executeUpdate();
                        con.close();
                        JOptionPane.showMessageDialog(this, "Product Added Successfully According To Category!!");
                        NameProductTxtField.setText("");
                        jComboBox1.setSelectedItem("Select");
                        PriceTxtField.setText("");
                        SupplierName.setText("");
                        ProductStatus.setText("");
                        cond = false;
                        break;

                    }
                }
                if (cond) {
                    JOptionPane.showMessageDialog(this, "This is new supplier first please add the supplier!");
                    NameProductTxtField.setText("");
                    jComboBox1.setSelectedItem("Select");
                    PriceTxtField.setText("");
                    SupplierName.setText("");
                    ProductStatus.setText("");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
//        ProductIDTxtField.setText("");
        NameProductTxtField.setText("");
        jComboBox1.setSelectedItem("Select");
        PriceTxtField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierNameActionPerformed

    private void ProductStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductStatusActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        AdminOptionsScreen aos = new AdminOptionsScreen();
        aos.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked
    public void fillComboBox() {
        try {
            Connection con = MySqlConnection.getCon();
            String query = "select * from categroyinfo;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getString("category_name"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField NameProductTxtField;
    private javax.swing.JTextField PriceTxtField;
    private javax.swing.JTextField ProductStatus;
    private javax.swing.JTextField SupplierName;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
