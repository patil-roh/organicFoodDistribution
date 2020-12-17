/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DistributionOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WarehouseRole.WarehouseWorkAreaJPanel;
/**
 *
 * @author arpit
 */
public class WarehouseRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WarehouseWorkAreaJPanel(userProcessContainer, account, (WarehouseOrganization)organization, enterprise,business);
    }
    
}