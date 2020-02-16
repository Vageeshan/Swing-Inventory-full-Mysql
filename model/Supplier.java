package com.system.model;

public class Supplier {

    private int supplier_id;
    private String first_name;
    private String last_name;
    private String address;
    private int bussinuss_contact;
    private int personal_contact;
    private String email_address;
    private String created_by;
    private String created_date;

    public Supplier(int supplier_id, String first_name, String last_name, String address, int bussinuss_contact, int personal_contact, String email_address, String created_by, String created_date) {

        this.supplier_id = supplier_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.bussinuss_contact = bussinuss_contact;
        this.personal_contact = personal_contact;
        this.email_address = email_address;
        this.created_by = created_by;
        this.created_date = created_date;

    }

    /**
     * @return the supplier_id
     */
    public int getSupplier_id() {
        return supplier_id;
    }

    /**
     * @param supplier_id the supplier_id to set
     */
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
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
     * @return the bussinuss_contact
     */
    public int getBussinuss_contact() {
        return bussinuss_contact;
    }

    /**
     * @param bussinuss_contact the bussinuss_contact to set
     */
    public void setBussinuss_contact(int bussinuss_contact) {
        this.bussinuss_contact = bussinuss_contact;
    }

    /**
     * @return the personal_contact
     */
    public int getPersonal_contact() {
        return personal_contact;
    }

    /**
     * @param personal_contact the personal_contact to set
     */
    public void setPersonal_contact(int personal_contact) {
        this.personal_contact = personal_contact;
    }

    /**
     * @return the email_address
     */
    public String getEmail_address() {
        return email_address;
    }

    /**
     * @param email_address the email_address to set
     */
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
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

}
