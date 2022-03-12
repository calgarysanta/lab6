package ca.sait.lab6.services;

import ca.sait.lab6.dataaccess.RoleDB;
import ca.sait.lab6.models.Role;
import java.util.List;

/**
 *
 * @author YEON
 */
public class RoleService {
    private RoleDB roleDB = new RoleDB();
    
    public List<Role> getAll() throws Exception {
        List<Role> roles = roleDB.getAll();
        return roles;
    }
 
        public String getName(int roleId) throws Exception {
        String name = this.roleDB.getName(roleId);
        return name;
    }
    
}