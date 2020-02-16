package com.system.stock;

import com.system.DBConnection.Registration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StockDb {

    PreparedStatement ps, ps2, ps3 = null;
    ResultSet rs = null;

    public int inserttoStock(int itemcode, int qty) {

        int status = 0;
        Registration ob = new Registration();
        ob.db_connect();
        try {

            String sql = "SELECT * FROM registration.stock_details where item_code_ref = ?";
            ps2 = ob.con.prepareStatement(sql);
            ps2.setInt(1, itemcode);
            rs = ps2.executeQuery();

            if (rs.next()) {
                String query = "update registration.stock_details set "
                        + "Quantity = Quantity + '" + qty + "' where item_code_ref = '" + itemcode + "'";
                ps = ob.con.prepareStatement(query);
                ps.execute();
                status = 1;
            } else {
                String query2 = "INSERT INTO `registration`.`stock_details` (`item_code_ref`,`Quantity`) VALUES (?,?)";
                ps3 = ob.con.prepareStatement(query2);
                ps3.setInt(1, itemcode);
                ps3.setInt(2, qty);
                ps3.executeUpdate();
                status = 2;
                ob.con.close();
            }

        } catch (Exception ex) {

            System.out.println(ex.toString());

        }

        return status;
    }

    public int deductfromStock(int itemcode, int qty) {

        int status = 0;
        Registration ob = new Registration();
        ob.db_connect();
        String sql = "SELECT * FROM registration.stock_details where item_code_ref = ?";

        try {
            ps2 = ob.con.prepareStatement(sql);
            ps2.setInt(1, itemcode);
            rs = ps2.executeQuery();
            if (rs.next()) {
                int dbqty = rs.getInt("Quantity");
                System.out.println("QTY : " + dbqty);
                if (qty == 0) {

                    status = 4;
                } else {
                    if (dbqty >= qty) {
                        String query = "update registration.stock_details set Quantity = Quantity - '" + qty + "' where item_code_ref = '" + itemcode + "'";
                        ps = ob.con.prepareStatement(query);
                        ps.execute();
                        status = 1;
                    } else {
                        status = 3;
                    }
                }

            } else {

                status = 2;
                ob.con.close();

            }

        } catch (Exception ex) {

            System.out.println(ex.toString());

        }

        return status;
    }

    public int updateStock(int itemcode, int qty) {

        int status = 0;
        Registration ob = new Registration();
        ob.db_connect();
        try {
            String query = "update registration.stock_details set Quantity = '" + qty + "' where item_code_ref = '" + itemcode + "'";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            status = 1;
            ob.con.close();

        } catch (Exception ex) {

            System.out.println(ex.toString());

        }

        return status;
    }

    public int deleteStock(int itemcode) {

        int status = 0;
        Registration ob = new Registration();
        ob.db_connect();
        try {
            String query = "DELETE FROM `registration`.`stock_details` "
                    + "WHERE item_code_ref = '" + itemcode + "' ";
            ps = ob.con.prepareStatement(query);
            ps.executeUpdate();
            status = 1;
            ob.con.close();

        } catch (Exception ex) {

            System.out.println(ex.toString());

        }

        return status;
    }

}
