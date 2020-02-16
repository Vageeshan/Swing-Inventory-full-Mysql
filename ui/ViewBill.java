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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class ViewBill extends javax.swing.JFrame {

    ResultSet rs, rs2, rs3 = null;
    PreparedStatement ps, ps2, ps3 = null;

    public ViewBill() {
        initComponents();
        loadTables();
        
        
         
         JTableHeader Theader = jTable1.getTableHeader();
        Theader.setBackground(Color.MAGENTA);

        Theader.setForeground(Color.BLUE);
        jTable1.setRowHeight(30);
        Theader.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jTable1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable1.setBackground(Color.white);
        
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.ORANGE);

        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.setDefaultRenderer(Object.class, centerRenderer);
        
        
        
        
         
         JTableHeader Theader2 = jTable2.getTableHeader();
        Theader2.setBackground(Color.MAGENTA);

        Theader2.setForeground(Color.DARK_GRAY);
        jTable2.setRowHeight(30);
        Theader2.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jTable2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable2.setBackground(Color.white);
        
        jTable2.setRowHeight(30);
        jTable2.setShowGrid(true);
        jTable2.setGridColor(Color.PINK);

        ((DefaultTableCellRenderer) Theader2.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer2.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.setDefaultRenderer(Object.class, centerRenderer);
        
        
        
        
        
        
         
         JTableHeader Theader3 = jTable3.getTableHeader();
        Theader3.setBackground(Color.MAGENTA);

        Theader3.setForeground(Color.RED);
        jTable3.setRowHeight(30);
        Theader3.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jTable3.setFont(new Font("Segoe UI", Font.BOLD, 15));
        jTable3.setBackground(Color.white);
        
        jTable3.setRowHeight(30);
        jTable3.setShowGrid(true);
        jTable3.setGridColor(Color.yellow);

        ((DefaultTableCellRenderer) Theader3.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();

        DefaultTableCellRenderer centerRenderer3 = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable3.setDefaultRenderer(Object.class, centerRenderer);
        
        
        
        
        
        
        
        
        
       
    }

    private void loadTables() {

        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query1 = "SELECT sale_code,sale_master_id,item_name,quantity,"
                    + "total,customer_id_ref,grant_total,paid,balance,bill_date,bill_time"
                    + " FROM registration.sale_details sle inner join "
                    + "registration.sale_master mas on mas.sale_master_id = sle.sale_masterId_ref";
            String query2 = "SELECT * FROM registration.sale_details";
            String query3 = "SELECT * FROM registration.sale_master";

            ps = ob.con.prepareStatement(query1);
            ps2 = ob.con.prepareStatement(query2);
            ps3 = ob.con.prepareStatement(query3);

            rs = ps.executeQuery();
            rs2 = ps2.executeQuery();
            rs3 = ps3.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable2.setModel(DbUtils.resultSetToTableModel(rs2));
            jTable3.setModel(DbUtils.resultSetToTableModel(rs3));

            ob.con.close();

        } catch (Exception ex) {

            System.out.println(ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 1160, 170));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 1160, 140));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 1170, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter Customer ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, 30));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 230, 40));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\trash-bin-icon.png")); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 43, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Enter Billed Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, 30));

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 240, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Search2.png")); // NOI18N
        jButton2.setText("SEARCH BILL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 180, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1410, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(jDateChooser1.getDate());
        int custome_id = Integer.parseInt(jTextField1.getText());
        
        ItemDb ob = new ItemDb();
        int result = ob.eraseBillRecords(date, custome_id);
        if (result ==1){
        
            JOptionPane.showMessageDialog(rootPane,"RECORD DELETED SUCCESSFULLY");
            loadTables();
        }
        else if (result ==2) {
        
         JOptionPane.showMessageDialog(rootPane,"DATE OR CUSTOMER ID INVALID");
            loadTables();
        }
        else {
                JOptionPane.showMessageDialog(rootPane,"SORRY SOMETHING WENT WRONG!!!!");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SearchBill ob = new SearchBill();
        ob.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
