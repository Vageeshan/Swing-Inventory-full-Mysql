/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.ui;

import com.system.DBConnection.Registration;
import com.system.stock.StockDb;
import com.system.user.DbUserOperations;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class Stock extends javax.swing.JFrame {

    /**
     * Creates new form Stock
     */
    public Stock() {
        initComponents();
        loadTable();

        JTableHeader Theader = jTable1.getTableHeader();
        Theader.setBackground(Color.MAGENTA);

        Theader.setForeground(Color.DARK_GRAY);
        jTable1.setRowHeight(30);
        Theader.setFont(new Font("Segoe UI", Font.BOLD, 14));
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

    private void loadTable() {

        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query = "SELECT * FROM registration.stock_details";
            PreparedStatement ps = ob.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {

            System.out.println(ex.toString());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 30, 49), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("PURCHASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 141, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("SALE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 130, 41));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("UPDATE STOCK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("REMOVE STOCK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 140, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\New folder (2)\\AP\\AP\\colours-drop.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 460));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 149, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 30, 49));
        jLabel1.setText("Item Code");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 68, 35));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setText("Quantity");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 34));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 390, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\New folder (2)\\AP\\AP\\imgbin-vadodara-asian-paints-ltd-industry-color-paint-3qA6HchDL4gqLpstii0eCzAss.jpg")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 660, 320));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 30, 49));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 160, 60));

        jButton5.setBackground(new java.awt.Color(0, 0, 51));
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Close-icon.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB", 1, 11)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Apps-session-logout-icon.png")); // NOI18N
        jButton6.setText("LOGOUT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 140, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("STOCK ZONE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 120, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 970, 540));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\imgbin-inventory-management-software-warehouse-management-system-warehouse-uTi0G5ygqpuBdDeQZsEfQ4CRW.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 420, 680));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\New folder (2)\\AP\\AP\\Asian Paints logo.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1410, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int itemCode = Integer.parseInt(jTextField1.getText());
        int qty = Integer.parseInt(jTextField2.getText());
        StockDb ob = new StockDb();
        int result = ob.inserttoStock(itemCode, qty);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "EXISTING STOCK UPDATED");
            loadTable();
        } else if (result == 2) {

            JOptionPane.showMessageDialog(rootPane, "NEW STOCK ADDED");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "OOPS SOMETHING WRONG");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();

        jTextField1.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField2.setText(model.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int itemCode = Integer.parseInt(jTextField1.getText());
        int qty = Integer.parseInt(jTextField2.getText());
        StockDb ob = new StockDb();
        int result = ob.deductfromStock(itemCode, qty);
        switch (result) {
            case 1:
                JOptionPane.showMessageDialog(rootPane, "EXISTING STOCK UPDATED");
                loadTable();
                break;
            case 2:
                JOptionPane.showMessageDialog(rootPane, "INVALID ITEM CODE");
                break;
            case 3:
                JOptionPane.showMessageDialog(rootPane, "LIMITED STOCK IS AVAILABLE");
                break;
            case 4:
                JOptionPane.showMessageDialog(rootPane, "QTY CANT BE ZERO");
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "OOPS SOMETHING WRONG");
                break;
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int itemCode = Integer.parseInt(jTextField1.getText());
        int qty = Integer.parseInt(jTextField2.getText());
        StockDb ob = new StockDb();
        int result = ob.updateStock(itemCode, qty);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "EXISTING STOCK UPDATED");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "OOPS SOMETHING WRONG");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here        int itemCode = Integer.parseInt(jTextField1.getText());
        int itemcode = Integer.parseInt(jTextField1.getText());
        StockDb ob = new StockDb();
        int result = ob.deleteStock(itemcode);
        if (result == 1) {
            JOptionPane.showMessageDialog(rootPane, "STOCK REMOVED SUCCESSFULLY");
            loadTable();
        } else {
            JOptionPane.showMessageDialog(rootPane, "OOPS SOMETHING WRONG");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try {
            Date currentDate = new Date();
            SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss a");
            String time = timeformat.format(currentDate);
            DbUserOperations ob = new DbUserOperations();
            ob.update_LogoutLogs(time);
            NewLogin ob2 = new NewLogin();
            ob2.setVisible(true);
            this.setVisible(false);
           

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, ex);
        }
        

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
