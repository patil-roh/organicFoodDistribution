/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NutritionRole;
import Business.Role.Role;
import Business.Role.WarehouseRole;
import java.util.ArrayList;

/**
 *
 * @author arpit
 */
public class WarehouseOrganization extends Organization{
    
    public WarehouseOrganization() {
        super(Organization.Type.Warehouse.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarehouseRole());
        return roles;
    }
    
}
