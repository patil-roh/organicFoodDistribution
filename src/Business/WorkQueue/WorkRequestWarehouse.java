/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author arpit
 */
public class WorkRequestWarehouse {
     private String productName;
    //private boolean status;
    private int quantity;
    private String addNote;
    private int orderStatus=0;
    private String managerNote;
    
     
    int orderflag;
    
    

    public String getManagerNote() {
        return managerNote;
    }

    public void setManagerNote(String managerNote) {
        this.managerNote = managerNote;
    }
   
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddNote() {
        return addNote;
    }

    public void setAddNote(String addNote) {
        this.addNote = addNote;
    }
    
    public int isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    
    public int getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(int orderflag) {
        this.orderflag = orderflag;
    }
}
