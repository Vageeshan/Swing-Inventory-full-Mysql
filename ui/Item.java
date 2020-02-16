/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.ui;

import com.system.DBConnection.Registration;
import com.system.item.ItemDb;
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
public class Item extends javax.swing.JFrame {

    PreparedStatement ps, ps2, ps3 = null;
    ResultSet rs, rs2, rs3 = null;

    public Item() {
        initComponents();
        showTable();
        loadCombo();

        JTableHeader Theader = jTable1.getTableHeader();
        Theader.setBackground(Color.MAGENTA);

        Theader.setForeground(Color.DARK_GRAY);
        jTable1.setRowHeight(30);
        Theader.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jTable1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTable1.setBackground(Color.white);

        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.red);

        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.setDefaultRenderer(Object.class, centerRenderer);

    }

    private void showTable() {

        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "SELECT * FROM registration.item_details";
            ps = ob.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, ex);
        }

    }

    private void loadCombo() {

        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query = "SELECT * FROM registration.item_category";
            String query2 = "SELECT * FROM registration.item_colour";
            String query3 = "SELECT * FROM registration.item_capacity";
            ps = ob.con.prepareStatement(query);
            ps2 = ob.con.prepareStatement(query2);
            ps3 = ob.con.prepareStatement(query3);
            rs = ps.executeQuery();
            rs2 = ps2.executeQuery();
            rs3 = ps3.executeQuery();
            while (rs.next()) {
                String name = rs.getString("category_name");
                jComboBox3.addItem(name);

            }
            while (rs2.next()) {
                String color = rs2.getString("colour_name");
                jComboBox2.addItem(color);
            }
            while (rs3.next()) {
                String capacity = rs3.getString("item_capacity");
                jComboBox1.addItem(capacity);
            }
            ob.con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ITEM REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1100, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Item Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 24));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Item Capacity:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 23));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Buying Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 22));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Selling Price:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 23));

        jTextField1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 103, 215, 40));

        jTextField3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 215, 33));

        jTextField4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 215, 33));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 690, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Button-Add-icon.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Settings-2-icon.png")); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, 60));

        jButton3.setBackground(new java.awt.Color(102, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\trash-icon.png")); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 130, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 520, 120));

        jComboBox1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 215, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Item Category:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Item Colour:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jComboBox2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 210, 40));

        jComboBox3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, 40));

        jTextField2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 180, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Item code");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 90, 30));

        jButton4.setBackground(new java.awt.Color(51, 0, 102));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Close-icon.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 40, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\New folder (2)\\drop.PNG")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 510, 480));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\New folder (2)\\AP\\AP\\Ap.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 910, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1230, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextField1.getText().isEmpty() || jComboBox1.getSelectedItem().toString().isEmpty() || jComboBox2.getSelectedItem().toString().isEmpty() || jComboBox3.getSelectedItem().toString().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "PLEASE FILL ALL FIELDS");
        } else {
            String name = jTextField1.getText();
            String category = jComboBox3.getSelectedItem().toString();
            String color = jComboBox2.getSelectedItem().toString();
            String capacity = jComboBox1.getSelectedItem().toString();
            double buy_price = Double.parseDouble(jTextField3.getText());
            double sell_price = Double.parseDouble(jTextField4.getText());

            ItemDb ob = new ItemDb();
            int result = ob.insertItem(name, category, color, capacity, buy_price, sell_price);

            if (result == 1) {
                JOptionPane.showMessageDialog(rootPane, "NEW ITEM ADDED SUCCESSFULLY!!!!");
                showTable();
            } else {
                JOptionPane.showMessageDialog(rootPane, "SOMETHING WENT WRONG");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRowIndex = jTable1.getSelectedRow();
            jTextField2.setText(model.getValueAt(selectedRowIndex, 0).toString());
            jTextField1.setText(model.getValueAt(selectedRowIndex, 1).toString());
            jComboBox3.setSelectedItem(model.getValueAt(selectedRowIndex, 2));
            jComboBox2.setSelectedItem(model.getValueAt(selectedRowIndex, 3));
            jComboBox1.setSelectedItem(model.getValueAt(selectedRowIndex, 4));
            jTextField3.setText(model.getValueAt(selectedRowIndex, 5).toString());
            jTextField4.setText(model.getValueAt(selectedRowIndex, 6).toString());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String name = jTextField1.getText();
        String category = jComboBox3.getSelectedItem().toString();
        String color = jComboBox2.getSelectedItem().toString();
        String capacity = jComboBox1.getSelectedItem().toString();
        double buy_price = Double.parseDouble(jTextField3.getText());
        double sell_price = Double.parseDouble(jTextField4.getText());
        int id = Integer.parseInt(jTextField2.getText());

        ItemDb ob = new ItemDb();
        int result = ob.updateItem(name, category, color, capacity, buy_price, sell_price, id);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "ITEM UPDATED SUCESSFULLY!!!");
            showTable();

        } else {
            JOptionPane.showMessageDialog(rootPane, "SOMETHING WENT WRONG!!!");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int id = Integer.parseInt(jTextField2.getText());
        ItemDb ob = new ItemDb();
        try {

            int status = ob.checkId(id);
            if (status == 1) {

                int result = ob.eraseItem(id);

                if (result == 1) {
                    JOptionPane.showMessageDialog(rootPane, "ITEM DELETED SUCCESSFULLY!!!");
                    showTable();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "SOMETHING WENT WRONG");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "ID NOT FOUND");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
