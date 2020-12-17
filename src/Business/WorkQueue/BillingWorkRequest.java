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
public class BillingWorkRequest extends WarehouseWorkRequest{
    
    private String managerNote;
    
     
    int orderflag;
    
    

    public String getManagerNote() {
        return managerNote;
    }

    public void setManagerNote(String managerNote) {
        this.managerNote = managerNote;
    }
    
    
    
    
}
