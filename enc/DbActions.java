/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.enc;

import com.system.test.DbOperations;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DbActions {

    public int login(String user, String pass) {
        int status = 0;

        DbOperations ob = new DbOperations();
        try {

            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select count(*) as access from test.user where user_name = '" + user + "' and u_password ='" + pass + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                status = rs.getInt("access");
            }
            // val =  ((Number) rs.getObject(1)).intValue();
            System.out.println(status);
            ob.con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

    public void insert(String user, String pass) {

        DbOperations ob = new DbOperations();
        ob.db_connect();

        String sql = "INSERT INTO test.user (`user_name`,`u_password`) VALUES (?,?)";
        try {
            PreparedStatement ps = ob.con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
            System.out.println("Data inserted");
            ob.con.close();

        } catch (SQLException ex) {
            Logger.getLogger(DbActions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
