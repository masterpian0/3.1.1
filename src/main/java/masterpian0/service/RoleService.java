package masterpian0.service;

import masterpian0.model.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    List<Role> getRoles();

    Role getRoleById(long id);

    Role getRoleByName(String rolename);
}
