
package com.system.model;


public class User_privillage {
    
    private int pri_id;
    private String status_level;
    
    
    public User_privillage (int pri_id ,String status_level){
    
        this.pri_id = pri_id;
        this.status_level = status_level;
    }

    /**
     * @return the pri_id
     */
    public int getPri_id() {
        return pri_id;
    }

    /**
     * @param pri_id the pri_id to set
     */
    public void setPri_id(int pri_id) {
        this.pri_id = pri_id;
    }

    /**
     * @return the status_level
     */
    public String getStatus_level() {
        return status_level;
    }

    /**
     * @param status_level the status_level to set
     */
    public void setStatus_level(String status_level) {
        this.status_level = status_level;
    }
    
    
    
    
}
