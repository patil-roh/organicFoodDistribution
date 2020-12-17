/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EventManagementRole.EventManagementWorkAreaJPanel;

/**
 *
 * @author Rashmi Patil
 */
public class EventManagementRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EventManagementWorkAreaJPanel(userProcessContainer, account, (EventManagementOrganization)organization, enterprise
        );
    }
    
    
}
