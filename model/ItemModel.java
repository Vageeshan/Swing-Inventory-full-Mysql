package com.system.model;

public class ItemModel {

    private int item_code;
    private String item_name;
    private String item_category;
    private String item_colour;
    private String item_capacity;
    private double buying_price;
    private double selling_price;

    public ItemModel(int item_code, String item_name, String item_category, String item_colour, String item_capacity, double buying_price, double selling_price) {

        this.item_code = item_code;
        this.item_name = item_name;
        this.item_category = item_category;
        this.item_colour = item_colour;
        this.item_capacity = item_capacity;
        this.buying_price = buying_price;
        this.selling_price = selling_price;

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
     * @return the item_category
     */
    public String getItem_category() {
        return item_category;
    }

    /**
     * @param item_category the item_category to set
     */
    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    /**
     * @return the item_colour
     */
    public String getItem_colour() {
        return item_colour;
    }

    /**
     * @param item_colour the item_colour to set
     */
    public void setItem_colour(String item_colour) {
        this.item_colour = item_colour;
    }

    /**
     * @return the item_capacity
     */
    public String getItem_capacity() {
        return item_capacity;
    }

    /**
     * @param item_capacity the item_capacity to set
     */
    public void setItem_capacity(String item_capacity) {
        this.item_capacity = item_capacity;
    }

    /**
     * @return the buying_price
     */
    public double getBuying_price() {
        return buying_price;
    }

    /**
     * @param buying_price the buying_price to set
     */
    public void setBuying_price(double buying_price) {
        this.buying_price = buying_price;
    }

    /**
     * @return the selling_price
     */
    public double getSelling_price() {
        return selling_price;
    }

    /**
     * @param selling_price the selling_price to set
     */
    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

}
