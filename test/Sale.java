/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.test;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Sale
     */
    public Sale() {
        initComponents();
        jTextField6.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setEditable(false);

        jTextField3.setEditable(false);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "ItemName", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Itm Code");

        jLabel2.setText("Item Name");

        jLabel3.setText("Price");

        jLabel4.setText("QTY");

        jLabel5.setText("Unit Price");

        jLabel6.setText("Total");

        jLabel7.setText("Paid");

        jLabel8.setText("Balance");

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Trash");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addGap(101, 101, 101)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel4)
                .addGap(127, 127, 127)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(186, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(148, 148, 148)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test", "root", "root");
                // System.out.println("connected");

                String query = "SELECT * FROM test.items WHERE item_code = ? ";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, jTextField1.getText());

                ResultSet rs = ps.executeQuery();
                jTextField4.requestFocus();
                if (rs.next()) {
                    String name = rs.getString("item_name");
                    jTextField2.setText(name);

                    String buying_price = rs.getString("buying_price");
                    jTextField3.setText(buying_price);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Item not availale check the item code and try again");
                    jTextField1.setText("");
                    jTextField1.requestFocus();
                }

            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {

            jTextField7.requestFocus();

        }


    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

           
                DbOperations ob = new DbOperations();
                int test_qty = Integer.parseInt(jTextField4.getText());
                int check_qty = ob.checkStock(Integer.parseInt(jTextField1.getText()));
                System.out.println("dbQTY"+check_qty);
                if (check_qty < test_qty){
                
                    JOptionPane.showMessageDialog(rootPane,"LIMITED STOCK IS AVILABLE");
                    jTextField4.setText("");
                    jTextField4.requestFocus();
                }
                else {
           
            try {
                double price = Double.parseDouble(jTextField3.getText());
                double qty = Double.parseDouble(jTextField4.getText());
                double total_price = Double.parseDouble(jTextField6.getText());
                double total = price * qty;
                total_price = total + total_price;

                jTextField5.setText(Double.toString(total));
                jTextField6.setText(Double.toString(total_price));

                jTextField5.requestFocus();

            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
                }
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            model.addRow(new Object[]{jTextField1.getText(), jTextField2.getText(), jTextField4.getText(), jTextField5.getText()});
            clearFields();
            jTextField1.requestFocus();
        }


    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            int selectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(selectedRowIndex);

            double unit = Double.parseDouble(jTextField5.getText());
            double total = Double.parseDouble(jTextField6.getText());
            total = total - unit;
            jTextField6.setText(Double.toString(total));
            clearFields();

            // jTextField8.setText(model.getValueAt(selectedRow, 3).toString());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();
            jTextField1.setText(model.getValueAt(selectedRow, 0).toString());
            jTextField2.setText(model.getValueAt(selectedRow, 1).toString());
            jTextField4.setText(model.getValueAt(selectedRow, 2).toString());
            jTextField5.setText(model.getValueAt(selectedRow, 3).toString());

            double unit = Double.parseDouble(jTextField5.getText());
            double qty = Double.parseDouble(jTextField4.getText());
            double price = unit / qty;
            jTextField3.setText(Double.toString(price));

        } catch (Exception ex) {
            System.out.println(ex.toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {

            if (i >= 0) {

                double price = Double.parseDouble(jTextField3.getText());
                double qty = Double.parseDouble(jTextField4.getText());
                double unit = price * qty;
                jTextField5.setText(Double.toString(unit));

                model.setValueAt(jTextField1.getText(), i, 0);
                model.setValueAt(jTextField2.getText(), i, 1);
                model.setValueAt(jTextField4.getText(), i, 2);
                model.setValueAt(jTextField5.getText(), i, 3);

            }
            double total = 0;
            for (int a = 0; a < jTable1.getRowCount(); a++) {
                total = total + Double.parseDouble(jTable1.getValueAt(a, 3).toString());
            }
            jTextField6.setText(Double.toString(total));
            clearFields();
            jTextField1.requestFocus();

        } catch (Exception ex) {

            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int dbQty = 0;
        int status = 0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "root");
            System.out.println("Connected");

            Statement stm = con.createStatement();
            Statement stm1 = con.createStatement();

            for (int i = 0; i < model.getRowCount(); i++) {

                int itemCode = Integer.parseInt(model.getValueAt(i, 0).toString());
                String name = model.getValueAt(i, 1).toString();
                int qty = Integer.parseInt(model.getValueAt(i, 2).toString());
                double unitPrice = Double.parseDouble(model.getValueAt(i, 3).toString());

                String query = "INSERT INTO `test`.`sales` (`item_code`,`item_name`,`quantity`,`total`) VALUES ('" + itemCode + "', '" + name + "','" + qty + "','" + unitPrice + "')";
                String sql = "Select * from test.stock where item_code_ref = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, itemCode);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    dbQty = rs.getInt("quantity");
                    System.out.println("QTY : " + dbQty);

                    if (dbQty >= qty) {
                        String query2 = "update test.stock set quantity = quantity - '" + qty + "' where item_code_ref ='" + itemCode + "'";

                        stm1.addBatch(query2);

                        stm.addBatch(query);
                        status = 1;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Limited Stock is available" + " " + "ITEM CODE" + rs.getInt("item_code_ref") + "  " + dbQty + " is Available", "Check The stock", JOptionPane.ERROR_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Item code is not available");

                }

                // stm.addBatch(query);
                //  String query2 = "update test.stock set quantity = quantity + '" + qty + "' where item_code_ref ='" + itemCode + "'";
                //  stm1.addBatch(query2);
                // System.out.println(query2);
            }
            if (status == 1) {
                int[] rowInserted = stm.executeBatch();
                int[] updated = stm1.executeBatch();

                // int[] stockInsert = stm2.executeBatch();
                System.out.println("Rows inserted vetti");
                System.out.println("Total Rows : " + rowInserted.length);
                JOptionPane.showMessageDialog(rootPane, "Sale record added & Transaction Success");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Transaction Cancelled", "Due to unavailability of stock", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, ex);
            System.out.println("Kadum error" + ex.toString());
        }


    }//GEN-LAST:event_jButton1ActionPerformed
    public void clearFields() {

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");

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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}