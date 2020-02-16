
package com.system.model;


public class Purchase_model {
    
   private int purchase_code;
   private int item_code;
   private int purchase_maseter_ref;
   private String item_name;
   private int quantity;
   private double total;

    /**
     * @return the purchase_code
     */
    public int getPurchase_code() {
        return purchase_code;
    }

    /**
     * @param purchase_code the purchase_code to set
     */
    public void setPurchase_code(int purchase_code) {
        this.purchase_code = purchase_code;
    }

    /**
     * @return the item_code
     */
    public int getItem_code() {
        return item_code;
    }

    /**
     * @param item_code the item_code to set
     */
    public void setItem_code(int item_code) {
        this.item_code = item_code;
    }

    /**
     * @return the purchase_maseter_ref
     */
    public int getPurchase_maseter_ref() {
        return purchase_maseter_ref;
    }

    /**
     * @param purchase_maseter_ref the purchase_maseter_ref to set
     */
    public void setPurchase_maseter_ref(int purchase_maseter_ref) {
        this.purchase_maseter_ref = purchase_maseter_ref;
    }

    /**
     * @return the item_name
     */
    public String getItem_name() {
        return item_name;
    }

    /**
     * @param item_name the item_name to set
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
