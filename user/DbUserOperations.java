package com.system.user;

import com.system.DBConnection.Registration;
import com.system.model.User;
import com.system.model.User_privillage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DbUserOperations {

    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insert_toUser(String first_name, String last_name, String address, int contact_number, String dob, String email, String user_status, int user_pri_ref_id, String created_date, String created_by, String user_name, String password) {

        try {
            Registration ob = new Registration();
            ob.db_connect();

            String query = "INSERT INTO `registration`.` user_registration_form` (`first_name`,`last_name`,`address`,`contact_number`,`dob`,`email`,`user_status`,`user_pri_ref_id`,`created_date`,`created_by`,`user_name`,`password`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = ob.con.prepareStatement(query);

            ps.setString(1, first_name);
            ps.setString(2, last_name);
            ps.setString(3, address);
            ps.setInt(4, contact_number);

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse(dob);
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());

            ps.setDate(5, sqlDate);

            ps.setString(6, email);
            ps.setString(7, user_status);
            ps.setInt(8, user_pri_ref_id);

            Date parsed2 = format.parse(created_date);
            java.sql.Date sqlDate2 = new java.sql.Date(parsed2.getTime());

            ps.setDate(9, sqlDate2);

            ps.setString(10, created_by);
            ps.setString(11, user_name);
            ps.setString(12, password);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "New User Added");
            System.out.println("Data inserted");
            ob.con.close();

        } catch (Exception ex) {

            System.out.println("User data insert" + ex.toString());
        }

    }

    public HashMap<String, Integer> populateCombo() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Registration ob = new Registration();
        Connection con = ob.db_connect();
        Statement st;

        try {
            st = con.createStatement();

            String query = "SELECT * FROM test.user_privillage";
            rs = st.executeQuery(query);
            User_privillage up;

            while (rs.next()) {

                up = new User_privillage(rs.getInt(1), rs.getString(2));
                map.put(up.getStatus_level(), up.getPri_id());

            }
            ob.con.close();
        } catch (Exception ex) {

            System.out.println("Combo box" + ex.toString());

        }

        return map;
    }

    public int userLogin(String user, String pass) {
        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select user_pri_ref_id as access  from  registration.` user_registration_form` where user_name = '" + user + "' and password ='" + pass + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                status = rs.getInt("access");
            }
            //val =  ((Number) rs.getObject(1)).intValue();
            System.out.println(status);
            ob.con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return status;
    }

    public void updateUser(String first_name, String last_name, String address, int contact_number, String dob, String email, String user_status, int user_pri_ref_id, String created_date, String created_by, String user_name, String password, int user_id) {

        Registration ob = new Registration();
        ob.db_connect();

        String query = "UPDATE `registration`.` user_registration_form` SET `first_name` = '" + first_name + "', `last_name` ='" + last_name + "' , `address` = '" + address + "', `contact_number` = '" + contact_number + "', `dob` ='" + dob + "' , `email` = '" + email + "', `user_status` ='" + user_status + "' , `user_pri_ref_id` = '" + user_pri_ref_id + "', `created_date` = '" + created_date + "', `created_by` ='" + created_by + "', `user_name` ='" + user_name + "' , `password` = '" + password + "'  WHERE `user_id` = '" + user_id + "' ";
        try {
            ps = ob.con.prepareStatement(query);
            ps.execute();
            ob.con.close();
            JOptionPane.showMessageDialog(null, "Updated");
        } catch (SQLException ex) {
            Logger.getLogger(DbUserOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eraseUser(int user_id) throws Exception {

        Registration ob = new Registration();
        ob.db_connect();
        String query = "DELETE FROM registration.` user_registration_form` WHERE user_id = ? ";
        ps = ob.con.prepareStatement(query);
        ps.setInt(1, user_id);
        ps.executeUpdate();
        ob.con.close();
        JOptionPane.showMessageDialog(null, "USER DELETED");
    }

    public int checkId(int user_id) {

        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select count(*) as access from registration.` user_registration_form` where user_id = '" + user_id + "'";
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

    public ArrayList<User> login_list(String u_name, String pass) throws Exception {

        Registration ob = new Registration();
        ArrayList<User> list = new ArrayList<>();
        String query = "SELECT user_pri_ref_id as access , user_name FROM registration.` user_registration_form` where user_name = '" + u_name + "' and password = '" + pass + "'";
        Statement stmt = ob.db_connect().createStatement();
        rs = stmt.executeQuery(query);

        while (rs.next()) {
            User model = new User();
            model.setUser_pri_ref_id(rs.getInt("access"));
            model.setUser_name(rs.getString("user_name"));
            list.add(model);

        }
        ob.con.close();

        return list;
    }

    public void insertLogin_logs(String user_name, String login_time, String date) {

        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query = "INSERT INTO `registration`.`login_logs` (`user_name`,"
                    + "`date`,`login_time`) VALUES (?,?,?)";
            ps = ob.con.prepareStatement(query);
            ps.setString(1, user_name);

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsed = format.parse(date);
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());
            ps.setDate(2, sqlDate);

            ps.setString(3, login_time);
            ps.executeUpdate();
            System.out.println("Log added");
            ob.con.close();

        } catch (Exception ex) {

            System.out.println(ex.toString());
        }

    }

    public void update_LogoutLogs(String logout_time) {

        try {
            Registration ob = new Registration();
            ob.db_connect();
            String query = " update `registration`.`login_logs` "
                    + "set logout_time = '" + logout_time + "'"
                    + " where log_code order by log_code desc limit 1";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            System.out.println("logout added");
            ob.con.close();

        } catch (Exception ex) {

            System.out.println("logout" + ex.toString());
        }

    }

    public int checkUserName(String user_name) {
        int status = 0;

        try {
            Registration ob = new Registration();
            ob.db_connect();
            Statement stmt = ob.con.createStatement();
            String query = "select count(*) as access from registration.` user_registration_form` where user_name = '" + user_name + "'";
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
    public int Update_password (String user_name, String password){
    
        int status = 1;
        
        Registration ob = new Registration();
        ob.db_connect();
        try {
        
            String query = "update registration.` user_registration_form` set password = '"+password+"' where user_name = '"+user_name+"'";
            ps = ob.con.prepareStatement(query);
            ps.execute();
            status = 1;
        }
        catch (Exception ex){
        
            ex.toString();
        }
    
    
    
    return status;
    }


}
