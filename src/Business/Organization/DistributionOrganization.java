/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rashmi Patil
 */    

public class DistributionOrganization extends Organization{

    public DistributionOrganization() {
        super(Organization.Type.Distribution.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributionRole());
        return roles;
    }
}