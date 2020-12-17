/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.UserAccount.UserAccount;
import java.util.Date;
/**
 *
 * @author HP
 */
public abstract class WorkRequestEventManager {
    private String message;
    private UserAccount sender;
    private UserAccount receiver_nutritionist;
    private String status;
//    private Date requestDate;
    
    private String requestDate;
    
    private Date resolveDate;
    private String venue;
   
    
    public WorkRequestEventManager(){
        //requestDate = new Date();
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public UserAccount getSender() {
        return sender;
    }
    public void setSender(UserAccount sender) {
        this.sender = sender;
    }
    public UserAccount getReceiver_nutritionist() {
        return receiver_nutritionist;
    }
    public void setReceiver_nutritionist(UserAccount receiver_nutritionist) {
        this.receiver_nutritionist = receiver_nutritionist;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
//    public Date getRequestDate() {
//        return requestDate;
//    }
//    public void setRequestDate(Date requestDate) {
//        this.requestDate = requestDate;
//    }
    
    public String getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
    
    public Date getResolveDate() {
        return resolveDate;
    }
    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}