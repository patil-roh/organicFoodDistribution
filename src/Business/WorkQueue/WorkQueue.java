/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRequestEventManager> workRequestCampaignList;
    public ArrayList<WorkRequestDistribution> workRequestOrderList;
    private ArrayList<WorkRequestDistribution> workRequestBillList;

    
    public WorkQueue() {
        workRequestList = new ArrayList();
        workRequestCampaignList=new ArrayList();
        workRequestOrderList=new ArrayList<WorkRequestDistribution>();
        workRequestBillList= new ArrayList<WorkRequestDistribution>();
    }
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public ArrayList<WorkRequestEventManager> getworkRequestCampaignList() {
        return workRequestCampaignList;
    }
    public ArrayList<WorkRequestDistribution> getworkRequestOrderList() {
        return workRequestOrderList;
    }
    
    public ArrayList<WorkRequestDistribution> getworkRequestBillList() {
        return workRequestBillList;
    }
}