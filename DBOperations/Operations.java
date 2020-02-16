package com.system.DBOperations;

import com.system.DBConnection.Registration;
import com.system.model.Customer;
import com.system.model.User;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operations {

    PreparedStatement ps = null;

    public int login(String user, String pass) {
        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select count(*) as access from registration.` user_registration_form` where user_name = '" + user + "' and password ='" + pass + "'";
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

    public String checkStatus(String user, String pass) {
        String status = null;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select user_status  from registration.user_details where user_name = '" + user + "' and password ='" + pass + "'";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(query);
            while (rs.next()) {
               

                status = rs.getString("user_status");
            }

            System.out.println(status);

            ob.con.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status == null ? "" : status.toString();//validation
    }

    public int userLogin(String user, String pass) {
        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select user_status_ref  from registration.user_details where user_name = '" + user + "' and password ='" + pass + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                status = rs.getInt("user_status_ref");
            }
            // val =  ((Number) rs.getObject(1)).intValue();
            System.out.println(status);
            ob.con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

    public int insertDetails(String first_name, String last_name, String address, int bussinuss_contact, int personal_contact, String email_address, String created_by, String created_date) {
        int status = 0;
        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query = "INSERT INTO `registration`.`customer_details` (`first_name`,`last_name`,`address`,`bussinuss_contact`,`personal_contact`,`email_address`,`created_by`,`created_date`) VALUES (?,?,?,?,?,?,?,?)";

            ps = ob.db_connect().prepareStatement(query);
            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, address);
            ps.setInt(4, bussinuss_contact);
            ps.setInt(5, personal_contact);
            ps.setString(6, email_address);
            ps.setString(7, created_by);

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse(created_date);
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
            ps.setDate(8, sqlDate);

            ps.executeUpdate();
            status = 1;
            ob.con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return status;
    }

    public void eraseCusDetails(int id) {

        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "DELETE FROM `registration`.`customer_details` WHERE customer_id = ?";
            ps = ob.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            ob.con.close();

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public int checkId(int id) {
        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select count(*) as access from registration.customer_details where customer_id = '" + id + "'";
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

    public ArrayList<Customer> getData() throws Exception {
        Registration ob = new Registration();
        ArrayList<Customer> list = new ArrayList<>();
        String query = "SELECT * FROM registration.customer_details";
        Statement stmt = ob.db_connect().createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {

            Customer model = new Customer();
            model.setCustomer_id(rs.getInt("customer_id"));
            model.setFirst_name(rs.getString("first_name"));
            model.setLast_name(rs.getString("last_name"));
            model.setAddress(rs.getString("address"));
            model.setBussinuss_contact(rs.getInt("bussinuss_contact"));
            model.setPersonal_contact(rs.getInt("personal_contact"));
            model.setEmail_address(rs.getString("email_address"));
            model.setCreated_by(rs.getString("created_by"));
            model.setCreated_date(rs.getString("created_date"));

            list.add(model);
        }
        ob.con.close();

        return list;
    }

    public void updateCustomer(String first_name, String last_name, String address, int bussinuss_contact, int personal_contact, String email_address, String created_by, String created_date, int customer_id) {

        try {

            Registration ob = new Registration();
            ob.db_connect();
            String query = "UPDATE `registration`.`customer_details` SET `first_name` = '" + first_name + "',`last_name` = '" + last_name + "',`address` = '" + address + "',`bussinuss_contact` = '" + bussinuss_contact + "',`personal_contact` = '" + personal_contact + "',`email_address` = '" + email_address + "' ,`created_by` = '" + created_by + "',`created_date` = '" + created_date + "' WHERE `customer_id` ='" + customer_id + "' ";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            ob.con.close();
            JOptionPane.showMessageDialog(null, "Updated Successfully!!!!");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }

    public ArrayList<User> login_list(String u_name, String pass) throws Exception {
        Registration ob = new Registration();
        ArrayList<User> list = new ArrayList<>();
        String query = "SELECT user_pri_ref_id as access , user_name FROM registration.` user_registration_form` where user_name = '" + u_name + "' and password = '" + pass + "'";
        Statement stmt = ob.db_connect().createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            User model = new User();
            model.setUser_pri_ref_id(rs.getInt("access"));
            model.setUser_name(rs.getString("user_name"));
            list.add(model);

        }
        ob.con.close();

        return list;
    }

    public int checkqty(int itemCode) {
        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select Quantity  from registration.stock_details where item_code_ref = '" + itemCode + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                status = rs.getInt("Quantity");
            }
            
            ob.con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

}
