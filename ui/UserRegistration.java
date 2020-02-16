/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.ui;

import com.system.DBConnection.Registration;
import com.system.user.DbUserOperations;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form UserRegistration
     */
    public UserRegistration() {
        initComponents();
        bindCombo();
        loadCombo();
        try {

            loadTable();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(rootPane, ex);
            
        }
        
         
         JTableHeader Theader = jTable1.getTableHeader();
        Theader.setBackground(Color.MAGENTA);

        Theader.setForeground(Color.DARK_GRAY);
        jTable1.setRowHeight(30);
        Theader.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jTable1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        jTable1.setBackground(Color.white);
        
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.PINK);

        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(jLabel1.CENTER);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(jLabel1.CENTER);
        //  jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.setDefaultRenderer(Object.class, centerRenderer);
        
        
        
        
        
    }

    public void bindCombo() {

        DbUserOperations ob = new DbUserOperations();
        HashMap<String, Integer> map = ob.populateCombo();

        for (String s : map.keySet()) {
            jComboBox2.addItem(s);

        }
    }

    public void loadCombo() {

        try {
            Registration ob = new Registration();
            ob.db_connect();

            String sql = "SELECT * FROM test.user_status";
            PreparedStatement ps = ob.con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("status_type");
                jComboBox1.addItem(name);

            }

        } catch (Exception ex) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(18, 30, 49));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                                       USER REGISTRATION FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 910, 41));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 1380, 60));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 128, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 188, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel5.setText("Contact Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 307, -1, -1));

        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel6.setText("DOB");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 371, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel7.setText("Email id");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 428, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel8.setText("User Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 503, -1, -1));

        jLabel10.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel10.setText("Created by");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 489, -1, 32));

        jLabel11.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel11.setText("created Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 645, -1, -1));

        jLabel12.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel12.setText("User Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 362, -1, -1));

        jLabel13.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 428, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setToolTipText("Enter your Full Name");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 125, 297, 32));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 186, 297, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 248, 297, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 306, 297, 29));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 489, 350, 35));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 425, 297, 33));

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 360, 297, 32));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 635, 297, 31));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 360, 197, 31));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 492, 197, 32));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 426, 197, 31));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 563, 350, 35));

        jLabel14.setFont(new java.awt.Font("Poor Richard", 1, 14)); // NOI18N
        jLabel14.setText("User Privillage");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 562, 99, 35));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 840, 200));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\trash-icon (1).png")); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 60));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Male-user-add-icon.png")); // NOI18N
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 60));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\Icons\\Settings-icon (1).png")); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, 60));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Refresh-icon (1).png")); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 570, 180));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 87, 131, 39));

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 400, 227, 19));

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 464, 240, 19));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\users-2-2-icon.png")); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 110, 110));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\Groups-Meeting-Light-icon.png")); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 240, 230));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\delete-icon.png")); // NOI18N
        jButton5.setToolTipText("Exit and Goto Mainmenu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 80, 60, 60));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\User-Group-icon.png")); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 130, 130));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\person-icon.png")); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 140, 130));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 334, 180, 30));

        jButton6.setBackground(new java.awt.Color(153, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\icon java\\search-icon.png")); // NOI18N
        jButton6.setText("Search Here");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, 60));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Desktop\\New folder (2)\\AP\\AP\\Capture.PNG")); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 400, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1010));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jPasswordField2.getText().isEmpty() || jDateChooser1.getDate() == null || jDateChooser2.getDate() == null || jComboBox1.getSelectedItem().toString().isEmpty() || jComboBox2.getSelectedItem().toString().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "PLEASE FILL ALL FIELDS TO COMPLETE THE ACTION");

        } else {

            DbUserOperations ob = new DbUserOperations();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(jDateChooser1.getDate());
            String date2 = sdf.format(jDateChooser2.getDate());
            String name = jComboBox1.getSelectedItem().toString();

            HashMap<String, Integer> map = ob.populateCombo();

            ob.insert_toUser(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), Integer.parseInt(jTextField4.getText()), date1, jTextField5.getText(), name, Integer.parseInt(map.get(jComboBox2.getSelectedItem()).toString()), date2, jTextField7.getText(), jTextField6.getText(), jPasswordField2.getText());
            try {
                loadTable();
                clearFields();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int selectedRowIndex = jTable1.getSelectedRow();

            jTextField8.setText(model.getValueAt(selectedRowIndex, 0).toString());
            jTextField1.setText(model.getValueAt(selectedRowIndex, 1).toString());
            jTextField2.setText(model.getValueAt(selectedRowIndex, 2).toString());
            jTextField3.setText(model.getValueAt(selectedRowIndex, 3).toString());
            jTextField4.setText(model.getValueAt(selectedRowIndex, 4).toString());

            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedRowIndex, 5).toString());
            jDateChooser1.setDate(date);

            jTextField5.setText(model.getValueAt(selectedRowIndex, 6).toString());
            jComboBox1.setSelectedItem(model.getValueAt(selectedRowIndex, 7));
            //  jComboBox2.setSelectedItem(model.getValueAt(selectedRowIndex, 8));

            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedRowIndex, 9).toString());
            jDateChooser2.setDate(date2);

            jTextField6.setText(model.getValueAt(selectedRowIndex, 11).toString());
            jTextField7.setText(model.getValueAt(selectedRowIndex, 10).toString());
            jPasswordField2.setText(model.getValueAt(selectedRowIndex, 12).toString());

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DbUserOperations ob = new DbUserOperations();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(jDateChooser1.getDate());
        String date2 = sdf.format(jDateChooser2.getDate());
        String name = jComboBox1.getSelectedItem().toString();

        HashMap<String, Integer> map = ob.populateCombo();

        ob.updateUser(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), Integer.parseInt(jTextField4.getText()), date1, jTextField5.getText(), name, Integer.parseInt(map.get(jComboBox2.getSelectedItem()).toString()), date2, jTextField7.getText(), jTextField6.getText(), jPasswordField2.getText(), Integer.parseInt(jTextField8.getText()));
        try {
            loadTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DbUserOperations ob = new DbUserOperations();

        int result = ob.checkId(Integer.parseInt(jTextField8.getText()));

        if (result == 1) {

            try {
                ob.eraseUser(Integer.parseInt(jTextField8.getText()));
                loadTable();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(rootPane, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ID NOT FOUND!!!!");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained

        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(jPasswordField2.getText());

        if (!matcher.matches()) {

            jLabel15.setText("Password is too weak please make Strong password");

            jPasswordField2.setText("");
            jPasswordField2.requestFocus();

        } else {
            jLabel15.setText("");
        }


    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
        int length = jTextField6.getText().length();
        if (length >= 6) {

            DbUserOperations ob = new DbUserOperations();
            int result = ob.checkUserName(jTextField6.getText());
            if (result == 1) {

                jLabel9.setText("USER NAME EXISIST TRY ANOTHER");
                jTextField6.setText("");
                jTextField6.requestFocus();
            } else {
                jLabel9.setText("");
            }
        } else {
            jLabel9.setText("USERNAME LENGTH IS TO SHORT");
        }
    }//GEN-LAST:event_jTextField6FocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
       
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Search_user ob = new Search_user();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        
         Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(jTextField4.getText());

        if (!matcher.matches()) {
            
            jLabel20.setText("INVALID PHONE NUMBER");
            jTextField4.requestFocus();
            jTextField4.setText("");

        } else {
            jLabel20.setText("");
        }
        
        
    }//GEN-LAST:event_jTextField4FocusLost

    public void clearFields() {

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jPasswordField2.setText("");
        jDateChooser1.setDateFormatString("");
        jDateChooser2.setDateFormatString("");

    }

    public void loadTable() throws Exception {

        Registration ob = new Registration();
        ob.db_connect();
        String query = "SELECT * FROM registration.` user_registration_form`";
        PreparedStatement ps = ob.con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        jTable1.setModel(DbUtils.resultSetToTableModel(rs));

    }

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPasswordField jPasswordField2;
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
