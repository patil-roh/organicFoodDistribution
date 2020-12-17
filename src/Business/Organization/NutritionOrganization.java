/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NutritionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rashmi Patil
 */
public class NutritionOrganization extends Organization{

    public NutritionOrganization() {
        super(Organization.Type.Nutrition.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NutritionRole());
        return roles;
    }
}
