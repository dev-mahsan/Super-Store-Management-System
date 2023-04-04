package SSMSystem;

import javax.swing.JOptionPane;

public class AdminOptionsScreen extends javax.swing.JFrame {

    String loginInfo = LoginScreen.email;

    public AdminOptionsScreen() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OrderButton = new javax.swing.JButton();
        FoodCategoryButton = new javax.swing.JButton();
        AddProductButton = new javax.swing.JButton();
        DeleteProductButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ViewDetailsButton = new javax.swing.JButton();
        AddEmployee = new javax.swing.JButton();
        AddSupplierBtton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrderButton.setBackground(new java.awt.Color(255, 255, 255));
        OrderButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OrderButton.setText("Place Order");
        OrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 220, 40));

        FoodCategoryButton.setBackground(new java.awt.Color(255, 255, 255));
        FoodCategoryButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FoodCategoryButton.setText("Manage Category");
        FoodCategoryButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FoodCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodCategoryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FoodCategoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 40));

        AddProductButton.setBackground(new java.awt.Color(255, 255, 255));
        AddProductButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddProductButton.setText("Add Product");
        AddProductButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 220, 40));

        DeleteProductButton.setBackground(new java.awt.Color(255, 255, 255));
        DeleteProductButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteProductButton.setText("Edit Product");
        DeleteProductButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 40));

        LogoutButton.setBackground(new java.awt.Color(255, 255, 255));
        LogoutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 220, 40));

        ViewDetailsButton.setBackground(new java.awt.Color(255, 255, 255));
        ViewDetailsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ViewDetailsButton.setText("View Details");
        ViewDetailsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetailsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 220, 40));

        AddEmployee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddEmployee.setText("Add Employee");
        AddEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(AddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 220, 40));

        AddSupplierBtton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddSupplierBtton.setText("Add Supplier");
        AddSupplierBtton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddSupplierBtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupplierBttonActionPerformed(evt);
            }
        });
        getContentPane().add(AddSupplierBtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 220, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin-Home-Page-SSMS.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetailsButtonActionPerformed
        ViewDetails vw = new ViewDetails();
        vw.setVisible(true);
    }//GEN-LAST:event_ViewDetailsButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        int num;
        num = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (num == 0) {
            setVisible(false);
            LoginScreen move2 = new LoginScreen();
            move2.setVisible(true);
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        PlaceCustomerOrder pso = new PlaceCustomerOrder();
        pso.setVisible(true);
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void FoodCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodCategoryButtonActionPerformed
        ManageCategory mfc = new ManageCategory();
        mfc.setVisible(true);
    }//GEN-LAST:event_FoodCategoryButtonActionPerformed

    private void DeleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductButtonActionPerformed
        EditOrDeleteProduct edp = new EditOrDeleteProduct();
        edp.setVisible(true);
    }//GEN-LAST:event_DeleteProductButtonActionPerformed

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
        AddProduct ad = new AddProduct();
        ad.setVisible(true);
    }//GEN-LAST:event_AddProductButtonActionPerformed

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        // TODO add your handling code here:
        AddEmployee ae = new AddEmployee();
        ae.setVisible(true);
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void AddSupplierBttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupplierBttonActionPerformed
        // TODO add your handling code here:
        AddSupplier as = new AddSupplier();
        as.setVisible(true);
    }//GEN-LAST:event_AddSupplierBttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployee;
    private javax.swing.JButton AddProductButton;
    private javax.swing.JButton AddSupplierBtton;
    private javax.swing.JButton DeleteProductButton;
    private javax.swing.JButton FoodCategoryButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrderButton;
    private javax.swing.JButton ViewDetailsButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
