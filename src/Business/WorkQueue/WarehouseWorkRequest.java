/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arpit
 */
public class WarehouseWorkRequest extends WorkRequestDistribution{
    
    
    private String managerNote;
    
     
    int orderflag;
    
    

    public String getManagerNote() {
        return managerNote;
    }

    public void setManagerNote(String managerNote) {
        this.managerNote = managerNote;
    }

    public int getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(int orderflag) {
        this.orderflag = orderflag;
    }
    
    
    
    public WarehouseWorkRequest(){
        productPrice = new HashMap<String,Integer>();
        
        productPrice.put("EGGPLANT",2);
        productPrice.put("ONION",4);
        productPrice.put("CUCUMBER",2);
        productPrice.put("APPLE",5);
        productPrice.put("RASPBERRY",5);
        productPrice.put("GREEN GRAM",8);
        productPrice.put("CHICKPEA",9);
        productPrice.put("WALNUT",11);
        productPrice.put("MUSHROOM",4);
        productPrice.put("EGG",2);
        
    }
    
    public Map<String,Integer> productPrice;
    

    public Map<String, Integer> getProductPrice() {
        return productPrice;
    }

    int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
        super.setTotalprice((int) totalPrice);
    }
    
}
