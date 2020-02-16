/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Registration {

    public Connection con = null;

    public Connection db_connect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/registration", "root", "root");
             System.out.println("DB connected");
              System.out.println("DB Name : "+con.getCatalog());
             
        } catch (Exception ex) {
            System.out.println("Error :" + ex.toString());
        }
        return con;
    }

    public static void main(String[] args) {
        try {
            Registration ob = new Registration();
            ob.db_connect();

            /*   java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            
            System.out.println("sqlDate:" + sqlDate);
            System.out.println("Time" + LocalDateTime.now());
            System.out.println("Time" + ZonedDateTime.now());
            String time2 = LocalDateTime.now().toString();
            System.out.println("string time : " + time2);
            
            Date currentDate = new Date();
            SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss a");
            String time = timeformat.format(currentDate);
            System.out.println("Time is : " + time);*/
            Date currentDate = new Date();
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String date = format1.format(currentDate);
            try {
                Date parsed = format1.parse(date);
            } catch (ParseException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
            // System.out.println("date  " + date);

            Date currentDate1 = new Date();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = format1.format(currentDate1);
            Date parsed = format.parse(date1);
            java.sql.Date sqlDate = new java.sql.Date(parsed.getTime());

        } catch (ParseException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
