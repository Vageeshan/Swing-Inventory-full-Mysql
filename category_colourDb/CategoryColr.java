/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.category_colourDb;

import com.system.DBConnection.Registration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoryColr {

    PreparedStatement ps = null;
    Statement stm = null;
    ResultSet rs = null;

    public int insertToCat(String name) {
        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "INSERT INTO `registration`.`item_category` (`category_name`) VALUES (?)";
            ps = ob.con.prepareStatement(query);
            ps.setString(1, name);
            ps.executeUpdate();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

    public int updateCategory(String name, int id) {

        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "UPDATE `registration`.`item_category` SET `category_name` = '" + name + "'  WHERE `category_id` ='" + id + "' ";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;

    }

    public int eraseCategory(int id) {

        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "DELETE FROM `registration`.`item_category` WHERE category_id = ? ";
            ps = ob.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;

    }

    public int insertToColour(String name) {
        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "INSERT INTO `registration`.`item_colour` (`colour_name`) VALUES (?)";
            ps = ob.con.prepareStatement(query);
            ps.setString(1, name);
            ps.executeUpdate();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

    public int updateColour(String name, int id) {

        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "UPDATE `registration`.`item_colour` SET `colour_name` = '" + name + "'  WHERE `colour_id` ='" + id + "' ";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;

    }

    public int eraseColour(int id) {

        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "DELETE FROM `registration`.`item_colour` WHERE colour_id = ? ";
            ps = ob.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;

    }
}
