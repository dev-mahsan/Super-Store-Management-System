package SSMSystem;

import java.sql.*;
import DataBaseWork.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageCategory extends javax.swing.JFrame {

    public ManageCategory() {
        initComponents();
        DefaultTableModel CategoryModel = (DefaultTableModel) CategoryTable.getModel();
        int id = 0;
        String cat_name = "";
        try {
            Connection con = MySqlConnection.getCon();
            String query = "select * from categroyinfo";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt(1);
                cat_name = rs.getString(2);
                String catgryData[] = {Integer.toString(id), cat_name};
                CategoryModel.addRow(catgryData);
            }
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        CategoryTxtField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(550, 80, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Category Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        CategoryTxtField.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        CategoryTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryTxtFieldActionPerformed(evt);
            }
        });
        getContentPane().add(CategoryTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 370, 30));

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 110, -1));

        ClearButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clear.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setMaximumSize(new java.awt.Dimension(95, 33));
        ClearButton.setMinimumSize(new java.awt.Dimension(95, 33));
        ClearButton.setPreferredSize(new java.awt.Dimension(95, 33));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Instructions: Delete the category by clicking on the row.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        CategoryTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 280, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage-Category-SSMS.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:        
        String CategoryName = CategoryTxtField.getText();
        if (CategoryTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Category Name is Empty", "Error", JOptionPane.ERROR_MESSAGE);
            //FoodCategoryTxtField.setText("");
        } else {
            try {
                Connection con = MySqlConnection.getCon();
                String query = "ALTER TABLE categroyinfo AUTO_INCREMENT=1;";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                query = "insert into categroyinfo values (?,?)";
                ps = con.prepareStatement(query);
                ps.setString(1, null);
                ps.setString(2, CategoryName);
//                ps.setString(1, CategoryName);
                ps.executeUpdate();
                query = "Create table " + CategoryName + "(ProductID int AUTO_INCREMENT, ProductName varchar(40),ProductPrice int, ProductStatus VARCHAR(10),PRIMARY KEY(ProductID));";
                ps = con.prepareStatement(query);
                ps.executeUpdate();
                DefaultTableModel CategoryModel = (DefaultTableModel) CategoryTable.getModel();
                int id = 0;
                query = "select * from categroyinfo";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    id = rs.getInt(1);
                }
                con.close();
                String catgryData[] = {Integer.toString(id), CategoryName};
                CategoryModel.addRow(catgryData);
                JOptionPane.showMessageDialog(this, "Category Added Successfully!!!");

                CategoryTxtField.setText(null);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CategoryTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryTxtFieldActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        CategoryTxtField.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
        // TODO add your handling code here:
        int i = CategoryTable.getSelectedRow();
        String CategoryID = CategoryTable.getModel().getValueAt(i, 0).toString();
        String CategoryName = CategoryTable.getModel().getValueAt(i, 1).toString();
        int num;
        num = JOptionPane.showConfirmDialog(null, "Are you sure you want to DELETE category?", "Select", JOptionPane.YES_NO_OPTION);
        if (num == 0) {
            try {
                Connection con = MySqlConnection.getCon();
                String query = "DELETE FROM categroyinfo WHERE category_id=" + CategoryID + " AND category_name='" + CategoryName + "'";
                PreparedStatement ps = con.prepareStatement(query);
                ps.execute();
                //query = "DELETE FROM completeproductinfo WHERE Category='" + CategoryName + "'";
//                ps = con.prepareStatement(query);
//                ps.execute();

                query = "update categroyinfo ae\n"
                        + "JOIN\n"
                        + "(\n"
                        + "SELECT ROW_NUMBER() OVER (\n"
                        + "        ORDER BY category_id\n"
                        + "    ) row_num, category_id\n"
                        + "    FROM categroyinfo\n"
                        + ")AS rw_num \n"
                        + "ON ae.category_id = rw_num.category_id\n"
                        + "set ae.category_id = rw_num.row_num";
                ps = con.prepareStatement(query);
                ps.execute();
                query = "DROP TABLE " + CategoryName;
                ps = con.prepareStatement(query);
                ps.execute();

                query = "DELETE FROM completeinfo where prd_category='" + CategoryName + "'";
                ps = con.prepareStatement(query);
                ps.execute();
                con.close();
                DefaultTableModel CategroyModel = (DefaultTableModel) CategoryTable.getModel();
                if (CategoryTable.getSelectedRowCount() == 1) {
                    CategroyModel.removeRow(i);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Select Single Row!");
                }
                JOptionPane.showMessageDialog(null, "Category DELETED Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_CategoryTableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        AdminOptionsScreen aos = new AdminOptionsScreen();
        aos.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JTextField CategoryTxtField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
