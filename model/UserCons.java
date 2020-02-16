/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.model;

/**
 *
 * @author PC
 */
public class UserCons {

    private int user_id;
    private String first_name;
    private String last_name;
    private String address;
    private int contact_number;
    private String dob;
    private String email;
    private String user_status;
    private int user_pri_ref_id;
    private String created_date;
    private String created_by;
    private String user_name;
    private String password;

    public UserCons(int user_id, String first_name, String last_name, String address, int contact_number, String dob, String email, String user_status, int user_pri_ref_id, String created_date, String created_by, String user_name, String password) {

        this.user_id = user_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.contact_number = contact_number;
        this.dob = dob;
        this.email = email;
        this.user_status = user_status;
        this.user_pri_ref_id = user_pri_ref_id;
        this.created_date = created_date;
        this.created_by = created_by;
        this.user_name = user_name;
        this.password = password;

    }

    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact_number
     */
    public int getContact_number() {
        return contact_number;
    }

    /**
     * @param contact_number the contact_number to set
     */
    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the user_status
     */
    public String getUser_status() {
        return user_status;
    }

    /**
     * @param user_status the user_status to set
     */
    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    /**
     * @return the user_pri_ref_id
     */
    public int getUser_pri_ref_id() {
        return user_pri_ref_id;
    }

    /**
     * @param user_pri_ref_id the user_pri_ref_id to set
     */
    public void setUser_pri_ref_id(int user_pri_ref_id) {
        this.user_pri_ref_id = user_pri_ref_id;
    }

    /**
     * @return the created_date
     */
    public String getCreated_date() {
        return created_date;
    }

    /**
     * @param created_date the created_date to set
     */
    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    /**
     * @return the created_by
     */
    public String getCreated_by() {
        return created_by;
    }

    /**
     * @param created_by the created_by to set
     */
    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
