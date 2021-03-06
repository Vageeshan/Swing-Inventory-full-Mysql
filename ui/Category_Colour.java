/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.ui;

import com.system.DBConnection.Registration;
import com.system.category_colourDb.CategoryColr;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class Category_Colour extends javax.swing.JFrame {

    PreparedStatement ps, ps2 = null;
    ResultSet rs, rs2 = null;

    public Category_Colour() {
        initComponents();
        loadTables();

        JTableHeader Theader = jTable1.getTableHeader();
        Theader.setBackground(Color.MAGENTA);

        Theader.setForeground(Color.GREEN);
        jTable1.setRowHeight(30);
        Theader.setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        jTable1.setBackground(Color.white);

        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.GRAY);

        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.setDefaultRenderer(Object.class, centerRenderer);

        JTableHeader Theader2 = jTable2.getTableHeader();
        Theader2.setBackground(Color.MAGENTA);

        Theader2.setForeground(Color.GREEN);
        jTable2.setRowHeight(30);
        Theader2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jTable2.setBackground(Color.white);

        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.setGridColor(Color.GRAY);

        ((DefaultTableCellRenderer) Theader2.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer2.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.setDefaultRenderer(Object.class, centerRenderer);

    }

    public void loadTables() {
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query1 = "SELECT * FROM registration.item_category";
            ps = ob.con.prepareStatement(query1);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            // ob.con.close();

            String query2 = "SELECT * FROM registration.item_colour";
            ps2 = ob.con.prepareStatement(query2);
            rs2 = ps2.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs2));
            ob.con.close();

        } catch (Exception ex) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CATEGORY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 38));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1050, 60));

        jPanel3.setBackground(new java.awt.Color(18, 30, 49));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 420, 210));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Button-Add-icon.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Edit-validated-icon.png")); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 60));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\recyclebin-icon.png")); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 400, 110));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 220, 40));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 220, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 490, 480));

        jPanel4.setBackground(new java.awt.Color(18, 30, 49));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Button-Add-icon.png")); // NOI18N
        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 60));

        jButton5.setBackground(new java.awt.Color(255, 255, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Edit-validated-icon.png")); // NOI18N
        jButton5.setText("EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 60));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\recyclebin-icon.png")); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 60));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 470, 110));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, 40));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 180, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Colour Code");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Colour Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 510, 470));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\pa.PNG")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 320, 520));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\pa.PNG")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 450, 520));

        jButton7.setBackground(new java.awt.Color(0, 51, 102));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Close-icon.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "PLEASE ENTER CATEGORY NAME!");
        } else {
            CategoryColr ob = new CategoryColr();
            String name = jTextField2.getText();
            int result = ob.insertToCat(name);
            if (result == 1) {
                JOptionPane.showMessageDialog(rootPane, "New Category addedd SuccessFully!");
                loadTables();
            } else {

                JOptionPane.showMessageDialog(rootPane, "Something wrong!");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CategoryColr ob = new CategoryColr();
        int id = Integer.parseInt(jTextField1.getText());
        String name = jTextField2.getText();
        int result = ob.updateCategory(name, id);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "Category Updated SuccessFully!");
            loadTables();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Something wrong!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CategoryColr ob = new CategoryColr();
        int id = Integer.parseInt(jTextField1.getText());
        int result = ob.eraseCategory(id);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "Category removed SuccessFully!");
            loadTables();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Something wrong!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CategoryColr ob = new CategoryColr();
        String name = jTextField4.getText();
        int result = ob.insertToColour(name);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "New Colour addedd SuccessFully!");
            loadTables();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Something wrong!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CategoryColr ob = new CategoryColr();
        int id = Integer.parseInt(jTextField3.getText());
        String name = jTextField4.getText();
        int result = ob.updateColour(name, id);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "Colour Updated SuccessFully!");
            loadTables();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Something wrong!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        CategoryColr ob = new CategoryColr();
        int id = Integer.parseInt(jTextField3.getText());
        int result = ob.eraseColour(id);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "Colour removed SuccessFully!");
            loadTables();
        } else {

            JOptionPane.showMessageDialog(rootPane, "Something wrong!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Category_Colour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category_Colour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category_Colour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category_Colour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category_Colour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
