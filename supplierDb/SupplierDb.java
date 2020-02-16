package com.system.supplierDb;

import com.system.DBConnection.Registration;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SupplierDb {

    PreparedStatement ps = null;
    Statement stm = null;
    ResultSet rs = null;

    public int insertSupplier(String f_name, String l_name, String address, int bussinuss_contact, int personal_contact, String email, String created_by, String date) {
        int status = 0;
        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query = "INSERT INTO `registration`.`supplier_details` (`first_name`,`last_name`,`address`,`bussinuss_contact`,`personal_contact`,`email_address`,`created_by`,`created_date`) VALUES (?,?,?,?,?,?,?,?)";
            ps = ob.con.prepareStatement(query);
            ps.setString(1, f_name);
            ps.setString(2, l_name);
            ps.setString(3, address);
            ps.setInt(4, bussinuss_contact);
            ps.setInt(5, personal_contact);
            ps.setString(6, email);
            ps.setString(7, created_by);

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse(date);
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());

            ps.setDate(8, sqlDate);
            ps.executeUpdate();
            status = 1;

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

    public int updateSupplier(String f_name, String l_name, String address, int bussinuss_contact, int personal_contact, String email, String created_by, String date, int id) {

        int status = 0;
        try {
            Registration ob = new Registration();
            ob.db_connect();

            String query = "UPDATE `registration`.`supplier_details` SET  `first_name` = '" + f_name + "',`last_name` = '" + l_name + "',`address` = '" + address + "', `bussinuss_contact` = '" + bussinuss_contact + "', `personal_contact` = '" + personal_contact + "', `email_address` = '" + email + "', `created_by` = '" + created_by + "', `created_date` = '" + date + "' WHERE `supplier_id` ='" + id + "'";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            status = 1;

        } catch (Exception ex) {

            System.out.println(ex.toString());
        }

        return status;
    }

    public int eraseSupplier(int id) {
        int status = 0;
        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "DELETE FROM `registration`.`supplier_details` WHERE supplier_id = '" + id + "'";
            ps = ob.con.prepareStatement(query);
            ps.executeUpdate();
            status =1;

        } catch (Exception ex) {
                System.out.println(ex);
        }

        return status;
    }

}
