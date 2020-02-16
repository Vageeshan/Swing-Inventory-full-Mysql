/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.ui;

import com.system.DBConnection.Registration;
import com.system.model.UserCons;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Search_user extends javax.swing.JFrame {

    /**
     * Creates new form Search_user
     */
    public Search_user() {
        initComponents();
        findUser();
    }

    public ArrayList<UserCons> ListUser(String value) {

        ArrayList<UserCons> user = new ArrayList<>();
        Statement stmt;
        ResultSet rs;
        try {
            Registration ob = new Registration();
            ob.db_connect();
            stmt = ob.con.createStatement();
            String query = "SELECT * FROM registration.` user_registration_form` where concat(user_id,first_name,last_name,address,contact_number, dob, email, user_status,user_pri_ref_id,created_date,created_by,user_name,password) like '%" + value + "%'";
            // System.out.println("1");
            rs = stmt.executeQuery(query);
            //  System.out.println("2");
            UserCons use;
            while (rs.next()) {

                use = new UserCons(
                        rs.getInt("user_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("address"),
                        rs.getInt("contact_number"),
                        rs.getString("dob"),
                        rs.getString("email"),
                        rs.getString("user_status"),
                        rs.getInt("user_pri_ref_id"),
                        rs.getString("created_date"),
                        rs.getString("created_by"),
                        rs.getString("user_name"),
                        rs.getString("password")
                );
                //System.out.println(rs.getString("user_status"));
                user.add(use);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return user;
    }

    public void findUser() {
        try {
            ArrayList<UserCons> us = ListUser(jTextField1.getText());
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new Object[]{"user_id", "first_name", "last_name", "address", "contact_number", "dob", "email", "user_status", "user_pri_ref_id", "created_date", "created_by", "user_name", "password"});
            Object[] row = new Object[13];
            for (int i = 0; i < us.size(); i++) {

                row[0] = us.get(i).getUser_id();
                row[1] = us.get(i).getFirst_name();
                row[2] = us.get(i).getLast_name();
                row[3] = us.get(i).getAddress();
                row[4] = us.get(i).getContact_number();
                row[5] = us.get(i).getDob();
                row[6] = us.get(i).getEmail();
                row[7] = us.get(i).getUser_status();
                row[8] = us.get(i).getUser_pri_ref_id();
                row[9] = us.get(i).getCreated_date();
                row[10] = us.get(i).getCreated_by();
                row[11] = us.get(i).getUser_name();
                row[12] = us.get(i).getPassword();
                model.addRow(row);

            }
            jTable1.setModel(model);
        } catch (Exception ex) {
            System.out.println("Button" + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 780, 210));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 330, 40));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 880, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        findUser();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        findUser();
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(Search_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
