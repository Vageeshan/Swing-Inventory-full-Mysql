package com.system.item;

import com.system.DBConnection.Registration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemDb {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement stmt = null;

    public int insertItem(String name, String category, String color, String capacity, double buy_price, double sell_price) {
        int status = 0;
        try {
            Registration ob = new Registration();
            ob.db_connect();

            String query = "INSERT INTO `registration`.`item_details` (`item_name`,`item_category`,`item_colour`,`item_capacity`,`buying_price`,`selling_price`) VALUES (?,?,?,?,?,?)";
            ps = ob.con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setString(3, color);
            ps.setString(4, capacity);
            ps.setDouble(5, buy_price);
            ps.setDouble(6, sell_price);
            ps.executeUpdate();
            status = 1;
            ob.con.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return status;
    }

    public int updateItem(String name, String category, String color, String capacity, double buy_price, double sell_price, int id) {
        int status = 0;

        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "UPDATE `registration`.`item_details` SET  `item_name` = '" + name + "',`item_category` ='" + category + "',`item_colour` = '" + color + "',`item_capacity` ='" + capacity + "' ,`buying_price` = '" + buy_price + "',`selling_price` ='" + sell_price + "'  WHERE `item_code` = '" + id + "' ";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            status = 1;
            ob.con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ItemDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public int eraseItem(int id) {

        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();

            String query = "DELETE FROM `registration`.`item_details` WHERE item_code = ?";
            ps = ob.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            status = 1;
            ob.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public int checkId(int id) throws Exception {

        int status = 0;
        Registration ob = new Registration();
        ob.db_connect();

        stmt = ob.con.createStatement();
        String query = "select count(*) as access from registration.item_details where item_code = '" + id + "'";
        rs = stmt.executeQuery(query);

        while (rs.next()) {
            status = rs.getInt("access");

        }

        ob.con.close();

        return status;
    }

    public int eraseBillRecords(String date, int customer_id) {

        int status = 0;
        Registration ob = new Registration();
        ob.db_connect();
        try {
            String query = "select * from sale_master where customer_id_ref = ? and bill_date = ?";
            ps = ob.con.prepareStatement(query);
            ps.setInt(1, customer_id);
            ps.setString(2, date);
            rs = ps.executeQuery();
            System.out.println("1");
            if (rs.next()) {

                String query2 = "delete from sale_details where sale_masterId_ref = (select (sale_master_id) from sale_master where bill_date = '" + date + "' and customer_id_ref = '" + customer_id + "')";
                PreparedStatement ps2 = ob.con.prepareStatement(query2);
                ps2.executeUpdate();
                System.out.println("2");
                String query3 = "delete from sale_master where customer_id_ref = '" + customer_id + "' and bill_date = '" + date + "'";
                PreparedStatement ps3 = ob.con.prepareStatement(query3);
                ps3.executeUpdate();
                status = 1;

            } else {
                status = 2;
            }

        } catch (Exception ex) {

            System.out.println(ex.toString());
        }
        System.out.println("status : "+status);
        return status;
    }

}
