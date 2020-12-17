/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Distribution.getValue())){
            organization = new DistributionOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Billing.getValue())){
            organization = new BillingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.EventManagement.getValue())){
            organization = new EventManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nutrition.getValue())){
            organization = new NutritionOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Warehouse.getValue())){
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}